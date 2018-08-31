package controllers;

/*
    X000139473
    Ben O'Flaherty
*/
import play.mvc.*;
import views.html.*;

import play.api.Environment;
import play.data.*;
import play.db.ebean.Transactional;

import play.mvc.Http.*;
import play.mvc.Http.MultipartFormData.FilePart;
import java.io.File;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

import org.im4java.core.ConvertCmd;
import org.im4java.core.IMOperation;

import models.*;
import models.users.*;
/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    private FormFactory formFactory;
    private Environment e;

    @Inject 
    public HomeController(FormFactory f, Environment env) {
        this.e = env;
        this.formFactory = f;
    }


    public Result index() {

        List<Client> clientList = Client.findAll();

        return ok(index.render(clientList, User.getUserById(session().get("email")), e));
    }

    public Result about() {
        return ok(about.render(User.getUserById(session().get("email"))));
    }

    public Result addClient(){

        Form<Client> clientForm = formFactory.form(Client.class);

        return ok(addClient.render(clientForm, User.getUserById(session().get("email"))));
    }

    
    public Result addClientSubmit(){

        Client newClient;
        String saveImageMsg;
        Address address = new Address();
        CV cv = new CV();

        Form<Client> newClientForm = formFactory.form(Client.class).bindFromRequest();

        if(newClientForm.hasErrors()){
            return badRequest(addClient.render(newClientForm,User.getUserById(session().get("email"))));
        } else {
            newClient = newClientForm.get();
            
            if (newClient.getId() == null){
                newClient.save();
            }
            else if (newClient.getId() != null) {
                newClient.update();
            }

            String addName = newClientForm.field("address.addName").getValue().get();
            String eirCode = newClientForm.field("address.eirCode").getValue().get();
            address.setAddressName(addName);
            address.seteirCode(eirCode);
            address.save();

            newClient.setAddress(address);                   
            newClient.update();  

            String cvName = newClientForm.field("cv.cvName").getValue().get();
            String objective = newClientForm.field("cv.objective").getValue().get();
            String education = newClientForm.field("cv.education").getValue().get();
            String workExperience = newClientForm.field("cv.workExperience").getValue().get();
            cv.setCVName(cvName);
            cv.setCVObjective(objective);
            cv.setCVEducation(education);
            cv.setCVExperience(workExperience);
            cv.save();

            newClient.setCV(cv);                   
            newClient.update();  

            MultipartFormData data = request().body().asMultipartFormData();
            FilePart image = data.getFile("upload");

            saveImageMsg = saveFile(newClient.getId(), image);

            flash("success", "Client " + newClient.getName() + " was added" + saveImageMsg);

            return redirect(controllers.routes.HomeController.index());

        }
    }

    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result deleteClient(Long id) {
        
        Client.find.ref(id).delete();

        flash("success", "Client has been removed");

        return redirect(routes.HomeController.index());
    }
    
    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result updateClient(Long id){

        Client c;
        Form<Client> clientForm;
        try {
            c = Client.find.byId(id);

            clientForm = formFactory.form(Client.class).fill(c);
            
        } catch (Exception ex) {
            return badRequest("error");
        }

        return ok(addClient.render(clientForm, User.getUserById(session().get("email"))));
    }

    public String saveFile(Long id, FilePart<File> uploaded) {
        // make sure that the file exists
        if (uploaded != null) {
            // make sure that the content is indeed an image
            String mimeType = uploaded.getContentType(); 
            if (mimeType.startsWith("image/")) {
                // get the file name
                String fileName = uploaded.getFilename();                
                // save the file object (created without a path, File saves
                // the content to a default location, usually the temp or tmp
                // directory)
                File file = uploaded.getFile();
                // create an ImageMagik operation - this object is used to specify
                // the required image processing
                IMOperation op = new IMOperation();
                // add the uploaded image to the operationop.addImage(file.getAbsolutePath());
                op.addImage(file.getAbsolutePath());
                // resize the image using height and width saveFileOld(Long id, FilePart<File> uploaded) {
                op.resize(300, 200);
                // save the image as jpg 
                op.addImage("public/images/clientImages/" + id + ".jpg");
                // create another Image Magick operation and repeat the process above to
                // specify how a thumbnail image should be processed - size 60px
                IMOperation thumb = new IMOperation();
                thumb.addImage(file.getAbsolutePath());
                thumb.resize(60);
                thumb.addImage("public/images/clientImages/thumbnails/" + id + ".jpg");
                // we must make sure that the directories exist before running the operations
                File dir = new File("public/images/clientImages/thumbnails/");
                if (!dir.exists()) {
                    dir.mkdirs();
                }
                // now we create an Image Magick command and execute the operations
                ConvertCmd cmd = new ConvertCmd();
                try {
                    cmd.run(op);
                    cmd.run(thumb);
                } catch(Exception e) {
                    e.printStackTrace();
                }
                return " and image saved";
            }
        }
        return "/ no file";
    }

    public Result clientDetails(Long id) {
        Client cli;

       cli = Client.find.byId(id);
            
        return ok(clientDetails.render(cli,User.getUserById(session().get("email")),e));
    }

}

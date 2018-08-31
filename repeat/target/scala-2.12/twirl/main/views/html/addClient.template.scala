
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object addClient extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.Client],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(clientForm: Form[models.Client], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.60*/("""

"""),format.raw/*4.1*/("""

"""),_display_(/*6.2*/main("Add Client", user)/*6.26*/{_display_(Seq[Any](format.raw/*6.27*/("""
    """),format.raw/*7.5*/("""<p class="lead"> Add a new client</p>

    """),_display_(/*9.6*/form(action=routes.HomeController.addClientSubmit(), 'class -> "form-horizontal", 'role -> "form", 'enctype -> "multipart/form-data")/*9.139*/{_display_(Seq[Any](format.raw/*9.140*/("""

    """),_display_(/*11.6*/CSRF/*11.10*/.formField),format.raw/*11.20*/("""


    """),_display_(/*14.6*/inputText(clientForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*14.80*/("""
    """),_display_(/*15.6*/inputText(clientForm("description"), '_label -> "Description", 'class -> "form-control")),format.raw/*15.94*/("""
    """),_display_(/*16.6*/inputText(clientForm("address.addName"), '_label -> "Address: ", 'class -> "form-control")),format.raw/*16.96*/("""
    """),_display_(/*17.6*/inputText(clientForm("address.eirCode"), '_label -> "Eircode: ", 'class -> "form-control")),format.raw/*17.96*/("""
    """),_display_(/*18.6*/inputText(clientForm("cv.cvName"), '_label -> "CV Name", 'class -> "form-control")),format.raw/*18.88*/("""
    """),_display_(/*19.6*/inputText(clientForm("cv.objective"), '_label -> "Objective", 'class -> "form-control")),format.raw/*19.93*/("""
    """),_display_(/*20.6*/inputText(clientForm("cv.education"), '_label -> "Education", 'class -> "form-control")),format.raw/*20.93*/("""
    """),_display_(/*21.6*/inputText(clientForm("cv.workExperience"), '_label -> "Work experience", 'class -> "form-control")),format.raw/*21.104*/("""

    """),_display_(/*23.6*/inputText(clientForm("id"),'label -> "", 'hidden -> "hidden")),format.raw/*23.67*/("""

    """),format.raw/*25.5*/("""<label>Upload an client image</label>
    <input class="btn-sm btn-default" type="file" name="upload">
    <br><br>

    <div class="actions">
        <input type ="submit" value="add/UpdateClient" class="btn btn-primary">
        <a href=""""),_display_(/*31.19*/routes/*31.25*/.HomeController.index),format.raw/*31.46*/("""">
            <button type="button" class="btn btn-warning">Cancel</button>
        </a>
    </div>
""")))}),format.raw/*35.2*/("""
""")))}),format.raw/*36.2*/("""
"""))
      }
    }
  }

  def render(clientForm:Form[models.Client],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(clientForm,user)

  def f:((Form[models.Client],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (clientForm,user) => apply(clientForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Aug 30 22:53:16 IST 2018
                  SOURCE: /home/wdd/webapps/RepeatCA1/repeat/app/views/addClient.scala.html
                  HASH: 12b8e797924d4d0d73e32ab29bc1568fc1247730
                  MATRIX: 983->1|1114->62|1159->59|1187->78|1215->81|1247->105|1285->106|1316->111|1385->155|1527->288|1566->289|1599->296|1612->300|1643->310|1677->318|1772->392|1804->398|1913->486|1945->492|2056->582|2088->588|2199->678|2231->684|2334->766|2366->772|2474->859|2506->865|2614->952|2646->958|2766->1056|2799->1063|2881->1124|2914->1130|3182->1371|3197->1377|3239->1398|3371->1500|3403->1502
                  LINES: 28->1|31->3|34->1|36->4|38->6|38->6|38->6|39->7|41->9|41->9|41->9|43->11|43->11|43->11|46->14|46->14|47->15|47->15|48->16|48->16|49->17|49->17|50->18|50->18|51->19|51->19|52->20|52->20|53->21|53->21|55->23|55->23|57->25|63->31|63->31|63->31|67->35|68->36
                  -- GENERATED --
              */
          

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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[models.Client],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(clients: List[models.Client], user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.84*/("""

"""),_display_(/*3.2*/main("Client Page", user)/*3.27*/ {_display_(Seq[Any](format.raw/*3.29*/("""
  
  """),format.raw/*5.3*/("""<p class="lead">Clients</p>
  
  """),_display_(/*7.4*/if(flash.containsKey("success"))/*7.36*/{_display_(Seq[Any](format.raw/*7.37*/("""
    """),format.raw/*8.5*/("""<div class="alert alert-success">
      """),_display_(/*9.8*/flash/*9.13*/.get("success")),format.raw/*9.28*/("""
    """),format.raw/*10.5*/("""</div>
  """)))}),format.raw/*11.4*/("""
  """),format.raw/*12.3*/("""<table class="table table-bordered table-hover table-condensed">
  
  <thead>
  
  <!-- The header row-->
  
  <tr>
     <th>Image</th>
     <th>ID</th>
     <th>Client Name</th>
     <th>Description</th>
     <th>Address</th>
     <th>CV</th>
  </tr>
  
  </thead>
  
  <tbody>
  
  <!-- Client row(s) -->
  
  <tr>
    """),_display_(/*34.6*/for(c<-clients) yield /*34.21*/ {_display_(Seq[Any](format.raw/*34.23*/("""
      """),format.raw/*35.7*/("""<tr>
          """),_display_(/*36.12*/if(env.resource("public/images/clientImages/thumbnails/" + c.getId + ".jpg").isDefined)/*36.99*/ {_display_(Seq[Any](format.raw/*36.101*/("""
            """),format.raw/*37.13*/("""<td><img src="/assets/images/clientImages/thumbnails/"""),_display_(/*37.67*/(c.getId + ".jpg")),format.raw/*37.85*/(""""/></td>
        """)))}/*38.11*/else/*38.16*/{_display_(Seq[Any](format.raw/*38.17*/("""
            """),format.raw/*39.13*/("""<td><img src="/assets/images/clientImages/thumbnails/noImage.jpg"/></td>
        """)))}),format.raw/*40.10*/("""
        """),format.raw/*41.9*/("""<td>"""),_display_(/*41.14*/c/*41.15*/.getId),format.raw/*41.21*/("""</td>
        <td>"""),_display_(/*42.14*/c/*42.15*/.getName),format.raw/*42.23*/("""</td>
        <td>"""),_display_(/*43.14*/c/*43.15*/.getDescription),format.raw/*43.30*/("""</td>
        <td>"""),_display_(/*44.14*/c/*44.15*/.getAddress.getAddressName()),format.raw/*44.43*/("""</td>
        <td><a href=""""),_display_(/*45.23*/routes/*45.29*/.HomeController.clientDetails(c.getId)),format.raw/*45.67*/("""">"""),_display_(/*45.70*/c/*45.71*/.getCV.getCVObjective()),format.raw/*45.94*/("""</td></a>

        <td>
            <a href=""""),_display_(/*48.23*/routes/*48.29*/.HomeController.updateClient(c.getId)),format.raw/*48.66*/("""" class="button-xs btn-danger">
                <span class="glyphicon glyphicon-pencil"></span>
            </a>
        </td>

        <td>
            <a href=""""),_display_(/*54.23*/routes/*54.29*/.HomeController.deleteClient(c.getId)),format.raw/*54.66*/("""" class="btn-xs btn-danger" onclick="return confirmDel();">
                <span class="glyphicon glyphicon-trash"></span>
            </a>
        </td>
      </tr>
    """)))}),format.raw/*59.6*/("""
  
  """),format.raw/*61.3*/("""</tr>
  
  </tbody>
  
  </table>

  <p>
      <a href=""""),_display_(/*68.17*/routes/*68.23*/.HomeController.addClient()),format.raw/*68.50*/("""">
          <button class="btn btn-primary">Add a client</button>
      </a>
  </p>
  
  """)))}))
      }
    }
  }

  def render(clients:List[models.Client],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(clients,user,env)

  def f:((List[models.Client],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (clients,user,env) => apply(clients,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Aug 31 00:14:39 IST 2018
                  SOURCE: /home/wdd/webapps/RepeatCA1/repeat/app/views/index.scala.html
                  HASH: d5ba2ed78d7dd03231d1c1876b8b5c9c75bba94b
                  MATRIX: 1000->1|1177->83|1205->86|1238->111|1277->113|1309->119|1368->153|1408->185|1446->186|1477->191|1543->232|1556->237|1591->252|1623->257|1663->267|1693->270|2041->592|2072->607|2112->609|2146->616|2189->632|2285->719|2326->721|2367->734|2448->788|2487->806|2524->825|2537->830|2576->831|2617->844|2730->926|2766->935|2798->940|2808->941|2835->947|2881->966|2891->967|2920->975|2966->994|2976->995|3012->1010|3058->1029|3068->1030|3117->1058|3172->1086|3187->1092|3246->1130|3276->1133|3286->1134|3330->1157|3403->1203|3418->1209|3476->1246|3667->1410|3682->1416|3740->1453|3942->1625|3975->1631|4059->1688|4074->1694|4122->1721
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|39->7|39->7|39->7|40->8|41->9|41->9|41->9|42->10|43->11|44->12|66->34|66->34|66->34|67->35|68->36|68->36|68->36|69->37|69->37|69->37|70->38|70->38|70->38|71->39|72->40|73->41|73->41|73->41|73->41|74->42|74->42|74->42|75->43|75->43|75->43|76->44|76->44|76->44|77->45|77->45|77->45|77->45|77->45|77->45|80->48|80->48|80->48|86->54|86->54|86->54|91->59|93->61|100->68|100->68|100->68
                  -- GENERATED --
              */
          
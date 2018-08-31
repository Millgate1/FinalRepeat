
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,models.users.User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String,user: models.users.User )(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.57*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html lang="en">
        
        <head>
            <meta charset="utf-8">
            <title>Recruitment Agency - """),_display_(/*9.42*/title),format.raw/*9.47*/("""</title>
            <!-- Bootstrap Core CSS -->
            <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.css" rel="stylesheet" />
            <!-- Custom CSS -->
            <link href=""""),_display_(/*13.26*/routes/*13.32*/.Assets.versioned("stylesheets/main.css")),format.raw/*13.73*/("""" rel="stylesheet" />
        </head>
        
        <body>
        
            <nav class="navbar navbar-inverse">
                <div class="container-fluid">
                    <div class="navbar-header">
                        <a class="navbar-brand" href="/">Recruitment Agency</a>
                    </div>
        
                    <ul class="nav navbar-nav">
                        <li>
                            <a href=""""),_display_(/*26.39*/routes/*26.45*/.HomeController.index()),format.raw/*26.68*/("""">Clients</a>
                        </li>
        
                        <li>
                            <a href=""""),_display_(/*30.39*/routes/*30.45*/.HomeController.about()),format.raw/*30.68*/("""">About Us</a>
                        </li>
                       
        
                        <li """),_display_(/*34.30*/if(title=="Login")/*34.48*/{_display_(Seq[Any](format.raw/*34.49*/("""class="active"""")))}),format.raw/*34.64*/(""">
                            """),_display_(/*35.30*/if(user != null)/*35.46*/ {_display_(Seq[Any](format.raw/*35.48*/("""
                                """),format.raw/*36.33*/("""<a href=""""),_display_(/*36.43*/routes/*36.49*/.LoginController.logout()),format.raw/*36.74*/("""">Logout """),_display_(/*36.84*/user/*36.88*/.getName()),format.raw/*36.98*/("""</a>
                            """)))}/*37.31*/else/*37.36*/{_display_(Seq[Any](format.raw/*37.37*/("""
                                """),format.raw/*38.33*/("""<a href=""""),_display_(/*38.43*/routes/*38.49*/.LoginController.login()),format.raw/*38.73*/("""">Login</a>
                            """)))}),format.raw/*39.30*/("""
        
                        """),format.raw/*41.25*/("""</li>

                    </ul>
        
                </div>
        
            </nav>
        
            <container>
                <row>
                    <div class="col-md-12">
                        """),_display_(/*52.26*/content),format.raw/*52.33*/("""
                    """),format.raw/*53.21*/("""</div>
                </row>
            </container>
        <br>
            <container>
                <footer>
                <row>
                    <div class="col-md-12">
                        
                        &copy;
                        <strong>Recruitment Agency</strong>
                    </div>
                </row>
            </footer>
            </container>
            <script src=""""),_display_(/*68.27*/routes/*68.33*/.Assets.versioned("javascripts/main.js")),format.raw/*68.73*/(""""></script>
        </body>
        
        </html>
        """))
      }
    }
  }

  def render(title:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => apply(title,user)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Aug 30 21:39:31 IST 2018
                  SOURCE: /home/wdd/webapps/RepeatCA1/repeat/app/views/main.scala.html
                  HASH: faa98bada724b6ef2212b0d228ccc5552c27d885
                  MATRIX: 970->1|1120->56|1148->58|1308->192|1333->197|1577->414|1592->420|1654->461|2125->905|2140->911|2184->934|2331->1054|2346->1060|2390->1083|2524->1190|2551->1208|2590->1209|2636->1224|2694->1255|2719->1271|2759->1273|2820->1306|2857->1316|2872->1322|2918->1347|2955->1357|2968->1361|2999->1371|3052->1406|3065->1411|3104->1412|3165->1445|3202->1455|3217->1461|3262->1485|3334->1526|3396->1560|3640->1777|3668->1784|3717->1805|4166->2227|4181->2233|4242->2273
                  LINES: 28->1|33->1|35->3|41->9|41->9|45->13|45->13|45->13|58->26|58->26|58->26|62->30|62->30|62->30|66->34|66->34|66->34|66->34|67->35|67->35|67->35|68->36|68->36|68->36|68->36|68->36|68->36|68->36|69->37|69->37|69->37|70->38|70->38|70->38|70->38|71->39|73->41|84->52|84->52|85->53|100->68|100->68|100->68
                  -- GENERATED --
              */
          
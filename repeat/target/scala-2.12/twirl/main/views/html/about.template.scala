
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

object about extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.27*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
"""),_display_(/*3.2*/main("Welcome to Play", user)/*3.31*/ {_display_(Seq[Any](format.raw/*3.33*/("""
"""),format.raw/*4.1*/("""<html>
    <head>
        <title>About Us</title>
        <style>
            h1 """),format.raw/*8.16*/("""{"""),format.raw/*8.17*/("""
                """),format.raw/*9.17*/("""color: red;
            """),format.raw/*10.13*/("""}"""),format.raw/*10.14*/("""
        """),format.raw/*11.9*/("""</style>
    </head>
    <body>
        <h1>About Us</h1>
    </body>
</html>
""")))}))
      }
    }
  }

  def render(user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Aug 30 21:39:31 IST 2018
                  SOURCE: /home/wdd/webapps/RepeatCA1/repeat/app/views/about.scala.html
                  HASH: f8fbeb24ee4ba5637704a28a2c12e2f72dc531bb
                  MATRIX: 959->1|1079->26|1106->27|1148->44|1185->73|1224->75|1251->76|1359->157|1387->158|1431->175|1483->199|1512->200|1548->209
                  LINES: 28->1|33->1|34->2|35->3|35->3|35->3|36->4|40->8|40->8|41->9|42->10|42->10|43->11
                  -- GENERATED --
              */
          
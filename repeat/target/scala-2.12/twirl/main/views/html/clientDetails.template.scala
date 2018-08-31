
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

object clientDetails extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[models.Client,models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(c: models.Client,user: models.users.User,env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.70*/("""

"""),_display_(/*3.2*/main("Full Image", user)/*3.26*/ {_display_(Seq[Any](format.raw/*3.28*/("""

  """),format.raw/*5.3*/("""<div class="col-sm-10">
    <table class="table table-bordered table-hover table-condensed">
      """),_display_(/*7.8*/if(flash.containsKey("success"))/*7.40*/ {_display_(Seq[Any](format.raw/*7.42*/("""
        """),format.raw/*8.9*/("""<div class="alert alert-success">
          """),_display_(/*9.12*/flash/*9.17*/.get("success")),format.raw/*9.32*/("""
        """),format.raw/*10.9*/("""</div>
      """)))}),format.raw/*11.8*/("""
      """),format.raw/*12.7*/("""<thead>
        <tr>
          <th>Image</th> 
          <th>ID</th> 
          <th>Name</th>
          <th>Objective</th>
          <th>Education</th>
          <th>Work Experience</th>
        </tr>
      </thead>

      <tbody>

          <tr>
              """),_display_(/*26.16*/if(env.resource("public/images/clientImages/" + c.getId + ".jpg").isDefined)/*26.92*/ {_display_(Seq[Any](format.raw/*26.94*/("""
                """),format.raw/*27.17*/("""<td><img src="/assets/images/clientImages/"""),_display_(/*27.60*/(c.getId + ".jpg")),format.raw/*27.78*/(""""/></td>
            """)))}/*28.15*/else/*28.20*/{_display_(Seq[Any](format.raw/*28.21*/("""
                """),format.raw/*29.17*/("""<td><img src="/assets/images/clientImages/noImage.jpg"/></td>
            """)))}),format.raw/*30.14*/("""
            """),format.raw/*31.13*/("""<td class="numeric">"""),_display_(/*31.34*/c/*31.35*/.getId),format.raw/*31.41*/("""</td>
            <td>"""),_display_(/*32.18*/c/*32.19*/.getName()),format.raw/*32.29*/("""</td>
            <td>"""),_display_(/*33.18*/c/*33.19*/.getCV.getCVObjective()),format.raw/*33.42*/("""</td>
            <td>"""),_display_(/*34.18*/c/*34.19*/.getCV.getCVEducation()),format.raw/*34.42*/("""</td>
            <td>"""),_display_(/*35.18*/c/*35.19*/.getCV.getCVExperience()),format.raw/*35.43*/("""</td>
          </tr>
        
      </tbody>

    </table>

    
  </div>
</div>
""")))}),format.raw/*45.2*/("""
"""))
      }
    }
  }

  def render(c:models.Client,user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(c,user,env)

  def f:((models.Client,models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (c,user,env) => apply(c,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Aug 31 00:27:22 IST 2018
                  SOURCE: /home/wdd/webapps/RepeatCA1/repeat/app/views/clientDetails.scala.html
                  HASH: 7d3aeb9a3d4484686ea41dfcef2f7708b7cbe681
                  MATRIX: 1002->1|1165->69|1193->72|1225->96|1264->98|1294->102|1419->202|1459->234|1498->236|1533->245|1604->290|1617->295|1652->310|1688->319|1732->333|1766->340|2055->602|2140->678|2180->680|2225->697|2295->740|2334->758|2375->781|2388->786|2427->787|2472->804|2578->879|2619->892|2667->913|2677->914|2704->920|2754->943|2764->944|2795->954|2845->977|2855->978|2899->1001|2949->1024|2959->1025|3003->1048|3053->1071|3063->1072|3108->1096|3221->1179
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|39->7|39->7|39->7|40->8|41->9|41->9|41->9|42->10|43->11|44->12|58->26|58->26|58->26|59->27|59->27|59->27|60->28|60->28|60->28|61->29|62->30|63->31|63->31|63->31|63->31|64->32|64->32|64->32|65->33|65->33|65->33|66->34|66->34|66->34|67->35|67->35|67->35|77->45
                  -- GENERATED --
              */
          
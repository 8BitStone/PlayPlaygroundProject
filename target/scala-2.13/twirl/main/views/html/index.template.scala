
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
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.data._
import play.core.j.PlayFormsMagicForJava._
import scala.jdk.CollectionConverters._

/**/
class index @javax.inject.Inject() /*1.6*/() extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Http.Request,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/()(implicit request: Http.Request):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.36*/("""

"""),format.raw/*4.1*/("""<!doctype html>
<html>
    <head>
        <meta charset="utf-8">
        <title>was hesch?</title>
    </head>
    <body>
        <a href=""""),_display_(/*11.19*/routes/*11.25*/.TemplateEngineV1Controller.index()),format.raw/*11.60*/("""">V1</a><br>
    </body>
</html>
"""))
      }
    }
  }

  def render(request:Http.Request): play.twirl.api.HtmlFormat.Appendable = apply()(request)

  def f:(() => (Http.Request) => play.twirl.api.HtmlFormat.Appendable) = () => (request) => apply()(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/index.scala.html
                  HASH: 74908ce627bd24ad923edf6908b9ba89d5e5154c
                  MATRIX: 651->5|950->10|1079->44|1109->48|1283->195|1298->201|1354->236
                  LINES: 25->1|28->2|33->2|35->4|42->11|42->11|42->11
                  -- GENERATED --
              */
          
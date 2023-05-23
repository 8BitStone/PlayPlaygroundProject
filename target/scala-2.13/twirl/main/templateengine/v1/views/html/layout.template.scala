
package templateengine.v1.views.html

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
class layout @javax.inject.Inject() /*1.6*/(header: header, footer: footer) extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Html,Http.Request,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(content: Html)(implicit request: Http.Request):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.49*/("""

"""),format.raw/*4.1*/("""<!doctype html>
<html>
    <head>
        <meta charset="utf-8">
        <title>ä sittä</title>
    </head>
    <body>

        <header style="background-color: #888;">
            """),_display_(/*13.14*/header()),format.raw/*13.22*/("""
        """),format.raw/*14.9*/("""</header>

        <main style="margin: 10px 0;">
            """),_display_(/*17.14*/content),format.raw/*17.21*/("""
        """),format.raw/*18.9*/("""</main>

        <footer style="background-color: #888;">
            """),_display_(/*21.14*/footer()),format.raw/*21.22*/("""
        """),format.raw/*22.9*/("""</footer>

    </body>
</html>
"""))
      }
    }
  }

  def render(content:Html,request:Http.Request): play.twirl.api.HtmlFormat.Appendable = apply(content)(request)

  def f:((Html) => (Http.Request) => play.twirl.api.HtmlFormat.Appendable) = (content) => (request) => apply(content)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/templateengine/v1/views/layout.scala.html
                  HASH: 59d607921832a63e474b65d768e4588d39383204
                  MATRIX: 670->5|1004->40|1146->87|1176->91|1394->282|1423->290|1460->300|1553->366|1581->373|1618->383|1719->457|1748->465|1785->475
                  LINES: 25->1|28->2|33->2|35->4|44->13|44->13|45->14|48->17|48->17|49->18|52->21|52->21|53->22
                  -- GENERATED --
              */
          

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
class index @javax.inject.Inject() /*1.6*/(layout: layout) extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Http.Request,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/()(implicit request: Http.Request):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.36*/("""

"""),_display_(/*4.2*/layout/*4.8*/{_display_(Seq[Any](format.raw/*4.9*/("""
    """),format.raw/*5.5*/("""Template Engine V1
""")))}),format.raw/*6.2*/("""
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
                  SOURCE: app/templateengine/v1/views/index.scala.html
                  HASH: 3d911f4749ab6cdb7d4f1a6bd1e4cf06944e5193
                  MATRIX: 669->5|982->24|1111->58|1141->63|1154->69|1191->70|1223->76|1273->97
                  LINES: 25->1|28->2|33->2|35->4|35->4|35->4|36->5|37->6
                  -- GENERATED --
              */
          

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
/*1.2*/import templateengine.v1.viewmodelfactories.FooterViewModelFactory
/*2.2*/import templateengine.v1.viewmodels.FooterViewModel

/**/
class footer @javax.inject.Inject() /*4.6*/(viewModelFactory: FooterViewModelFactory) extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Http.Request,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*5.2*/()(implicit request: Http.Request):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*7.2*/renderFooter/*7.14*/(viewModel: FooterViewModel):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*7.46*/("""
    """),format.raw/*8.5*/("""<div><b>- Footer -</b></div>
    <div>Best Customer: """),_display_(/*9.26*/viewModel/*9.35*/.primeAddressName),format.raw/*9.52*/("""</div>
""")))};
Seq[Any](format.raw/*5.36*/("""

"""),format.raw/*10.2*/("""

"""),_display_(/*12.2*/renderFooter(viewModelFactory.buildViewModel(request))))
      }
    }
  }

  def render(request:Http.Request): play.twirl.api.HtmlFormat.Appendable = apply()(request)

  def f:(() => (Http.Request) => play.twirl.api.HtmlFormat.Appendable) = () => (request) => apply()(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/templateengine/v1/views/footer.scala.html
                  HASH: 7a4b1fa516bc1a6b2eb418ffb42633a7250433fd
                  MATRIX: 628->1|702->70|803->130|1142->175|1254->214|1274->226|1382->258|1414->264|1495->319|1512->328|1549->345|1597->209|1628->354|1659->359
                  LINES: 23->1|24->2|27->4|30->5|34->7|34->7|36->7|37->8|38->9|38->9|38->9|40->5|42->10|44->12
                  -- GENERATED --
              */
          
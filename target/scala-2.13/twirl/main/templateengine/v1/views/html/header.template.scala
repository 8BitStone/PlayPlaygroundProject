
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
/*1.2*/import templateengine.v1.viewmodels.HeaderViewModel
/*2.2*/import templateengine.v1.viewmodelfactories.HeaderViewModelFactory

/**/
class header @javax.inject.Inject() /*4.6*/(headerViewModelFactory: HeaderViewModelFactory) extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Http.Request,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*5.2*/()(implicit request: Http.Request):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*7.2*/renderHeader/*7.14*/(viewModel: HeaderViewModel):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*7.46*/("""
    """),_display_(/*8.6*/for(navItem <- viewModel.navPoints) yield /*8.41*/{_display_(Seq[Any](format.raw/*8.42*/("""
        """),format.raw/*9.9*/("""<a href=""""),_display_(/*9.19*/navItem/*9.26*/.call),format.raw/*9.31*/("""">
            """),_display_(/*10.14*/if(navItem.isActive)/*10.34*/{_display_(Seq[Any](format.raw/*10.35*/("""
                """),format.raw/*11.17*/("""<b>"""),_display_(/*11.21*/navItem/*11.28*/.name),format.raw/*11.33*/("""</b>
            """)))}/*12.14*/else/*12.18*/{_display_(Seq[Any](format.raw/*12.19*/("""
                """),_display_(/*13.18*/navItem/*13.25*/.name),format.raw/*13.30*/("""
            """)))}),format.raw/*14.14*/("""
        """),format.raw/*15.9*/("""</a>
        <br>
    """)))}),format.raw/*17.6*/("""
""")))};
Seq[Any](format.raw/*5.36*/("""

"""),format.raw/*18.2*/("""

"""),_display_(/*20.2*/renderHeader(headerViewModelFactory.buildViewModel(request))))
      }
    }
  }

  def render(request:Http.Request): play.twirl.api.HtmlFormat.Appendable = apply()(request)

  def f:(() => (Http.Request) => play.twirl.api.HtmlFormat.Appendable) = () => (request) => apply()(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/templateengine/v1/views/header.scala.html
                  HASH: 321aef8f0cf730e0def3860aeb89da38adf8a606
                  MATRIX: 628->1|687->55|803->130|1148->181|1260->220|1280->232|1388->264|1420->271|1470->306|1508->307|1544->317|1580->327|1595->334|1620->339|1664->356|1693->376|1732->377|1778->395|1809->399|1825->406|1851->411|1889->430|1902->434|1941->435|1987->454|2003->461|2029->466|2075->481|2112->491|2167->516|2209->215|2240->519|2271->524
                  LINES: 23->1|24->2|27->4|30->5|34->7|34->7|36->7|37->8|37->8|37->8|38->9|38->9|38->9|38->9|39->10|39->10|39->10|40->11|40->11|40->11|40->11|41->12|41->12|41->12|42->13|42->13|42->13|43->14|44->15|46->17|48->5|50->18|52->20
                  -- GENERATED --
              */
          

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
/*1.2*/import java.util.regex.Matcher

object fieldConstructor extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[views.html.helper.FieldElements,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(elements: views.html.helper.FieldElements):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.45*/("""

"""),_display_(/*5.2*/if(elements.args.contains(Symbol("hidden")))/*5.46*/ {_display_(Seq[Any](format.raw/*5.48*/("""
    """),_display_(/*6.6*/elements/*6.14*/.input),format.raw/*6.20*/("""
""")))}/*7.3*/else/*7.8*/{_display_(Seq[Any](format.raw/*7.9*/("""
    """),_display_(/*8.6*/defining(elements.args.get(Symbol("required")))/*8.53*/ { required =>_display_(Seq[Any](format.raw/*8.67*/("""
        """),format.raw/*9.9*/("""<div class="ecp-input-container """),_display_(/*9.42*/if(elements.hasErrors)/*9.64*/ {_display_(Seq[Any](format.raw/*9.66*/("""error""")))}),format.raw/*9.72*/(""" """),_display_(/*9.74*/if(required)/*9.86*/ {_display_(Seq[Any](format.raw/*9.88*/("""required""")))}),format.raw/*9.97*/("""">
            """),_display_(/*10.14*/elements/*10.22*/.args.get(Symbol("prepend"))),format.raw/*10.50*/("""
            """),format.raw/*11.13*/("""<div class="ecp-label">
            """),_display_(/*12.14*/if(elements.hasName)/*12.34*/ {_display_(Seq[Any](format.raw/*12.36*/("""
                """),_display_(/*13.18*/elements/*13.26*/.name),format.raw/*13.31*/("""
            """)))}/*14.15*/else/*14.20*/{_display_(Seq[Any](format.raw/*14.21*/("""
                """),format.raw/*15.17*/("""<label for=""""),_display_(/*15.30*/elements/*15.38*/.id),format.raw/*15.41*/("""" title=""""),_display_(/*15.51*/elements/*15.59*/.infos.mkString(", ")),format.raw/*15.80*/("""">"""),_display_(/*15.83*/elements/*15.91*/.label),format.raw/*15.97*/("""</label>
            """)))}),format.raw/*16.14*/("""
            """),format.raw/*17.13*/("""</div>

            """),_display_(/*19.14*/defining(elements.input.body.trim)/*19.48*/ { inputHtml =>_display_(Seq[Any](format.raw/*19.63*/("""
                """),_display_(/*20.18*/if(inputHtml.startsWith("<input type=\"checkbox\""))/*20.70*/ {_display_(Seq[Any](format.raw/*20.72*/("""
                    """),format.raw/*21.65*/("""
                    """),_display_(/*22.22*/Html(inputHtml.replaceFirst("<span>", Matcher.quoteReplacement("<label for=\"%s\"><span>".format(elements.id))) + "</label>")),format.raw/*22.147*/("""
                """)))}/*23.19*/else/*23.24*/{_display_(Seq[Any](format.raw/*23.25*/("""
                    """),_display_(/*24.22*/elements/*24.30*/.input),format.raw/*24.36*/("""
                """)))}),format.raw/*25.18*/("""
            """)))}),format.raw/*26.14*/("""
            """),format.raw/*27.13*/("""<div class="errors">"""),_display_(/*27.34*/elements/*27.42*/.errors.mkString(", ")),format.raw/*27.64*/("""</div>
            """),_display_(/*28.14*/elements/*28.22*/.args.get(Symbol("append"))),format.raw/*28.49*/("""
        """),format.raw/*29.9*/("""</div>
    """)))}),format.raw/*30.6*/("""
""")))}),format.raw/*31.2*/("""
"""))
      }
    }
  }

  def render(elements:views.html.helper.FieldElements): play.twirl.api.HtmlFormat.Appendable = apply(elements)

  def f:((views.html.helper.FieldElements) => play.twirl.api.HtmlFormat.Appendable) = (elements) => apply(elements)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/fieldConstructor.scala.html
                  HASH: 48b7881557c5fe5ea839a3b09b94433a0dd49e7f
                  MATRIX: 610->1|981->36|1119->79|1149->84|1201->128|1240->130|1272->137|1288->145|1314->151|1334->155|1345->160|1382->161|1414->168|1469->215|1520->229|1556->239|1615->272|1645->294|1684->296|1720->302|1748->304|1768->316|1807->318|1846->327|1890->344|1907->352|1956->380|1998->394|2063->432|2092->452|2132->454|2178->473|2195->481|2221->486|2255->502|2268->507|2307->508|2353->526|2393->539|2410->547|2434->550|2471->560|2488->568|2530->589|2560->592|2577->600|2604->606|2658->629|2700->643|2750->666|2793->700|2846->715|2892->734|2953->786|2993->788|3043->854|3093->877|3240->1002|3278->1022|3291->1027|3330->1028|3380->1051|3397->1059|3424->1065|3474->1084|3520->1099|3562->1113|3610->1134|3627->1142|3670->1164|3718->1185|3735->1193|3783->1220|3820->1230|3863->1243|3896->1246
                  LINES: 23->1|28->3|33->3|35->5|35->5|35->5|36->6|36->6|36->6|37->7|37->7|37->7|38->8|38->8|38->8|39->9|39->9|39->9|39->9|39->9|39->9|39->9|39->9|39->9|40->10|40->10|40->10|41->11|42->12|42->12|42->12|43->13|43->13|43->13|44->14|44->14|44->14|45->15|45->15|45->15|45->15|45->15|45->15|45->15|45->15|45->15|45->15|46->16|47->17|49->19|49->19|49->19|50->20|50->20|50->20|51->21|52->22|52->22|53->23|53->23|53->23|54->24|54->24|54->24|55->25|56->26|57->27|57->27|57->27|57->27|58->28|58->28|58->28|59->29|60->30|61->31
                  -- GENERATED --
              */
          
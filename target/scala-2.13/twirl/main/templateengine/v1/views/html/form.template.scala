
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
/*1.2*/import forms.SomeFormData
/*2.2*/import templateengine.v1.viewmodelfactories.FormViewModelFactory
/*3.2*/import templateengine.v1.viewmodels.FormViewModel

/**/
class form @javax.inject.Inject() /*5.6*/(layout: layout) extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[FormViewModel,Http.Request,play.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(viewModel: FormViewModel)(implicit request: Http.Request, messages: play.i18n.Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*10.2*/renderForm/*10.12*/(form: Form[SomeFormData]):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*10.42*/("""
    """),_display_(/*11.6*/helper/*11.12*/.form(routes.TemplateEngineV1Controller.formSubmit())/*11.65*/{_display_(Seq[Any](format.raw/*11.66*/("""
        """),_display_(/*12.10*/helper/*12.16*/.CSRF.formField),format.raw/*12.31*/("""
        """),_display_(/*13.10*/helper/*13.16*/.inputText(form("someString"))),format.raw/*13.46*/("""
        """),format.raw/*14.9*/("""<button type="submit">Submit</button>
    """)))}),format.raw/*15.6*/("""
""")))};implicit def /*8.2*/implicitField/*8.15*/ = {{helper.FieldConstructor(views.html.fieldConstructor.f)}};
Seq[Any](format.raw/*6.90*/("""

"""),format.raw/*8.75*/("""

"""),format.raw/*16.2*/("""

"""),_display_(/*18.2*/layout/*18.8*/ {_display_(Seq[Any](format.raw/*18.10*/("""
    """),_display_(/*19.6*/renderForm(viewModel.getForm)),format.raw/*19.35*/("""
""")))}))
      }
    }
  }

  def render(viewModel:FormViewModel,request:Http.Request,messages:play.i18n.Messages): play.twirl.api.HtmlFormat.Appendable = apply(viewModel)(request,messages)

  def f:((FormViewModel) => (Http.Request,play.i18n.Messages) => play.twirl.api.HtmlFormat.Appendable) = (viewModel) => (request,messages) => apply(viewModel)(request,messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/templateengine/v1/views/form.scala.html
                  HASH: ceb490334ba868a52d8839dcfdaad6eb774ebc9d
                  MATRIX: 628->1|661->29|733->96|830->154|1176->173|1343->344|1362->354|1469->384|1502->391|1517->397|1579->450|1618->451|1656->462|1671->468|1707->483|1745->494|1760->500|1811->530|1848->540|1922->584|1956->266|1977->279|2067->261|2098->339|2129->587|2160->592|2174->598|2214->600|2247->607|2297->636
                  LINES: 23->1|24->2|25->3|28->5|31->6|35->10|35->10|37->10|38->11|38->11|38->11|38->11|39->12|39->12|39->12|40->13|40->13|40->13|41->14|42->15|43->8|43->8|44->6|46->8|48->16|50->18|50->18|50->18|51->19|51->19
                  -- GENERATED --
              */
          
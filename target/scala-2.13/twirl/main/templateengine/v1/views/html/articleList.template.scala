
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
/*1.2*/import templateengine.v1.viewmodelfactories.ArticleListViewModelFactory
/*2.2*/import templateengine.v1.viewmodels.ArticleListViewModel

/**/
class articleList @javax.inject.Inject() /*4.6*/(layout: layout, articleListViewModelFactory: ArticleListViewModelFactory) extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Http.Request,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*5.2*/()(implicit request: Http.Request):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*7.2*/renderArticleList/*7.19*/(articleListViewModel: ArticleListViewModel):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*7.67*/("""
    """),_display_(/*8.6*/for((id: UUID, name: String) <- articleListViewModel.getArticles.asScala) yield /*8.79*/{_display_(Seq[Any](format.raw/*8.80*/("""
        """),_display_(/*9.10*/name),format.raw/*9.14*/(""" """),format.raw/*9.15*/("""(id: """),_display_(/*9.21*/id),format.raw/*9.23*/(""") <br/>
    """)))}),format.raw/*10.6*/("""
""")))};
Seq[Any](format.raw/*5.36*/("""

"""),format.raw/*11.2*/("""

"""),_display_(/*13.2*/layout/*13.8*/{_display_(Seq[Any](format.raw/*13.9*/("""
    """),_display_(/*14.6*/renderArticleList(articleListViewModelFactory.buildViewModel(request))),format.raw/*14.76*/("""
""")))}),format.raw/*15.2*/("""
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
                  SOURCE: app/templateengine/v1/views/articleList.scala.html
                  HASH: a27986f587b9bb338164be370a00ab9fba1c89d2
                  MATRIX: 628->1|707->75|818->140|1189->217|1301->256|1326->273|1450->321|1482->328|1570->401|1608->402|1645->413|1669->417|1697->418|1729->424|1751->426|1795->440|1837->251|1868->443|1899->448|1913->454|1951->455|1984->462|2075->532|2108->535
                  LINES: 23->1|24->2|27->4|30->5|34->7|34->7|36->7|37->8|37->8|37->8|38->9|38->9|38->9|38->9|38->9|39->10|41->5|43->11|45->13|45->13|45->13|46->14|46->14|47->15
                  -- GENERATED --
              */
          
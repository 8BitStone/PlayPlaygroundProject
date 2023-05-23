// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:1
  HomeController_2: controllers.HomeController,
  // @LINE:2
  TemplateEngineV1Controller_0: controllers.TemplateEngineV1Controller,
  // @LINE:7
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:1
    HomeController_2: controllers.HomeController,
    // @LINE:2
    TemplateEngineV1Controller_0: controllers.TemplateEngineV1Controller,
    // @LINE:7
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_2, TemplateEngineV1Controller_0, Assets_1, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_2, TemplateEngineV1Controller_0, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """te1""", """controllers.TemplateEngineV1Controller.index(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """te1/list""", """controllers.TemplateEngineV1Controller.articleList(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """te1/form""", """controllers.TemplateEngineV1Controller.form(request:Request)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """te1/form""", """controllers.TemplateEngineV1Controller.formSubmit(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:1
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_2.index(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """""",
      """""",
      Seq()
    )
  )

  // @LINE:2
  private[this] lazy val controllers_TemplateEngineV1Controller_index1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("te1")))
  )
  private[this] lazy val controllers_TemplateEngineV1Controller_index1_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      TemplateEngineV1Controller_0.index(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TemplateEngineV1Controller",
      "index",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """te1""",
      """""",
      Seq()
    )
  )

  // @LINE:3
  private[this] lazy val controllers_TemplateEngineV1Controller_articleList2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("te1/list")))
  )
  private[this] lazy val controllers_TemplateEngineV1Controller_articleList2_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      TemplateEngineV1Controller_0.articleList(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TemplateEngineV1Controller",
      "articleList",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """te1/list""",
      """""",
      Seq()
    )
  )

  // @LINE:4
  private[this] lazy val controllers_TemplateEngineV1Controller_form3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("te1/form")))
  )
  private[this] lazy val controllers_TemplateEngineV1Controller_form3_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      TemplateEngineV1Controller_0.form(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TemplateEngineV1Controller",
      "form",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """te1/form""",
      """""",
      Seq()
    )
  )

  // @LINE:5
  private[this] lazy val controllers_TemplateEngineV1Controller_formSubmit4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("te1/form")))
  )
  private[this] lazy val controllers_TemplateEngineV1Controller_formSubmit4_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      TemplateEngineV1Controller_0.formSubmit(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TemplateEngineV1Controller",
      "formSubmit",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """te1/form""",
      """""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_Assets_versioned5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned5_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:1
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(
          req => HomeController_2.index(req))
      }
  
    // @LINE:2
    case controllers_TemplateEngineV1Controller_index1_route(params@_) =>
      call { 
        controllers_TemplateEngineV1Controller_index1_invoker.call(
          req => TemplateEngineV1Controller_0.index(req))
      }
  
    // @LINE:3
    case controllers_TemplateEngineV1Controller_articleList2_route(params@_) =>
      call { 
        controllers_TemplateEngineV1Controller_articleList2_invoker.call(
          req => TemplateEngineV1Controller_0.articleList(req))
      }
  
    // @LINE:4
    case controllers_TemplateEngineV1Controller_form3_route(params@_) =>
      call { 
        controllers_TemplateEngineV1Controller_form3_invoker.call(
          req => TemplateEngineV1Controller_0.form(req))
      }
  
    // @LINE:5
    case controllers_TemplateEngineV1Controller_formSubmit4_route(params@_) =>
      call { 
        controllers_TemplateEngineV1Controller_formSubmit4_invoker.call(
          req => TemplateEngineV1Controller_0.formSubmit(req))
      }
  
    // @LINE:7
    case controllers_Assets_versioned5_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned5_invoker.call(Assets_1.versioned(path, file))
      }
  }
}

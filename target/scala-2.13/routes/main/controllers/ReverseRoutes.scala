// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:1
package controllers {

  // @LINE:1
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:1
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:2
  class ReverseTemplateEngineV1Controller(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:4
    def form(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "te1/form")
    }
  
    // @LINE:5
    def formSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "te1/form")
    }
  
    // @LINE:2
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "te1")
    }
  
    // @LINE:3
    def articleList(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "te1/list")
    }
  
  }

  // @LINE:7
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}

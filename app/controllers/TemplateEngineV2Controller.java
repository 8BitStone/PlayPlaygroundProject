package controllers;

import com.informaticon.lib.play.auth.annotations.PublicRoute;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;

import javax.inject.Inject;

@PublicRoute
public class TemplateEngineV2Controller extends Controller {

    @Inject
    public templateengine.v2.views.html.svelteApp svelteAppView;

    public Result index(Http.Request request){
        return ok(svelteAppView.render());
    }
}

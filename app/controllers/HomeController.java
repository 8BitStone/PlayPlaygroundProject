package controllers;

import com.informaticon.lib.play.auth.annotations.PublicRoute;
import play.mvc.*;

import javax.inject.Inject;

public class HomeController extends Controller {

    @Inject
    public views.html.index indexView;

    @PublicRoute
    public Result index(Http.Request request){
        return ok(indexView.render(request));
    }
}

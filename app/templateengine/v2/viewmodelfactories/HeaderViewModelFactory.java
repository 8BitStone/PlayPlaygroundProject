package templateengine.v2.viewmodelfactories;

import controllers.routes;
import play.mvc.Call;
import play.mvc.Http;
import templateengine.v2.viewmodels.HeaderViewModel;

import java.util.ArrayList;
import java.util.List;

public class HeaderViewModelFactory implements IViewModelFactory<HeaderViewModel> {

    @Override
    public HeaderViewModel buildViewModel(Http.Request request) {
        final List<HeaderViewModel.NavPointViewModel> navPoints = new ArrayList<>();

        navPoints.add(
                buildNavPoint("Home (V2)", routes.TemplateEngineV2Controller.index(), request)
        );

        navPoints.add(
                buildNavPoint("Artikelliste", routes.TemplateEngineV2Controller.articleList(), request)
        );

        navPoints.add(
                buildNavPoint("Formular", routes.TemplateEngineV2Controller.form(), request)
        );

        return new HeaderViewModel(navPoints);
    }

    private HeaderViewModel.NavPointViewModel buildNavPoint(String name, Call call, Http.Request request){
        return new HeaderViewModel.NavPointViewModel(
                name,
                call.path(),
                isActive(call, request)
        );
    }

    private boolean isActive(Call call, Http.Request request){
        return request.path().equals(call.path());
    }
}

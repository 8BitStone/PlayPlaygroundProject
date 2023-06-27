package templateengine.v1mix2.viewmodelfactories;

import controllers.routes;
import play.mvc.Call;
import play.mvc.Http;
import templateengine.v1mix2.viewmodelfactories.IViewModelFactory;
import templateengine.v1mix2.viewmodels.HeaderViewModel;

import java.util.ArrayList;
import java.util.List;

public class HeaderViewModelFactory implements IViewModelFactory<HeaderViewModel> {

    protected String currentCalledPath;

    public IViewModelFactory<HeaderViewModel> collectData(Http.Request request){
        currentCalledPath = request.queryString("page")
                .orElse("invalidPath");

        return this;
    }

    @Override
    public HeaderViewModel buildViewModel(Http.Request request) {
        collectData(request);

        final List<HeaderViewModel.NavPointViewModel> navPoints = new ArrayList<>();

        navPoints.add(
                buildNavPoint("Home (V1Mix2)", routes.TemplateEngineV1Mix2Controller.index())
        );

        navPoints.add(
                buildNavPoint("Artikelliste", routes.TemplateEngineV1Mix2Controller.articleList())
        );

        navPoints.add(
                buildNavPoint("Formular", routes.TemplateEngineV1Mix2Controller.form())
        );

        return new HeaderViewModel(navPoints);
    }

    private HeaderViewModel.NavPointViewModel buildNavPoint(String name, Call call){
        return new HeaderViewModel.NavPointViewModel(
                name,
                call.path(),
                isActive(call)
        );
    }

    private boolean isActive(Call call){
        return call.path().equals(currentCalledPath);
    }
}

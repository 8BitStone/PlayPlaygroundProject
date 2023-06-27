package templateengine.v2.viewmodelfactories;

import controllers.routes;
import play.mvc.Call;
import play.mvc.Http;
import templateengine.v2.viewmodels.HeaderViewModel;
import utils.Attrs;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class HeaderViewModelFactory implements IViewModelFactory<HeaderViewModel> {

    protected String currentCalledPath;

    @Override
    public IViewModelFactory<HeaderViewModel> collectData(Http.Request request){
        currentCalledPath = request.queryString("page")
                .orElse("invalidPath");

        return this;
    }

    @Override
    public HeaderViewModel buildViewModel() {
        final List<HeaderViewModel.NavPointViewModel> navPoints = new ArrayList<>();

        navPoints.add(
                buildNavPoint("Home (V2)", routes.TemplateEngineV2Controller.index())
        );

        navPoints.add(
                buildNavPoint("Artikelliste", routes.TemplateEngineV2Controller.articleList())
        );

        navPoints.add(
                buildNavPoint("Formular", routes.TemplateEngineV2Controller.form())
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

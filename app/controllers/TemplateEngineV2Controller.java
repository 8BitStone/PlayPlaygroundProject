package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.informaticon.lib.play.auth.annotations.PublicRoute;
import forms.SomeFormData;
import play.data.Form;
import play.data.FormFactory;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import templateengine.v2.templatecontext.FormTemplateContext;
import templateengine.v2.viewmodelfactories.ArticleListViewModelFactory;
import templateengine.v2.viewmodelfactories.FooterViewModelFactory;
import templateengine.v2.viewmodelfactories.FormViewModelFactory;
import templateengine.v2.viewmodelfactories.HeaderViewModelFactory;
import templateengine.v2.templatecontext.ArticleListTemplateContext;
import templateengine.v2.templatecontext.IndexTemplateContext;
import templateengine.v2.viewmodels.FooterViewModel;
import templateengine.v2.viewmodels.FormViewModel;
import templateengine.v2.viewmodels.HeaderViewModel;
import utils.Attrs;

import javax.inject.Inject;
import java.util.Optional;

@PublicRoute
public class TemplateEngineV2Controller extends Controller {

    @Inject
    public FormFactory formFactory;

    @Inject
    public templateengine.v2.views.html.svelteApp svelteAppView;

    @Inject
    public IndexTemplateContext indexTemplateContext;

    @Inject
    public ArticleListTemplateContext articleListTemplateContext;

    @Inject
    public FormTemplateContext formTemplateContext;

    @Inject
    public HeaderViewModelFactory headerViewModelFactory;

    @Inject
    public FooterViewModelFactory footerViewModelFactory;

    @Inject
    public ArticleListViewModelFactory articleListViewModelFactory;

    @Inject
    public FormViewModelFactory formViewModelFactory;

    public Result index(Http.Request request){
        return ok(svelteAppView.render(
                indexTemplateContext,
                null,
                request
        ));
    }

    public Result articleList(Http.Request request){
        return ok(svelteAppView.render(
                articleListTemplateContext,
                buildArticleListViewModel(request),
                request
        ));
    }

    public Result form(Http.Request request){
        return ok(svelteAppView.render(
                formTemplateContext,
                Json.toJson(formViewModelFactory.buildViewModel(request)),
                request
        ));
    }

    public Result listData(Http.Request request){
        return ok(buildArticleListViewModel(request));
    }

    public Result formSubmit(Http.Request request){
        final Form<SomeFormData> form = formFactory.form(SomeFormData.class).bindFromRequest(request);
        final FormViewModel viewModel = new FormViewModel(form);
        final JsonNode json = Json.toJson(viewModel);
        if(form.hasErrors()){
            return badRequest(json);
        }
        return ok(json);
    }

    public Result headerData(Http.Request request){
        final HeaderViewModel viewModel = headerViewModelFactory.buildViewModel(request);
        final JsonNode json = Json.toJson(viewModel);
        return ok(json);
    }

    public Result footerData(Http.Request request){
        final FooterViewModel viewModel = footerViewModelFactory.buildViewModel(request);
        final JsonNode json = Json.toJson(viewModel);
        return ok(json);
    }

    protected JsonNode buildArticleListViewModel(Http.Request request){
        final Http.Request requestWithAttr = request.queryString("maxRows")
                .flatMap(value -> {
                    try {
                        return Optional.of(Integer.parseInt(value));
                    }
                    catch (NumberFormatException e) {
                        return Optional.empty();
                    }
                })
                .map(maxRows -> request.addAttr(Attrs.MAX_ROWS, maxRows))
                .orElse(request);
        return Json.toJson(articleListViewModelFactory.buildViewModel(requestWithAttr));
    }
}

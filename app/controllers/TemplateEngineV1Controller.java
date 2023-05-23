package controllers;

import com.informaticon.lib.play.auth.annotations.PublicRoute;
import forms.SomeFormData;
import play.data.Form;
import play.data.FormFactory;
import play.i18n.Messages;
import play.i18n.MessagesApi;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import play.twirl.api.Content;
import templateengine.v1.viewmodelfactories.FormViewModelFactory;
import templateengine.v1.viewmodels.FormViewModel;

import javax.inject.Inject;

@PublicRoute
public class TemplateEngineV1Controller extends Controller {

    @Inject
    public templateengine.v1.views.html.index indexView;

    @Inject
    public templateengine.v1.views.html.articleList articleListView;

    @Inject
    public templateengine.v1.views.html.form formView;

    @Inject
    public FormViewModelFactory formViewModelFactory;

    @Inject
    public MessagesApi messagesApi;

    @Inject
    public FormFactory formFactory;

    public Result index(Http.Request request){
        return ok(indexView.render(request));
    }

    public Result articleList(Http.Request request){
        return ok(articleListView.render(request));
    }

    public Result form(Http.Request request){
        final Messages messages = messagesApi.preferred(request);

        final FormViewModel viewModel = formViewModelFactory.buildViewModel(request);

        return ok(formView.render(viewModel, request, messages));
    }

    public Result formSubmit(Http.Request request){
        final Form<SomeFormData> form = formFactory.form(SomeFormData.class).bindFromRequest(request);

        final FormViewModel viewModel = new FormViewModel(form);

        final Messages messages = messagesApi.preferred(request);
        final Content content = formView.render(viewModel, request, messages);

        if(form.hasErrors()){
            return badRequest(content);
        }
        return ok(content);
    }
}

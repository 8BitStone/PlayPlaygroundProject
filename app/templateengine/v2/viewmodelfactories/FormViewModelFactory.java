package templateengine.v2.viewmodelfactories;

import forms.SomeFormData;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Http;
import templateengine.v2.viewmodels.FormViewModel;

import javax.inject.Inject;

public class FormViewModelFactory implements IViewModelFactory<FormViewModel> {

    private final FormFactory formFactory;

    @Inject
    public FormViewModelFactory(FormFactory formFactory) {
        this.formFactory = formFactory;
    }

    @Override
    public FormViewModel buildViewModel(Http.Request request) {
        final Form<SomeFormData> form = formFactory.form(SomeFormData.class).bindFromRequest(request);
        return new FormViewModel(form);
    }
}

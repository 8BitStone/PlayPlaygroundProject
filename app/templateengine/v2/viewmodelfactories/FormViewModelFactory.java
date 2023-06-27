package templateengine.v2.viewmodelfactories;

import forms.SomeFormData;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Http;
import templateengine.v2.viewmodels.FormViewModel;

import javax.inject.Inject;

public class FormViewModelFactory implements IViewModelFactory<FormViewModel> {

    private final FormFactory formFactory;

    private Form<SomeFormData> form;

    @Inject
    public FormViewModelFactory(FormFactory formFactory) {
        this.formFactory = formFactory;
    }

    @Override
    public IViewModelFactory<FormViewModel> collectData(Http.Request request) {
        form = formFactory.form(SomeFormData.class).bindFromRequest(request);
        return this;
    }

    @Override
    public FormViewModel buildViewModel() {
        return new FormViewModel(form);
    }
}

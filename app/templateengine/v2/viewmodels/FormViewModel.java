package templateengine.v2.viewmodels;

import forms.SomeFormData;
import play.data.Form;

public class FormViewModel{

    public final Form<SomeFormData> form;

    public FormViewModel(Form<SomeFormData> form) {
        this.form = form;
    }
}

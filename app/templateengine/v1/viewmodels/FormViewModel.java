package templateengine.v1.viewmodels;

import forms.SomeFormData;
import play.data.Form;

public class FormViewModel implements IViewModel{

    private final Form<SomeFormData> form;

    public FormViewModel(Form<SomeFormData> form) {
        this.form = form;
    }

    public Form<SomeFormData> getForm(){
        return form;
    }
}

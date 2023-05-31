package templateengine.v2.templatecontext;

import play.twirl.api.Html;

import javax.inject.Inject;

public class FormTemplateContext extends TemplateContext{

    @Inject
    public templateengine.v2.views.html.headelements.formHeadElements formHeadElements;

    public Html renderHeadElements(){
        return formHeadElements.render();
    }
}

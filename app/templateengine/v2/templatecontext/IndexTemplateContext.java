package templateengine.v2.templatecontext;

import play.twirl.api.Html;

import javax.inject.Inject;

public class IndexTemplateContext extends TemplateContext{

    @Inject
    public templateengine.v2.views.html.headelements.indexHeadElements indexHeadElements;

    public Html renderHeadElements(){
        return indexHeadElements.render();
    }
}

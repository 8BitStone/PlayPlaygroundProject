package templateengine.v2.templatecontext;

import play.twirl.api.Html;

import javax.inject.Inject;

public class ArticleListTemplateContext extends TemplateContext{

    @Inject
    public templateengine.v2.views.html.headelements.articleListHeadElements articleListHeadElements;

    public Html renderHeadElements(){
        return articleListHeadElements.render();
    }
}

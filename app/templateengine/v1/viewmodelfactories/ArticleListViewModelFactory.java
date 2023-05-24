package templateengine.v1.viewmodelfactories;

import models.ebean.Article;
import play.mvc.Http;
import templateengine.v1.viewmodels.ArticleListViewModel;
import utils.Attrs;

public class ArticleListViewModelFactory implements IViewModelFactory<ArticleListViewModel>{

    @Override
    public ArticleListViewModel buildViewModel(Http.Request request) {
        int maxRows = request.attrs()
                .getOptional(Attrs.MAX_ROWS)
                .orElse(10);

        return new ArticleListViewModel(Article.findAll(maxRows));
    }
}

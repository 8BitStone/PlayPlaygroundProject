package templateengine.v1.viewmodelfactories;

import models.ebean.Article;
import play.mvc.Http;
import templateengine.v1.viewmodels.ArticleListViewModel;

import javax.inject.Inject;

public class ArticleListViewModelFactory implements IViewModelFactory<ArticleListViewModel>{

    @Inject
    public ArticleListViewModelFactory(){

    }

    @Override
    public ArticleListViewModel buildViewModel(Http.Request request) {
        int maxRows = request.queryString("maxRows")
                .map(Integer::valueOf)
                .orElse(10);

        return new ArticleListViewModel(Article.findAll(maxRows));
    }
}

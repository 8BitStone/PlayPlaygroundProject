package templateengine.v1.viewmodelfactories;

import models.ebean.Article;
import play.mvc.Http;
import templateengine.v1.viewmodels.ArticleListViewModel;

import javax.inject.Inject;
import java.util.Optional;

public class ArticleListViewModelFactory implements IViewModelFactory<ArticleListViewModel>{

    @Inject
    public ArticleListViewModelFactory(){

    }

    @Override
    public ArticleListViewModel buildViewModel(Http.Request request) {
        int maxRows = request.queryString("maxRows")
                .flatMap(this::parseInt)
                .orElse(10);

        return new ArticleListViewModel(Article.findAll(maxRows));
    }

    private Optional<Integer> parseInt(String value){
        try {
            return Optional.of(Integer.valueOf(value));
        }
        catch (NumberFormatException e) {
            return Optional.empty();
        }
    }
}

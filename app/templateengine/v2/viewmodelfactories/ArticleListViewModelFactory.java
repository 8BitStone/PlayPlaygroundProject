package templateengine.v2.viewmodelfactories;

import models.ebean.Article;
import play.mvc.Http;
import templateengine.v2.viewmodels.ArticleListViewModel;
import utils.Attrs;

import java.util.List;
import java.util.stream.Collectors;

public class ArticleListViewModelFactory implements IViewModelFactory<ArticleListViewModel> {

    @Override
    public ArticleListViewModel buildViewModel(Http.Request request) {
        int maxRows = request.attrs()
                .getOptional(Attrs.MAX_ROWS)
                .orElse(10);

        final List<ArticleListViewModel.ArticleListItemViewModel> items = Article.findAll(maxRows)
                .stream()
                .map(article -> new ArticleListViewModel.ArticleListItemViewModel(article.ar1Uuid, article.ar1TitleMainTranslation))
                .collect(Collectors.toList());

        return new ArticleListViewModel(items);
    }
}

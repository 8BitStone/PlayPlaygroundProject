package templateengine.v2.viewmodelfactories;

import models.ebean.Article;
import play.mvc.Http;
import templateengine.v2.viewmodels.ArticleListViewModel;
import utils.Attrs;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ArticleListViewModelFactory implements IViewModelFactory<ArticleListViewModel> {

    private int maxRows;

    @Override
    public IViewModelFactory<ArticleListViewModel> collectData(Http.Request request) {
        maxRows = request.queryString("maxRows")
                .flatMap(value -> {
                    try {
                        return Optional.of(Integer.parseInt(value));
                    }
                    catch (NumberFormatException e) {
                        return Optional.empty();
                    }
                })
                .orElse(10);

        return this;
    }

    @Override
    public ArticleListViewModel buildViewModel() {
        final List<ArticleListViewModel.ArticleListItemViewModel> items = Article.findAll(maxRows)
                .stream()
                .map(article -> new ArticleListViewModel.ArticleListItemViewModel(article.ar1Uuid, article.ar1TitleMainTranslation))
                .collect(Collectors.toList());

        return new ArticleListViewModel(items, maxRows);
    }
}

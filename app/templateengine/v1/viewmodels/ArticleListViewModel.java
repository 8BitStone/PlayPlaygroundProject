package templateengine.v1.viewmodels;

import models.ebean.Article;

import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

public class ArticleListViewModel implements IViewModel{
    private final List<Article> articles;

    public ArticleListViewModel(List<Article> articles) {
        this.articles = articles;
    }

    public Map<UUID, String> getArticles(){
        return articles.stream()
                .collect(Collectors.toMap(a -> a.ar1Uuid, a -> a.ar1TitleMainTranslation));
    }
}

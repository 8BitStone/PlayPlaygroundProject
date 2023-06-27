package templateengine.v2.viewmodels;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.UUID;

public class ArticleListViewModel{
    @JsonProperty("article_items")
    public final List<ArticleListItemViewModel> articleItems;
    @JsonProperty("max_rows")
    public final int maxRows;

    public ArticleListViewModel(List<ArticleListItemViewModel> articleItems, int maxRows) {
        this.articleItems = articleItems;
        this.maxRows = maxRows;
    }

    public static class ArticleListItemViewModel{
        public final UUID uuid;
        public final String name;

        public ArticleListItemViewModel(UUID uuid, String name) {
            this.uuid = uuid;
            this.name = name;
        }
    }
}

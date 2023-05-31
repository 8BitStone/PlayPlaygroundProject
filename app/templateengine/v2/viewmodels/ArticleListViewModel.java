package templateengine.v2.viewmodels;

import java.util.List;
import java.util.UUID;

public class ArticleListViewModel{
    public final List<ArticleListItemViewModel> articleItems;

    public ArticleListViewModel(List<ArticleListItemViewModel> articleItems) {
        this.articleItems = articleItems;
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

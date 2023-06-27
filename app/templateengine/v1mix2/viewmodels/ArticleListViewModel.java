package templateengine.v1mix2.viewmodels;

import java.util.List;
import java.util.UUID;

public class ArticleListViewModel{
    public final List<ArticleListItemViewModel> articleItems;
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

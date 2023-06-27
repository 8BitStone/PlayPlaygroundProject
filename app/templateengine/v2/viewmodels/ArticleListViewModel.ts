export interface ArticleListViewModel{
    article_items: ArticleListItemViewModel[];
    max_rows: number;
}

export interface ArticleListItemViewModel{
    uuid: string;
    name: string;
}
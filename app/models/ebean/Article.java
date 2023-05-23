package models.ebean;

import io.ebean.Finder;
import io.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "article")
public class Article extends Model {

    public static Finder<UUID, Article> FIND = new Finder<>(Article.class);

    @Id
    public UUID ar1Uuid;

    public String ar1TitleMainTranslation;

//    public UUID ar1ArticleBucketUuid;
//    public UUID ar1TitleTranslationKey;
//    public String ar1TitleMainTranslation;
//    public UUID ar1DescriptionTranslationKey;
//    public String ar1Number;
//    public String ar1Manufacturer;
//    public BigDecimal ar1Price;
//    public String ar1UrlHandle;
//    public boolean ar1ShowInShop;

    public static List<UUID> findAllIds(){
        return FIND.query()
                .select("ar1Uuid")
                .findSingleAttributeList();
    }

    public static List<Article> findAll(int maxRows){
        return FIND.query()
                .setMaxRows(maxRows)
                .findList();
    }
}
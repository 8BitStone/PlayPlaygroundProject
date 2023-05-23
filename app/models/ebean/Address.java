package models.ebean;

import io.ebean.Finder;
import io.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;
import java.util.UUID;
import java.util.Optional;

@Entity
@Table(name = "address")
public class Address extends Model {

    public static Finder<UUID, Address> FIND = new Finder<>(Address.class);

    @Id
    public UUID a1Uuid;

    public String a1Name;
//    public String a1Street;
//    public String a1City;

    public static List<UUID> findAllIds(){
        return FIND.query()
                .select("a1Uuid")
                .findSingleAttributeList();
    }

    public static List<UUID> findAllIds(int maxRows){
        return FIND.query()
                .select("a1Uuid")
                .setMaxRows(maxRows)
                .findSingleAttributeList();
    }

    public static Optional<Address> findFirstAddress(){
        return FIND.query()
                .setMaxRows(1)
                .findOneOrEmpty();
    }
}
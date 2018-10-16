import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;

@Entity
public class Pays implements Serializable {
    @Id
    private String Id;
    private String name;
    private String langue;
    //@OneToMany
    //private Acteur acteur;
    //private <Genre> genres;


    public Pays(String id, String name, String langue) {
        Id = id;
        this.name = name;
        this.langue = langue;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLangue() {
        return langue;
    }

    public void setLangue(String langue) {
        this.langue = langue;
    }
}

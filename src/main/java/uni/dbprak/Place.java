package uni.dbprak;

import javax.persistence.*;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Place {

    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;


    public int getId() { return id; }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

}

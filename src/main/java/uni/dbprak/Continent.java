package uni.dbprak;

import javax.persistence.*;

@Entity
@Table(name="continent")
public class Continent {
    @Id
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    public Continent(String name) {
        this.name = name;
    };

    public Continent() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}



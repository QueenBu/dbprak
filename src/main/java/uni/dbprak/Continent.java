package uni.dbprak;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name="continent")
public class Continent {
    @Id
    //@GeneratedValue
    private long id;

    @Column(name="name")
    private String name;

    public Continent(String name) {
        this.name = name;
    };

    public Continent(String name, Long id) {
        this.name = name;
        this.id = id;
    };

    public Continent() {
    }

    public long getId() {
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



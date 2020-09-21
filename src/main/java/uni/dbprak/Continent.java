package uni.dbprak;

import javax.persistence.*;

@Entity
@Table(name="continent")
public class Continent {
    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;
}

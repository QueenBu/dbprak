package uni.dbprak;

import javax.persistence.*;

@Entity
@Table(name="city")
public class City {
    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

}

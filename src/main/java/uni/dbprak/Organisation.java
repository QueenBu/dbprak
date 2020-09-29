package uni.dbprak;

import javax.persistence.*;
import java.math.BigInteger;

@MappedSuperclass
public class Organisation {

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

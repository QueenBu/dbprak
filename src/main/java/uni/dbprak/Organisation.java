package uni.dbprak;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Organisation {
    @Id
    @Column(name="id")
    private BigInteger id;
    @Column(name="name")
    private String name;
}

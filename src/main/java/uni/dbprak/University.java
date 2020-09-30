package uni.dbprak;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name="university")
public class University extends Organisation{

    @JoinColumn(name="islocatedin")
    @ManyToOne
    private City isLocatedIn;
}

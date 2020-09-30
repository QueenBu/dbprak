package uni.dbprak;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Company")
public class Company extends Organisation{

    @JoinColumn(name="islocatedin")
    @ManyToOne
    private Country isLocatedIn;
}

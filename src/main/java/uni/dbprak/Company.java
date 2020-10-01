package uni.dbprak;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="Company")
@PrimaryKeyJoinColumn(name="ID")
public class Company extends Organisation {

    @JoinColumn(name="islocatedin")
    @ManyToOne
    private Country isLocatedIn;

    @OneToMany(mappedBy = "compid")
    private Set<WorksAt> worksAt = new HashSet<WorksAt>();
}

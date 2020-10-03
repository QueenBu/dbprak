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

    public Company() {
    }

    public Company(Country isLocatedIn, Set<WorksAt> worksAt) {
        this.isLocatedIn = isLocatedIn;
        this.worksAt = worksAt;
    }

    public Country getIsLocatedIn() {
        return isLocatedIn;
    }

    public Set<WorksAt> getWorksAt() {
        return worksAt;
    }

    public void setIsLocatedIn(Country isLocatedIn) {
        this.isLocatedIn = isLocatedIn;
    }

    public void setWorksAt(Set<WorksAt> worksAt) {
        this.worksAt = worksAt;
    }
}

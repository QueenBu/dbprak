package uni.dbprak;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="City")
@PrimaryKeyJoinColumn(name="id")
public class City extends Place {

    @OneToMany(mappedBy = "isLocatedIn")
    private Set<Person> persons;

    @OneToMany(mappedBy = "isLocatedIn")
    private Set<University> universities;

    @ManyToOne
    @JoinColumn(name = "isPartOf")
    private Country isPartOf;

    public Set<Person> getPersons() {
        return persons;
    }
}

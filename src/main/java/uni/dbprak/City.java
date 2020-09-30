package uni.dbprak;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="City")
@PrimaryKeyJoinColumn(name="id")
public class City extends Place {

    @OneToMany
    @JoinColumn(name="isLocatedIn")
    private Set<Person> persons;

    @OneToMany
    @JoinColumn(name="islocatedin")
    private Set<University> universities;

    @ManyToOne
    @JoinColumn(name = "isPartOf")
    private Country isPartOf;

    public Set<Person> getPersons() {
        return persons;
    }

    public void setPersons(Set<Person> persons) {
        this.persons = persons;
    }

    public Set<University> getUniversities() {
        return universities;
    }

    public void setUniversities(Set<University> universities) {
        this.universities = universities;
    }

    public Country getIsPartOf() {
        return isPartOf;
    }

    public void setIsPartOf(Country isPartOf) {
        this.isPartOf = isPartOf;
    }

    public City() {
    }
}

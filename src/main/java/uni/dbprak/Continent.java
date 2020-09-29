package uni.dbprak;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="continent")
public class Continent extends Place{

    @OneToMany(mappedBy="isPartOf")
    private Set<Country> countries;

    public Set<Country> getCountries() {
        return countries;
    }
    public void setCountries(Set<Country> countries) {
        this.countries = countries;
    }
}



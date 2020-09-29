package uni.dbprak;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="country")
public class Country extends Place{

    @OneToMany
    //@OneToMany(mappedBy = "ispartof")
    private Set<City> cities;

    public Set<City> getCities() {
        return cities;
    }

    public void setCities(Set<City> cities) {
        this.cities = cities;
    }
}

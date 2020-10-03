package uni.dbprak;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="country")
public class Country extends Place{

    @OneToMany
    //@OneToMany(mappedBy = "ispartof")
    private Set<City> cities;

    @ManyToOne
    @JoinColumn(name = "isPartOf")
    private Continent isPartOf;

    public Country() {
    }

    /**
     * Constructor for Country
     * @param cities
     * @param isPartOf
     */
    public Country(Set<City> cities, Continent isPartOf) {
        this.cities = cities;
        this.isPartOf = isPartOf;
    }

    public Set<City> getCities() {
        return cities;
    }

    public void setCities(Set<City> cities) {
        this.cities = cities;
    }

    public Continent getIsPartOf() {
        return isPartOf;
    }

    public void setIsPartOf(Continent isPartOf) {
        this.isPartOf = isPartOf;
    }
}

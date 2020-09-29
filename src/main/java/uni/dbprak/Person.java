package uni.dbprak;

import net.minidev.json.annotate.JsonIgnore;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="person")
public class Person{
    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;

    @Column(name="firstname")
    private String firstName;

    @Column(name="lastname")
    private String lastName;

    @Column(name="gender")
    private String gender;

    @Column(name="birthday")
    private Date birthday;

    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    @Column(name="creationdate", nullable = false, updatable = false)
    private Date creationDate;

    @Column(name="locationip")
    private String locationIP;

    @Column(name="browserused")
    private String browserUsed;

    @JoinColumn(name="islocatedin", nullable = false)
    //@JsonIgnore
    private City isLocatedIn;

    public Person() {}
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

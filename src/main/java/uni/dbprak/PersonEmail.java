package uni.dbprak;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name="personemail")
public class PersonEmail {
    @Id
    @GeneratedValue
    @Column(name="id")
    private BigInteger id;
    @ManyToOne
    @JoinColumn(name = "persid")
    private Person persid;
    @Column(name="email")
    private String email;

    public PersonEmail() { }
    public BigInteger getId() { return id; }
    public Person getPersid() {
        return persid;
    }
    public String getEmail() {
        return email;
    }
}

package uni.dbprak;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name="personspeaks")
public class PersonSpeaks {
    @Id
    @GeneratedValue
    @Column(name="id")
    private BigInteger id;
    @ManyToOne
    @JoinColumn(name = "persid")
    private Person persid;
    @Column(name="speaks")
    private String speaks;

    public PersonSpeaks() { }
    public BigInteger getId() { return id; }
    public Person getPersid() { return persid; }
    public String getSpeaks() { return speaks; }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public void setPersid(Person persid) {
        this.persid = persid;
    }

    public void setSpeaks(String speaks) {
        this.speaks = speaks;
    }
}

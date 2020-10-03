package uni.dbprak;

import javax.persistence.*;
import java.time.OffsetDateTime;

@Entity
@IdClass(KnowsID.class)
public class Knows {

    @Id
    @ManyToOne
    @JoinColumn(name="pers1")
    private Person pers1;
    @Id
    @ManyToOne
    @JoinColumn(name="pers2")
    private Person pers2;
    @Column(name="creationdate")
    private OffsetDateTime creationDate;

    public Knows() {
    }

    public Knows(Person pers1, Person pers2, OffsetDateTime creationDate) {
        this.pers1 = pers1;
        this.pers2 = pers2;
        this.creationDate = creationDate;
    }

    public Person getPers1() {
        return pers1;
    }

    public void setPers1(Person pers1) {
        this.pers1 = pers1;
    }

    public Person getPers2() {
        return pers2;
    }

    public void setPers2(Person pers2) {
        this.pers2 = pers2;
    }

    public OffsetDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(OffsetDateTime creationDate) {
        this.creationDate = creationDate;
    }
}

package uni.dbprak;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.io.Serializable;

public class KnowsID implements Serializable {

    @Id
    @OneToOne
    @JoinColumn(name="pers1")
    private Person pers1;

    @Id
    @OneToOne
    @JoinColumn(name="pers2")
    private Person pers2;

    public KnowsID() {
    }

    public KnowsID(Person pers1, Person pers2) {
        this.pers1 = pers1;
        this.pers2 = pers2;
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
}

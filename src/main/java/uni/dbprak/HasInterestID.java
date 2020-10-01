package uni.dbprak;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.io.Serializable;

public class HasInterestID implements Serializable {
    @Id
    @OneToOne
    @JoinColumn(name="persid")
    private Person persid;
    @Id
    @OneToOne
    @JoinColumn(name="tagid")
    private Tag tagid;

    public HasInterestID() {
    }

    public HasInterestID(Person persid, Tag tagid) {
        this.persid = persid;
        this.tagid = tagid;
    }

    public Person getPersid() {
        return persid;
    }

    public Tag getTagid() {
        return tagid;
    }
}

package uni.dbprak;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.io.Serializable;

public class IsSubclassOfID implements Serializable {
    @Id
    @OneToOne
    @JoinColumn(name="tagclassid")
    private TagClass tagclassid;
    @Id
    @OneToOne
    @JoinColumn(name="subclassid")
    private TagClass subclassid;

    public IsSubclassOfID() {
    }

    public TagClass getTagclassid() {
        return tagclassid;
    }

    public TagClass getSubclassid() {
        return subclassid;
    }
}

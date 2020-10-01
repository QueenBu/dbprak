package uni.dbprak;

import jdk.jfr.Enabled;

import javax.persistence.*;

@Entity
@IdClass(IsSubclassOfID.class)
public class IsSubclassOf {

    @Id
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "tagclassid")
    private TagClass tagclassid;
    @Id
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "subclassid")
    private TagClass subclassid;

    public IsSubclassOf() {
    }

    public IsSubclassOf(TagClass tagclassid, TagClass subclassid) {
        this.tagclassid = tagclassid;
        this.subclassid = subclassid;
    }

    public TagClass getTagclassid() {
        return tagclassid;
    }

    public TagClass getSubclassid() {
        return subclassid;
    }
}

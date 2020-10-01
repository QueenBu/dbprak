package uni.dbprak;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name="tag")
//@SecondaryTable(name="hastype")
@SecondaryTable(name="hastype", pkJoinColumns={@PrimaryKeyJoinColumn(name="tagid") })

public class Tag {
    @Id
    @GeneratedValue
    @Column(name="id")
    private BigInteger id;
    @Column(name="tagname")
    private String tagName;
    //maybe this should be a set?
    @JoinColumn(name="tagclassid", table="hastype")
    @OneToOne
    private TagClass hasType;


    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public TagClass getHasType() {
        return hasType;
    }
}

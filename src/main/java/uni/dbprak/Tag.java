package uni.dbprak;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

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
    @OneToMany(mappedBy = "tagid")
    private Set<ForumHasTag> forumHasTag = new HashSet<ForumHasTag>();
    @OneToMany(mappedBy = "tagid")
    private Set<PostHasTag> postHasTag = new HashSet<PostHasTag>();
    @OneToMany(mappedBy = "commentid")
    private Set<CommentHasTag> commentHasTag = new HashSet<CommentHasTag>();
    @OneToMany(mappedBy = "tagid")
    private Set<HasInterest> hasInterests = new HashSet<HasInterest>();




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

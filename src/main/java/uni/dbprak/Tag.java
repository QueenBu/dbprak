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

    public Tag() {
    }

    public Tag(BigInteger id, String tagName, TagClass hasType, Set<ForumHasTag> forumHasTag, Set<PostHasTag> postHasTag, Set<CommentHasTag> commentHasTag, Set<HasInterest> hasInterests) {
        this.id = id;
        this.tagName = tagName;
        this.hasType = hasType;
        this.forumHasTag = forumHasTag;
        this.postHasTag = postHasTag;
        this.commentHasTag = commentHasTag;
        this.hasInterests = hasInterests;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public TagClass getHasType() {
        return hasType;
    }

    public void setHasType(TagClass hasType) {
        this.hasType = hasType;
    }

    public Set<ForumHasTag> getForumHasTag() {
        return forumHasTag;
    }

    public void setForumHasTag(Set<ForumHasTag> forumHasTag) {
        this.forumHasTag = forumHasTag;
    }

    public Set<PostHasTag> getPostHasTag() {
        return postHasTag;
    }

    public void setPostHasTag(Set<PostHasTag> postHasTag) {
        this.postHasTag = postHasTag;
    }

    public Set<CommentHasTag> getCommentHasTag() {
        return commentHasTag;
    }

    public void setCommentHasTag(Set<CommentHasTag> commentHasTag) {
        this.commentHasTag = commentHasTag;
    }

    public Set<HasInterest> getHasInterests() {
        return hasInterests;
    }

    public void setHasInterests(Set<HasInterest> hasInterests) {
        this.hasInterests = hasInterests;
    }
}

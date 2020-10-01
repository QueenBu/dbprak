package uni.dbprak;

import javax.persistence.*;

@Entity
@IdClass(ForumHasTagID.class)
public class ForumHasTag {
    @Id
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "forumid")
    private Forum forumid;
    @Id
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "tagid")
    private Tag tagid;

    //the usual Stuff

    public ForumHasTag() {
    }

    public ForumHasTag(Forum forumid, Tag tagid) {
        this.forumid = forumid;
        this.tagid = tagid;
    }

    public Forum getForumid() {
        return forumid;
    }

    public Tag getTagid() {
        return tagid;
    }

    public void setForumid(Forum forumid) {
        this.forumid = forumid;
    }

    public void setTagid(Tag tagid) {
        this.tagid = tagid;
    }
}

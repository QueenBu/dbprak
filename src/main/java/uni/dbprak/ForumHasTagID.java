package uni.dbprak;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.io.Serializable;

public class ForumHasTagID implements Serializable {
    @Id
    @OneToOne
    @JoinColumn(name="forumid")
    private Forum forumid;
    @Id
    @OneToOne
    @JoinColumn(name="tagid")
    private Tag tagid;

    //Constructor Getter Setter


    public ForumHasTagID() {
    }

    public ForumHasTagID(Forum forumid, Tag tagid) {
        this.forumid = forumid;
        this.tagid = tagid;
    }

    public Forum getForumid() {
        return forumid;
    }

    public void setForumid(Forum forumid) {
        this.forumid = forumid;
    }

    public Tag getTagid() {
        return tagid;
    }

    public void setTagid(Tag tagid) {
        this.tagid = tagid;
    }
}

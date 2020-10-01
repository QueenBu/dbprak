package uni.dbprak;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.io.Serializable;

public class CommentHasTagID implements Serializable {
    @Id
    @OneToOne
    @JoinColumn(name="commentid")
    private Comment commentid;
    @Id
    @OneToOne
    @JoinColumn(name="tagid")
    private Tag tagid;

    public CommentHasTagID() {
    }

    public CommentHasTagID(Comment commentid, Tag tagid) {
        this.commentid = commentid;
        this.tagid = tagid;
    }

    public Comment getCommentid() {
        return commentid;
    }

    public Tag getTagid() {
        return tagid;
    }
}

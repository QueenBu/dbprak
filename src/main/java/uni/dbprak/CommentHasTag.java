package uni.dbprak;

import javax.persistence.*;

@Entity
@IdClass(CommentHasTagID.class)
public class CommentHasTag {
    @Id
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "commentid")
    private Comment commentid;
    @Id
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "tagid")
    private Tag tagid;

    //the usual Stuff

    public CommentHasTag() {
    }

    public CommentHasTag(Comment commentid, Tag tagid) {
        this.commentid = commentid;
        this.tagid = tagid;
    }

    public Comment getCommentid() {
        return commentid;
    }

    public Tag getTagid() {
        return tagid;
    }

    public void setCommentid(Comment commentid) {
        this.commentid = commentid;
    }

    public void setTagid(Tag tagid) {
        this.tagid = tagid;
    }
}

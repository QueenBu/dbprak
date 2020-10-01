package uni.dbprak;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.io.Serializable;

public class LikesCommentID implements Serializable {
    @Id
    @OneToOne
    @JoinColumn(name="personid")
    private Person personid;
    @Id
    @OneToOne
    @JoinColumn(name="commentid")
    private Comment commentid;


    public LikesCommentID() {
    }

    public LikesCommentID(Person personid, Comment commentid) {
        this.personid = personid;
        this.commentid = commentid;
    }

    public Person getPersonid() {
        return personid;
    }

    public void setPersonid(Person personid) {
        this.personid = personid;
    }

    public Comment getCommentid() {
        return commentid;
    }

    public void setCommentid(Comment commentid) {
        this.commentid = commentid;
    }
}

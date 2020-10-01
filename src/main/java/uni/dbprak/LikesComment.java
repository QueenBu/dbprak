package uni.dbprak;

import javax.persistence.*;
import java.time.OffsetDateTime;

@Entity
@IdClass(LikesCommentID.class)
@Table(name="likescomment")
public class LikesComment {

    @Id
    //@ManyToOne(cascade = CascadeType.ALL)
    @ManyToOne
    @JoinColumn(name = "personid")
    private Person personid;
    @Id
    @ManyToOne
    //@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "commentid")
    private Comment commentid;
    @Column(name="lc_creationdate")
    private OffsetDateTime creationdate;

    public LikesComment() {
    }

    public LikesComment(Person personid, Comment commentid, OffsetDateTime creationdate) {
        this.personid = personid;
        this.commentid = commentid;
        this.creationdate = creationdate;
    }

    public Person getPersonid() {
        return personid;
    }

    public void setPersonId(Person personid) {
        this.personid = personid;
    }

    public Comment getCommentid() {
        return commentid;
    }

    public void setCommentId(Comment commentid) {
        this.commentid = commentid;
    }

    public OffsetDateTime getCreationdate() {
        return creationdate;
    }

    public void setCreationdate(OffsetDateTime creationdate) {
        this.creationdate = creationdate;
    }
}

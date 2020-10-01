package uni.dbprak;

import javax.persistence.*;
import java.time.OffsetDateTime;

@Entity
@IdClass(LikesPostID.class)
@Table(name = "likespost")
public class LikesPost {

    @Id
    @ManyToOne
    @JoinColumn(name="personid")
    private Person personid;

    @Id
    @ManyToOne
    @JoinColumn(name="postid")
    private Post postid;

    @Column(name="lp_creationdate")
    private OffsetDateTime creationdate;

    public LikesPost() {
    }

    public LikesPost(Person personid, Post postId, OffsetDateTime creationdate) {
        this.personid = personid;
        this.postid = postid;
        this.creationdate = creationdate;
    }

    public Person getPersonid() {
        return personid;
    }

    public void setPersonid(Person personid) {
        this.personid = personid;
    }

    public Post getPostId() {
        return postid;
    }

    public void setPostId(Post postId) {
        this.postid = postId;
    }

    public OffsetDateTime getCreationdate() {
        return creationdate;
    }

    public void setCreationdate(OffsetDateTime creationdate) {
        this.creationdate = creationdate;
    }
}

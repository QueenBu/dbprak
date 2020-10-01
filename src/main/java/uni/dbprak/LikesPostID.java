package uni.dbprak;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.io.Serializable;

public class LikesPostID implements Serializable {

    @Id
    @OneToOne
    @JoinColumn(name = "personid")
    private Person personid;
    @Id
    @OneToOne
    @JoinColumn(name = "postid")
    private Post postid;

    public LikesPostID() {
    }

    public LikesPostID(Person personid, Post postid) {
        this.personid = personid;
        this.postid = postid;
    }

    public Person getPersonid() {
        return personid;
    }

    public void setPersonid(Person personid) {
        this.personid = personid;
    }

    public Post getPostid() {
        return postid;
    }

    public void setPostid(Post postid) {
        this.postid = postid;
    }
}

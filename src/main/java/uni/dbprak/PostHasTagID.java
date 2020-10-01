package uni.dbprak;

import javax.persistence.*;
import java.io.Serializable;

public class PostHasTagID implements Serializable {
    @Id
    @OneToOne
    @JoinColumn(name="postid")
    private Post postid;
    @Id
    @OneToOne
    @JoinColumn(name="tagid")
    private Tag tagid;

    public PostHasTagID() {
    }

    public PostHasTagID(Post postid, Tag tagid) {
        this.postid = postid;
        this.tagid = tagid;
    }

    public Post getPostid() {
        return postid;
    }

    public Tag getTagid() {
        return tagid;
    }
}

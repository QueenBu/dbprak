package uni.dbprak;

import javax.persistence.*;

@Entity
@IdClass(PostHasTagID.class)
public class PostHasTag {
    @Id
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "postid")
    private Post postid;
    @Id
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "tagid")
    private Tag tagid;

    //the usual Stuff

    public PostHasTag() {
    }

    public PostHasTag(Post postid, Tag tagid) {
        this.postid = postid;
        this.tagid = tagid;
    }

    public Post getPostid() {
        return postid;
    }

    public Tag getTagid() {
        return tagid;
    }

    public void setPostid(Post postid) {
        this.postid = postid;
    }

    public void setTagid(Tag tagid) {
        this.tagid = tagid;
    }
}

package uni.dbprak;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="post")
@PrimaryKeyJoinColumn(name="id")
public class Post extends Message{
    @Column(name="lang")
    private String language;
    @Column(name="imagefile")
    private String imageFile;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "forumid")
    private Forum forum;
    @OneToMany(mappedBy = "postid")
    private Set<LikesPost> likesPost= new HashSet<LikesPost>();
    @OneToMany(mappedBy = "postid")
    private Set<PostHasTag> postHasTag = new HashSet<PostHasTag>();

    public Post() {
    }

    public Post(String language, String imageFile, Forum forum, Set<LikesPost> likesPost, Set<PostHasTag> postHasTag) {
        this.language = language;
        this.imageFile = imageFile;
        this.forum = forum;
        this.likesPost = likesPost;
        this.postHasTag = postHasTag;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getImageFile() {
        return imageFile;
    }

    public void setImageFile(String imageFile) {
        this.imageFile = imageFile;
    }

    public Forum getForum() {
        return forum;
    }

    public void setForum(Forum forum) {
        this.forum = forum;
    }

    public Set<LikesPost> getLikesPost() {
        return likesPost;
    }

    public void setLikesPost(Set<LikesPost> likesPost) {
        this.likesPost = likesPost;
    }

    public Set<PostHasTag> getPostHasTag() {
        return postHasTag;
    }

    public void setPostHasTag(Set<PostHasTag> postHasTag) {
        this.postHasTag = postHasTag;
    }
}

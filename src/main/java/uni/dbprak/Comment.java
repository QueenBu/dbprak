package uni.dbprak;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="comment")
@PrimaryKeyJoinColumn(name="id")
public class Comment extends Message{

    @JoinColumn(name="replyofcomment")
    @ManyToOne
    private Comment replyOfComment;

    @JoinColumn(name="replyofpost")
    @ManyToOne
    private Post replyOfPost;

    @OneToMany(mappedBy="commentid", fetch = FetchType.LAZY)
    private Set<LikesComment> likesComments= new HashSet<LikesComment>();

    @OneToMany(mappedBy = "commentid")
    private Set<CommentHasTag> commentHasTag = new HashSet<CommentHasTag>();


    //Getter
    public Comment() {
    }

    public Comment getReplyOfComment() {
        return replyOfComment;
    }

    public Post getReplyOfPost() {
        return replyOfPost;
    }

    public Set<LikesComment> getLikesComments() {
        return likesComments;
    }

    public Set<CommentHasTag> getCommentHasTag() {
        return commentHasTag;
    }
}

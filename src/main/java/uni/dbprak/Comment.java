package uni.dbprak;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;

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

}

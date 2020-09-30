package uni.dbprak;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;

@Entity
@Table(name="comment")
@PrimaryKeyJoinColumn(name="id")
public class Comment extends Message{

    private Message replyOf;
    //private Comment replyOfComment;
    //private Post replyOfPost;

}

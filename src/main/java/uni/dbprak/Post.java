package uni.dbprak;

import javax.persistence.*;
import java.math.BigInteger;

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
}

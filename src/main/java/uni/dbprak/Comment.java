package uni.dbprak;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;

@Entity
@Table(name="comment")
public class Comment implements Message {

    @Id
    @GeneratedValue
    @Column(name="id")
    private BigInteger id;
    @Column(name="creationDate")
    private Timestamp creationDate;
    @Column(name="locationip")
    private String locationIP;
    @Column(name="browserused")
    private String browserUsed;
    @Column(name="content")
    private String content;
    @Column(name="length")
    private BigInteger length;
    private BigInteger creator;
    private BigInteger isLocatedIn;
    private BigInteger replyOf;

}

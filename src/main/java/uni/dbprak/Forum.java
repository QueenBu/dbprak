package uni.dbprak;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;

@Entity
@Table(name="forum")
public class Forum {

    @Id
    @GeneratedValue
    @Column(name="id")
    private BigInteger id;
    @Column(name="title")
    private String title;
    @Column(name="creationDate")
    private Timestamp creationDate;
    @JoinColumn(name="moderator")
    @ManyToOne
    private Person moderator;

}

package uni.dbprak;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;

@MappedSuperclass
public class Message {

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
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "creator")
    private Person creator;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn( name = "isLocatedIn")
    private Country isLocatedIn;

    public Message() {
    }

    public BigInteger getId() {
        return id;
    }

    public Timestamp getCreationDate() {
        return creationDate;
    }

    public String getLocationIP() {
        return locationIP;
    }

    public String getBrowserUsed() {
        return browserUsed;
    }

    public String getContent() {
        return content;
    }

    public BigInteger getLength() {
        return length;
    }

    public Person getCreator() {
        return creator;
    }

    public Country getIsLocatedIn() {
        return isLocatedIn;
    }
}

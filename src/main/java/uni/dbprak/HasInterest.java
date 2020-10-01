package uni.dbprak;

import javax.persistence.*;

@Entity
@IdClass(HasInterestID.class)
public class HasInterest {
    @Id
    @ManyToOne
    @JoinColumn(name = "persid")
    private Person persid;
    @Id
    @ManyToOne
    @JoinColumn(name = "tagid")
    private Tag tagid;

    public HasInterest() {
    }

    public Person getPersid() {
        return persid;
    }

    public Tag getTagid() {
        return tagid;
    }
}

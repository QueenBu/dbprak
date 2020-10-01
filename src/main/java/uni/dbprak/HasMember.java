package uni.dbprak;

import javax.persistence.*;
import java.util.Date;

@Entity
@IdClass(HasMemberID.class)
public class HasMember {
    @Id
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "forumid")
    private Forum forumid;
    @Id
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "persid")
    private Person persid;

    private Date joindate;

    public HasMember() {
    }

    public HasMember(Forum forumid, Person persid, Date joindate) {
        this.forumid = forumid;
        this.persid = persid;
        this.joindate = joindate;
    }
}

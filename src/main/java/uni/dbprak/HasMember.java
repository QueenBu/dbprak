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

    public Forum getForumid() {
        return forumid;
    }

    public void setForumid(Forum forumid) {
        this.forumid = forumid;
    }

    public Person getPersid() {
        return persid;
    }

    public void setPersid(Person persid) {
        this.persid = persid;
    }

    public Date getJoindate() {
        return joindate;
    }

    public void setJoindate(Date joindate) {
        this.joindate = joindate;
    }
}

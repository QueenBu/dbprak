package uni.dbprak;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.io.Serializable;

public class HasMemberID implements Serializable {
    @Id
    @OneToOne
    @JoinColumn(name="forumid")
    private Forum forumid;
    @Id
    @OneToOne
    @JoinColumn(name="persid")
    private Person persid;

    public HasMemberID() {
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
}

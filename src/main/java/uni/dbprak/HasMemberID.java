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
}

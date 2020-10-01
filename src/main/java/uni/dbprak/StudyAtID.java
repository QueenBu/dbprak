package uni.dbprak;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.io.Serializable;

public class StudyAtID implements Serializable {
    @Id
    @OneToOne
    @JoinColumn(name = "persid")
    private Person persid;
    @Id
    @OneToOne
    @JoinColumn(name = "uniid")
    private University uniid;

    public StudyAtID() {
    }

    public StudyAtID(Person persid, University uniid) {
        this.persid = persid;
        this.uniid = uniid;
    }

    public Person getPersid() {
        return persid;
    }

    public void setPersid(Person persid) {
        this.persid = persid;
    }

    public University getUniid() {
        return uniid;
    }

    public void setUniid(University uniid) {
        this.uniid = uniid;
    }
}

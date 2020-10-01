package uni.dbprak;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.io.Serializable;

public class WorksAtID implements Serializable {
    @Id
    @OneToOne
    @JoinColumn(name="persid")
    private Person persid;
    @Id
    @OneToOne
    @JoinColumn(name="compid")
    private Company compid;

    public WorksAtID() {
    }

    public WorksAtID(Person persid, Company compid) {
        this.persid = persid;
        this.compid = compid;
    }

    public Person getPersid() {
        return persid;
    }

    public void setPersid(Person persid) {
        this.persid = persid;
    }

    public Company getCompid() {
        return compid;
    }

    public void setCompid(Company compid) {
        this.compid = compid;
    }
}

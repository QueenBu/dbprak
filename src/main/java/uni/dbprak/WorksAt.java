package uni.dbprak;

import javax.persistence.*;

@Entity
@IdClass(WorksAtID.class)
@Table(name="worksat")
public class WorksAt {
    @Id
    @ManyToOne
    @JoinColumn(name="persid")
    private Person persid;
    @Id
    @ManyToOne
    @JoinColumn(name="compid")
    private University compid;

    private int workfrom;

    public WorksAt() {
    }

    public WorksAt(Person persid, University compid, int workfrom) {
        this.persid = persid;
        this.compid = compid;
        this.workfrom = workfrom;
    }

    public Person getPersid() {
        return persid;
    }

    public void setPersid(Person persid) {
        this.persid = persid;
    }

    public University getCompid() {
        return compid;
    }

    public void setCompid(University compid) {
        this.compid = compid;
    }

    public int getWorkfrom() {
        return workfrom;
    }

    public void setWorkfrom(int workfrom) {
        this.workfrom = workfrom;
    }
}

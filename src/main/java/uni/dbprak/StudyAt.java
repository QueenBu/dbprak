package uni.dbprak;

import javax.persistence.*;

@Entity
@IdClass(StudyAtID.class)
@Table(name="studyat")
public class StudyAt {
    @Id
    @ManyToOne
    @JoinColumn(name="persid")
    private Person persid;
    @Id
    @ManyToOne
    @JoinColumn(name="uniid")
    private University uniid;
    @Column(name="classyear")
    private int classyear;

    public StudyAt() {
    }

    public StudyAt(Person persid, University uniid, int classyear) {
        this.persid = persid;
        this.uniid = uniid;
        this.classyear = classyear;
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

    public int getClassyear() {
        return classyear;
    }

    public void setClassyear(int classyear) {
        this.classyear = classyear;
    }
}

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
}

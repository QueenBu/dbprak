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
}

package uni.dbprak;

import javax.persistence.*;
import java.time.OffsetDateTime;

@Entity
@IdClass(KnowsID.class)
public class Knows {

    @Id
    @ManyToOne
    @JoinColumn(name="pers1")
    private Person pers1;
    @Id
    @ManyToOne
    @JoinColumn(name="pers2")
    private Person pers2;
    @Column(name="creationdate")
    private OffsetDateTime creationDate;

}

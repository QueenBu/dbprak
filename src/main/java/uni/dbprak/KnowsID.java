package uni.dbprak;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.io.Serializable;

public class KnowsID implements Serializable {

    @Id
    @OneToOne
    @JoinColumn(name="pers1")
    private Person pers1;

    @Id
    @OneToOne
    @JoinColumn(name="pers2")
    private Person pers2;
}

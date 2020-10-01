package uni.dbprak;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="university")
@PrimaryKeyJoinColumn(name="ID")
public class University extends Organisation{

    @JoinColumn(name="islocatedin")
    @ManyToOne
    private City isLocatedIn;

    @OneToMany(mappedBy = "uniid")
    private Set<StudyAt> studyAt = new HashSet<StudyAt>();
}

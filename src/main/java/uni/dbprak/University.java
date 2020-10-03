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

    public University() {
    }

    public University(City isLocatedIn, Set<StudyAt> studyAt) {
        this.isLocatedIn = isLocatedIn;
        this.studyAt = studyAt;
    }

    public City getIsLocatedIn() {
        return isLocatedIn;
    }

    public void setIsLocatedIn(City isLocatedIn) {
        this.isLocatedIn = isLocatedIn;
    }

    public Set<StudyAt> getStudyAt() {
        return studyAt;
    }

    public void setStudyAt(Set<StudyAt> studyAt) {
        this.studyAt = studyAt;
    }
}

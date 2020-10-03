package uni.dbprak;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="person")
public class Person{
    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;

    @Column(name="firstname")
    private String firstName;

    @Column(name="lastname")
    private String lastName;

    @Column(name="gender")
    private String gender;

    @Column(name="birthday")
    private Date birthday;

    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    @Column(name="creationdate", nullable = false, updatable = false)
    private Date creationDate;

    @Column(name="locationip")
    private String locationIP;

    @Column(name="browserused")
    private String browserUsed;

    @JoinColumn(name="islocatedin", nullable = false)
    @ManyToOne
    private City isLocatedIn;

    @OneToMany(mappedBy="creator")
    private Set<Comment> comment = new HashSet<Comment>();

    @OneToMany(mappedBy = "persid")
    private Set<StudyAt> studyAt = new HashSet<StudyAt>();

    @OneToMany(mappedBy = "persid")
    private Set<WorksAt> worksAt = new HashSet<WorksAt>();

    @OneToMany(mappedBy = "pers1")
    private Set<Knows> knows1 = new HashSet<Knows>();

    @OneToMany(mappedBy = "pers2")
    private Set<Knows> knows2 = new HashSet<Knows>();

    @OneToMany(mappedBy="personid")
    private Set<LikesComment> likesComments= new HashSet<LikesComment>();

    @OneToMany(mappedBy="personid")
    private Set<LikesPost> likesPost= new HashSet<LikesPost>();

    @OneToMany(mappedBy = "persid")
    private Set<HasMember> hasMember = new HashSet<HasMember>();

    @OneToMany(mappedBy = "persid")
    private Set<HasInterest> hasInterests = new HashSet<HasInterest>();

    @OneToMany(mappedBy = "persid")
    private Set<PersonEmail> personEmails = new HashSet<PersonEmail>();
    @OneToMany(mappedBy = "persid")
    private Set<PersonSpeaks> personSpeaks = new HashSet<PersonSpeaks>();

    //Getters and Setters and stuff
    public Person() {
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public String getLocationIP() {
        return locationIP;
    }

    public String getBrowserUsed() {
        return browserUsed;
    }

    public City getIsLocatedIn() {
        return isLocatedIn;
    }

    public Set<Comment> getComment() {
        return comment;
    }

    public Set<StudyAt> getStudyAt() {
        return studyAt;
    }

    public Set<WorksAt> getWorksAt() {
        return worksAt;
    }

    public Set<Knows> getKnows1() {
        return knows1;
    }

    public Set<Knows> getKnows2() {
        return knows2;
    }

    public Set<LikesComment> getLikesComments() {
        return likesComments;
    }

    public Set<LikesPost> getLikesPost() {
        return likesPost;
    }

    public Set<HasMember> getHasMember() {
        return hasMember;
    }

    public Set<HasInterest> getHasInterests() {
        return hasInterests;
    }

    public Set<PersonEmail> getPersonEmails() {
        return personEmails;
    }

    public Set<PersonSpeaks> getPersonSpeaks() {
        return personSpeaks;
    }
}

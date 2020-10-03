package uni.dbprak;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "forum")
public class Forum {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private BigInteger id;
    @Column(name = "title")
    private String title;
    @Column(name = "creationDate")
    private Timestamp creationDate;
    @JoinColumn(name = "moderator")
    @ManyToOne
    private Person moderator;
    @OneToMany(mappedBy = "forumid")
    private Set<HasMember> hasMember = new HashSet<HasMember>();
    @OneToMany(mappedBy = "forumid")
    private Set<ForumHasTag> forumHasTag = new HashSet<ForumHasTag>();


    public Forum() {
    }

    public Forum(BigInteger id, String title, Timestamp creationDate, Person moderator, Set<HasMember> hasMember, Set<ForumHasTag> forumHasTag) {
        this.id = id;
        this.title = title;
        this.creationDate = creationDate;
        this.moderator = moderator;
        this.hasMember = hasMember;
        this.forumHasTag = forumHasTag;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Timestamp getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Timestamp creationDate) {
        this.creationDate = creationDate;
    }

    public Person getModerator() {
        return moderator;
    }

    public void setModerator(Person moderator) {
        this.moderator = moderator;
    }

    public Set<HasMember> getHasMember() {
        return hasMember;
    }

    public void setHasMember(Set<HasMember> hasMember) {
        this.hasMember = hasMember;
    }

    public Set<ForumHasTag> getForumHasTag() {
        return forumHasTag;
    }

    public void setForumHasTag(Set<ForumHasTag> forumHasTag) {
        this.forumHasTag = forumHasTag;
    }

}

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

    public BigInteger getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Timestamp getCreationDate() {
        return creationDate;
    }

    public Person getModerator() {
        return moderator;
    }

    public Set<HasMember> getHasMember() {
        return hasMember;
    }

    public Set<ForumHasTag> getForumHasTag() {
        return forumHasTag;
    }
}

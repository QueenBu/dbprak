package uni.dbprak;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Set;

@Entity
@Table(name="tagclass")
public class TagClass {
    @Id
    @GeneratedValue
    @Column(name="id")
    private BigInteger id;
    @Column(name="tagclassname")
    private String tagClassName;

    @OneToMany
    private Set<Tag> tags;

    public BigInteger getId() {
        return id;
    }

    public String getTagClassName() {
        return tagClassName;
    }

    public Set<Tag> getTags() {
        return tags;
    }
}

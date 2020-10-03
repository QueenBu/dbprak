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
    @OneToMany(mappedBy = "subclassid")
    private Set<IsSubclassOf> issubclassof;
    @OneToMany(mappedBy = "tagclassid")
    private Set<IsSubclassOf> issuperclassof;

    //Getter and Setter
    public TagClass() {
    }

    public TagClass(BigInteger id, String tagClassName, Set<Tag> tags, Set<IsSubclassOf> issubclassof, Set<IsSubclassOf> issuperclassof) {
        this.id = id;
        this.tagClassName = tagClassName;
        this.tags = tags;
        this.issubclassof = issubclassof;
        this.issuperclassof = issuperclassof;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getTagClassName() {
        return tagClassName;
    }

    public void setTagClassName(String tagClassName) {
        this.tagClassName = tagClassName;
    }

    public Set<Tag> getTags() {
        return tags;
    }

    public void setTags(Set<Tag> tags) {
        this.tags = tags;
    }

    public Set<IsSubclassOf> getIssubclassof() {
        return issubclassof;
    }

    public void setIssubclassof(Set<IsSubclassOf> issubclassof) {
        this.issubclassof = issubclassof;
    }

    public Set<IsSubclassOf> getIssuperclassof() {
        return issuperclassof;
    }

    public void setIssuperclassof(Set<IsSubclassOf> issuperclassof) {
        this.issuperclassof = issuperclassof;
    }
}

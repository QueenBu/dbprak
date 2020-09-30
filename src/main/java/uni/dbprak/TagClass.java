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
    @JoinColumn(name="tagclassid")
    private Set<Tag> tags;
}

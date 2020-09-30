package uni.dbprak;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="post")
@PrimaryKeyJoinColumn(name="id")
public class Post extends Message{
}

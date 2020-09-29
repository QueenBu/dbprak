package uni.dbprak;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="City")
@PrimaryKeyJoinColumn(name="id")
public class City extends Place {

}

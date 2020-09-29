package uni.dbprak;

import javax.persistence.*;
import java.util.Set;

@Entity
@PrimaryKeyJoinColumn(name="ID")
public class City extends Place {

}

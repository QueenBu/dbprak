package uni.dbprak;

import java.math.BigInteger;
import java.sql.Timestamp;

public interface Message {
    Timestamp creationDate = null;
    String browserUsed = null;
    String locationIP = null;
    String content = null;
    BigInteger length = null;
}

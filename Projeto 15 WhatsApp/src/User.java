import java.util.List;
import java.util.TreeMap;

public class User {
    String id;
    TreeMap<String, Chat> chats;
    List<Notify> notify;

    User(String id){
        this.id = id;
        this.chats = new TreeMap<>();
    }
}

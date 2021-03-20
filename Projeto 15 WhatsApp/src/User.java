import java.util.ArrayList;
import java.util.TreeMap;

public class User {
    String id;
    TreeMap<String, Chat> chats;
    ArrayList<Notify> notify;

    User(String id){
        this.id = id;
        this.chats = new TreeMap<>();
        this.notify = new ArrayList<>();
    }

    public String toString(){
        return id;
    }
}

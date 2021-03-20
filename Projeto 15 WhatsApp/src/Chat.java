import java.util.TreeMap;

public class Chat {
    String id;
    TreeMap<String, Inbox> inbox;
    TreeMap<String, User> users;

    Chat(String id){
        this.id = id;
        this.inbox = new TreeMap<>();
        this.users = new TreeMap<>();
    }

    public String toString() {
        return id;
    }
}

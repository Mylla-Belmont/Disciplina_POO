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

    public String getId(){
        return id;
    }

    public void addUserChat(User user){
        user.addChat(this);
        users.put(user.getId(), user);
        user.addNotify(this);
        inbox.put(user.getId(), new Inbox(user));
    }

    public void rmUserChat(User user){
        user.rmChat(this);
        users.remove(user.getId());
    }

    public void getMsgs(String userId){

    }

    public TreeMap<String, User> getUsers(){
        return users;
    }


    public String toString() {
        return id;
    }
}

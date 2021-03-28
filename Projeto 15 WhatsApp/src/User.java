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

    public void addChat(Chat chat){
        this.chats.put(chat.getId(), chat);
    }

    public void rmChat(Chat chat){
        if(!this.chats.containsKey(chat.id)){
            System.out.println("fail: chat não existe");
        }else
            this.chats.remove(chat.id);
    }

    public String getId() {
        return id;
    }

    public TreeMap<String, Chat> getChats(){
        return this.chats;
    }

    public void addNotify(Chat chat){
    }

    public Notify getNotifyUser(String chat){
        return null;
    }

    public ArrayList<Notify> getNotify(){
        return notify;
    }

    public String toString(){
        return id;
    }
}

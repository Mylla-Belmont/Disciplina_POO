import java.util.ArrayList;
import java.util.TreeMap;

public class User {
    String id;
    TreeMap<String, Chat> chats;
    ArrayList<Notify> notify;

    User(String id){
        this.id = id;
        this.chats = new TreeMap<>();
        this.notify = new ArrayList<Notify>();
    }

    public String getId() {
        return id;
    }

    public ArrayList<Notify> getNotify(){
        return notify;
    }

    public void addChat(Chat chat){
        this.chats.put(chat.getId(), chat);
    }

    public void addNotify(Chat chat){
        notify.add(new Notify(chat.getId()));
    }

    public TreeMap<String, Chat> getChats(){
        return this.chats;
    }

    public void rmChat(Chat chat){
        if(!this.chats.containsKey(chat.id)){
            System.out.println("fail: chat não existe");
        }else
            this.chats.remove(chat.id);
    }

    public Notify getNotifyUser(String chat){
        for(Notify noty : notify)
            if(chat.equals(noty.getId()))
                return noty;
        return null;
    }

    public String toString(){
        return id;
    }
}

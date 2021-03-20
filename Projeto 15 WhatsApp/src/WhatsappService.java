import java.util.TreeMap;

public class WhatsappService {
    TreeMap<String, Chat> rep_chat;
    TreeMap<String, User> rep_user;

    WhatsappService(){
        this.rep_chat = new TreeMap<>();
        this.rep_user = new TreeMap<>();
    }

    public void createUser(String userId) {
        if(rep_user.containsKey(userId))
            System.out.println("fail: usuário já existe");
        rep_user.put(userId, new User(userId)); 
    }

    public String allUsers() {
       return rep_user.keySet() + " ";
    }
}

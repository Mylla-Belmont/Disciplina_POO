import java.util.TreeMap;

public class WhatsappService {
    TreeMap<String, Chat> rep_chat;
    TreeMap<String, User> rep_user;

    WhatsappService(){
        this.rep_chat = new TreeMap<>();
        this.rep_user = new TreeMap<>();
    }

    public void createUser(String userId) {
        if(rep_user.containsKey(userId)){
            System.out.println("fail: usuário já existe");
            return;
        } rep_user.put(userId, new User(userId)); 
    }

    public void createChat(String userId, String chatId) {
        if(!rep_user.containsKey(userId)){
            System.out.println("fail: usuário não existe");
            return;
        }
        for(Chat chat : rep_chat.values())
            if(chat.id.equals(chatId)){
                System.out.println("fail: chat " + chatId + " já existe");
                return;
            }
        if(!rep_chat.containsKey(userId))
            rep_chat.put(userId, new Chat(chatId));
    }

    public String allUsers() {
        return rep_user.keySet().toString();
    }

    public String getChatsUser(String userId){
        return "[" + rep_chat.get(userId).getId() + "]";
    }
}

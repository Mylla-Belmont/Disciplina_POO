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
        }else
            rep_user.put(userId, new User(userId)); 
    }

    public void createChat(String userId, String chatId) {
        if(rep_chat.get(chatId) != null){
            System.out.println("fail: chat " + chatId + " já existe");
        }else if(!rep_user.containsKey(userId)){
            System.out.println("fail: usuário não existe");
        }else{
            Chat chat = new Chat(chatId);
            chat.addUserChat(rep_user.get(userId));
            rep_chat.put(chatId, chat);
        }
    }

    public String allUsers() {
        return rep_user.keySet().toString();
    }

    public String getChatsUser(String userId){
        StringBuilder out = new StringBuilder();
        for(Chat chat : rep_user.get(userId).getChats().values())
            out.append(chat.getId() + " ");
        return "[" + out.toString() + "]";
    }
}

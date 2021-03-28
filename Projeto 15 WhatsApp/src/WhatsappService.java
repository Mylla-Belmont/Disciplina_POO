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
        for(Chat getChat : rep_chat.values()){
            if(getChat.getId().equals(chatId)){
                System.out.println("fail: chat " + chatId + " já existe");
                return;
            }
        }
        if(!rep_user.containsKey(userId)){
            System.out.println("fail: usuário não existe");
            return;
        }
        Chat chat = new Chat(chatId);
        User user = rep_user.get(userId);
        chat.addUserChat(user);
        rep_chat.put(userId, chat);
    }

    public String allUsers() {
        return rep_user.keySet().toString();
    }

    public String getChatsUser(String userId){
        StringBuilder out = new StringBuilder();
        for(Chat chat : rep_user.get(userId).getChats().values())
            out.append(chat + " ");
        return "[" + out + "]";
    }
}

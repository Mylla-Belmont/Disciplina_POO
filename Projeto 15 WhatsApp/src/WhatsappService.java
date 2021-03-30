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
        return "[ " + out.toString() + "]";
    }

    public String getUsersChat(String chatId){
        StringBuilder out = new StringBuilder();
        for (User users : rep_chat.get(chatId).getUsers().values())
            out.append(users + " ");
        return "[ " + out.toString() + "]";
    }

    public void addByInvite(String gessId, String invitedId, String chatId){
        if(!rep_user.containsKey(gessId)){
            System.out.println("fail: usuário não existe");
        }else if(!rep_user.get(gessId).chats.containsKey(chatId)){
            System.out.println("fail: " + gessId + " não está no chat " + chatId);
        }else if(rep_user.get(invitedId).chats.containsKey(chatId)){
            System.out.println("fail: usuário já está no chat " + chatId);
        }else
            rep_chat.get(chatId).addUserChat(rep_user.get(invitedId));
    }

    public void removerUserChat(String userId, String chatId){
        if(!rep_user.containsKey(userId)){
            System.out.println("fail: usuário não existe");
        }else if(!rep_chat.containsKey(chatId)){
            System.out.println("fail: chat não existe");    
        }else if(!rep_user.get(userId).chats.containsKey(chatId)){
            System.out.println("fail: " + userId + " não está no chat " + chatId);
        }else{
            rep_chat.get(chatId).rmUserChat(rep_user.get(userId));
        }
    }   

    public void sendMessage(String userId, String chatId, String menssage){
        if(!rep_user.containsKey(userId)){
            System.out.println("fail: usuário não existe");
        }else if(!rep_chat.containsKey(chatId)){
            System.out.println("fail: chat não existe");   
        }else if(!rep_user.get(userId).chats.containsKey(chatId)){
            System.out.println("fail: " + userId + " não está no chat " + chatId);
        }else{
            rep_chat.get(chatId).deliverZap(rep_user.get(userId), menssage);
        }
    }
}

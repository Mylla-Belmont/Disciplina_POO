import java.util.TreeMap;

public class WhatsappService {
    TreeMap<String, Chat> rep_chat;
    TreeMap<String, User> rep_user;

    public void createUser(String userId) {
        rep_user.put(userId, new User(userId)); 
    }

    public char[] allUsers() {
        return null;
    }
}

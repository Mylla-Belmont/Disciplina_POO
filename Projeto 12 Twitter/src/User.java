import java.util.TreeMap;

public class User {
    String userName;
    TreeMap<String, User> followers;
    TreeMap<String, User> following;
    TreeMap<Integer, Tweet> timeline;
    int unreadCount;

    User(String userName){
        this.userName = userName;
    }

    void follow (User user){
        if(followers.containsKey(user.userName))
            throw new RuntimeException("Você já segue esse usuário.");
        followers.put(user.userName, user);
        user.follow(this);
    }

    void unfollow(String userName){
        if(following.containsKey(userName)){
            following.remove(userName);
        } throw new RuntimeException("Usuário não encontrado.");
    }
}

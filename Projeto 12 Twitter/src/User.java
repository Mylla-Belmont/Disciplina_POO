import java.util.TreeMap;

public class User {
    String userName;
    TreeMap<String, User> followers;
    TreeMap<String, User> following;
    TreeMap<Integer, Tweet> timeline;
    int unreadCount;

    User(String userName){
        this.userName = userName;
        this.followers = new TreeMap<>();
        this.following = new TreeMap<>();
        this.timeline = new TreeMap<>();
    }

    void follow (User user){
        if(followers.containsKey(user.userName))
            throw new RuntimeException("Você já segue esse usuário.");
        followers.put(user.userName, user);
        user.follow(this);
    }

    void unfollow(String userName){
        if(following.containsKey(userName))
            throw new RuntimeException("Usuário não encontrado.");
        following.remove(userName);
    }

    Tweet getTweet(int idTw){
        return null;
    }
}

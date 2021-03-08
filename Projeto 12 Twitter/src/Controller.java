import java.util.TreeMap;

public class Controller {
    TreeMap<String, User> users;
    TreeMap<Integer, Tweet> tweets;
    int nextTwId;

    void addUser(String userName){
        if(users.containsKey(userName))
            throw new RuntimeException("Usuário já existe.");
        users.put(userName, new User(userName));
    }

    User getUser(String userName){
        if(users.containsKey(userName))
            return users.get(userName);
        return null;
    }

    void sendTweet(String userName, Tweet msg){
        if(users.containsKey(userName))
            tweets.put(nextTwId, msg);
        else throw new RuntimeException("Usuário não existe.");
    }
}

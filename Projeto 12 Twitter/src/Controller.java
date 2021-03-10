import java.util.TreeMap;

public class Controller {
    TreeMap<String, User> users;
    TreeMap<Integer, Tweet> tweets;
    int nextTwId;

    Controller(){
        this.tweets = new TreeMap<>();
        this.users = new TreeMap<>();
    }

    void addUser(String userName){
        if(users.containsKey(userName))
            throw new RuntimeException("Usuário já existe.");
        users.put(userName, new User(userName));
    }

    User getUser(String userName){
        if(!users.containsKey(userName))
            throw new RuntimeException("Usuário não existe.");
        return users.get(userName);
    }

    void sendTweet(String userName, Tweet msg){
        if(users.containsKey(userName))
            throw new RuntimeException("Usuário não existe.");
        tweets.put(nextTwId, msg);
    }

    // public String toString(){
    //     return users.toString();
    // }
}

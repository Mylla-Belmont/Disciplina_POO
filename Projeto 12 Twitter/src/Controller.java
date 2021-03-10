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
            throw new RuntimeException("fail: usuário já existe.");
        users.put(userName, new User(userName));
    }

    User getUser(String userName){
        if(!users.containsKey(userName))
            throw new RuntimeException("fail: usuário nao encontrado.");
        return users.get(userName);
    }

    public void sendTweet(String username, String msg){
        tweets.put(nextTwId, new Tweet(nextTwId, username, msg));
        for(User user : this.users.values())
            user.timeline.put(nextTwId, new Tweet(nextTwId, username, msg));
        nextTwId++;
    }

    public String toString(){
        StringBuilder out = new StringBuilder();
        for(User user : this.users.values())
            out.append(user + "\n");
        return out.toString();
    }
}

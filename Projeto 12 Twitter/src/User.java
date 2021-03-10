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

    void follow(User user){
        if(followers.containsKey(user.userName))
            throw new RuntimeException("fail: você já segue esse usuário.");
        followers.put(user.userName, user);
        user.following.put(this.userName, new User(this.userName));
    }

    void unfollow(User user){
        if(!followers.containsKey(user.userName))
            throw new RuntimeException("fail: usuário não encontrado.");
        followers.remove(user.userName);
        user.following.remove(this.userName);
    }

    Tweet getTweet(int idTw){
        if(!timeline.containsKey(idTw))
            throw new RuntimeException("fail: mensagem não encontrada.");
        return timeline.get(idTw);
    }

    public String getTimeline() {
        StringBuilder out = new StringBuilder();
        for(Tweet tweet : this.timeline.values()){
            out.append(unreadCount + ":" + tweet + "\n");
            unreadCount++;
        }
        return out.toString();
    }

    public String toString(){
        return userName + "\n" + "  seguindo:    " + followers.keySet() + "\n" + "  seguidores:  " + following.keySet();
    }
}

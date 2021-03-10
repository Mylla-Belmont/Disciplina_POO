import java.util.TreeSet;

public class Tweet {
    int idTw;
    String UserName;
    String msg;
    TreeSet<String> likes;

    Tweet(int idTw, String userName, String msg){
        this.idTw = idTw;
        this.UserName = userName;
        this.msg = msg;
        this.likes = new TreeSet<>();
    }

    void like(String userName){
        likes.add(userName);
    }

    String getTweet(){
        StringBuilder out = new StringBuilder();
        out.append(idTw + UserName + msg);
        return out.toString();
    }

    public String toString(){
        return UserName + "( " + msg + ")";
    }
}

import java.util.TreeMap;

public class Controller {
    TreeMap<String, User> users;
    TreeMap<Integer, Tweet> tweets;
    int nextTwId;

    void addUser(String userName){
        User user = new User(userName);
    }
}

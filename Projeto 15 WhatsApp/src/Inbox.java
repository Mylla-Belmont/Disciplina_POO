import java.util.ArrayList;

public class Inbox {
    User user;
    ArrayList<Msg> msgs;

    Inbox(User user){
        this.user = user;
        this.msgs = new ArrayList<>();
    }
}

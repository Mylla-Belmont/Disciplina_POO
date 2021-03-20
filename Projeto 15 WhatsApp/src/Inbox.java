import java.util.ArrayList;
import java.util.List;

public class Inbox {
    User user;
    ArrayList<Msg> msgs;

    Inbox(User user){
        this.user = user;
        this.msgs = new ArrayList<>();
    }

    void addMsg(){
    }

    List<Msg> getMsgs(){
        return null;
    }

    User getUser(){
        return null;
    }
}

import java.util.ArrayList;
import java.util.List;

public class Inbox {
    User user;
    ArrayList<Msg> msgs;

    Inbox(User user){
        this.user = user;
        this.msgs = new ArrayList<>();
    }

    void addMsg(String user, String menssage){
        msgs.add(new Msg(user, menssage));
    }

    List<Msg> getMsgs(){
        return msgs;
    }

    User getUser(){
        return this.user;
    }
}

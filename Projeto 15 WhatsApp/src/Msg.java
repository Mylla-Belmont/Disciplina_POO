public class Msg {
    String userId;
    String text;
    
    Msg(String userId, String text){
        this.userId = userId;
        this.text = text;
    }

    public String toString(){
        return "[" + userId + ": " + text + "]";
    }
}

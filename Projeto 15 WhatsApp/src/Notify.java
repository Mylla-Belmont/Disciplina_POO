public class Notify {
    String chatId;
    int unreadCount;

    Notify(String chatId){
        this.chatId = chatId;
    }

    public String getId(){
        return chatId;
    }

    public int getUnreadCount(){
        return unreadCount;
    }

    public void addCont(){
        unreadCount++;
    }

    public void rmNotifi(){
        unreadCount++;
    }

    public String toString(){
        return chatId + ":" + unreadCount;
    }
}

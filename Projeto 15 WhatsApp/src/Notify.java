public class Notify {
    String chatId;
    int unreadCount;

    Notify(String chatId, int unreadCount){
        this.chatId = chatId;
        this.unreadCount = unreadCount;
    }

    public String getId(){
        return chatId;
    }

    public int getUnreadCount(){
        return unreadCount;
    }

    public void addCont(){
        unreadCount += unreadCount;
    }

    public void rmNotifi(){
        unreadCount -= unreadCount;
    }

    public String toString(){
        return chatId + ":" + unreadCount;
    }
}

import java.util.List;

public interface IBatePapo {
        String getId();
        void sendMessage(Mensagem msg, IBatePapo batePapense);
        void addMessage(Mensagem msg);
        List<Mensagem> getInbox();
}

import java.util.List;
import java.util.TreeMap;

public class BatePapo implements IBatePapo{
    TreeMap<String, Mensagem> inbox;

    public String getId() {
        StringBuilder out = new StringBuilder();
        for(Mensagem batePapo : inbox.values())
            out.append(batePapo.getId());
        return out.toString();
    }

    public void sendMessage(Mensagem msg, IBatePapo batePapo) {
        
    }

    public void addMessage(Mensagem msg) {
        inbox.put(msg.id, msg);
    }

    public List<Mensagem> getInbox() {
        return null;
    }
    
}

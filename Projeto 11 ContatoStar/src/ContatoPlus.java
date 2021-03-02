import java.util.List;
import java.util.TreeMap;

public class ContatoPlus extends Contato {
    boolean starred;
    List<Fone> foneTeste;

    ContatoPlus(String name, List<Fone> list) {
        super(name);
        this.foneTeste = list;
    }

	boolean setBookmMarks(TreeMap<String, Contato> contatos, String name, Contato contato){
        if(contatos.get(name).starred){
            contato.starred = false;
            return true;
        }
        contato.starred = true;
        return false;
	}
}   
import java.util.List;

public class ContatoPlus extends Contato {
    boolean starred;
    List<Fone> foneTeste;

    ContatoPlus(String name, List<Fone> list) {
        super(name);
        this.foneTeste = list;
    }

	boolean setBookmMarks(String name, Contato contato){
        if(contato.equals(name) && starred)
            return true;
        starred = true;
        return false;
	}
}
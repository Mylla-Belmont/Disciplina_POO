import java.util.List;

public class ContatoPlus extends Contato{
    boolean starred;

    ContatoPlus(String name, List<Fone> list) {
        super(name);
        this.starred = false;
    }

	boolean setBookmMarks(String name, Contato contato){
        if(contato.equals(name) && starred)
            return true;
        starred = true;
        return false;
	}
}
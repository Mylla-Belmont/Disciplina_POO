
public class ContatoPlus extends Contato{
    boolean starred;

    ContatoPlus(String name) {
        super(name);
    }

	boolean setBookmMarks(String name, Contato contato){
        if(contato.equals(name) && starred)
            return true;
        starred = true;
        return false;
	}
}
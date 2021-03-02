import java.util.List;

public class ContatoPlus extends Contato {
    boolean starred;
    List<Fone> foneTeste;

    ContatoPlus(String name, List<Fone> list) {
        super(name);
        this.foneTeste = list;
    }

	boolean setBookmMarks(Contato contato, String name){
        if(contato.name.equals(name)){
            System.out.println(contato.name);
            return false;
        }
        starred = true;
        return true;
	}
}
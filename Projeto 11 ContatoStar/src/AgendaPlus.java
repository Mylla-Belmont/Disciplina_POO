import java.util.TreeMap;
import java.util.ArrayList;

public class AgendaPlus extends Agenda{
    TreeMap<String, Contato> bookMarks;

    AgendaPlus(){
        this.bookMarks = new TreeMap<>();
    }

    void rmContato(String name){
        if(this.contatos.containsKey(name)){
            contatos.remove(name);
        }else
            System.out.println("fail: contato não existe");
        if(this.bookMarks.containsKey(name))
            bookMarks.remove(name);
    }

    void addFavorito(String name){
        Contato contato = contatos.get(name);
        if(!contato.setBookmMarks(contato.name, contato)){
            bookMarks.put(name, contato);
            return;
        } System.out.println("fail: contato não existe");
    }

    void removerFavorito(String id){
        Contato contato = contatos.get(id);
        if(contato.setBookmMarks(contato.name, contato)){
            bookMarks.remove(id);
            return;
        } System.out.println("fail: contato não existe");
    }

    ArrayList<Contato> getStarred(){
        ArrayList<Contato> favoritos = new ArrayList<>();
            favoritos.addAll(bookMarks.values());
        return favoritos;
    }

    public String toString() {
        StringBuilder saida = new StringBuilder();
        for(Contato contato : this.contatos.values())
            if(bookMarks.containsKey(contato.name)){
                saida.append("@ " + contato.name + " " + contato.fones + "\n");
            }else
                saida.append("- " + contato.name + " " + contato.fones + "\n");
        return saida.toString();
    }
}

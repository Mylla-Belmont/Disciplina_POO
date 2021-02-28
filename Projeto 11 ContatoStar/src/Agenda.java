import java.util.TreeMap;
import java.util.ArrayList;

abstract class Agenda{
    TreeMap<String, Contato> contatos;

    Agenda(){
        this.contatos = new TreeMap<>();
    }

    void addContato(ContatoPlus contato){
        if(!this.contatos.containsKey(contato.name))
            contatos.put(contato.name, new ContatoPlus(contato.name, contato.fones));
        for(int i=0; i < contato.fones.size(); i++)
            contatos.get(contato.name).addFone(contato.fones.get(i).label, contato.fones.get(i).number);
    }

    ArrayList<Contato> search(String patter){
        ArrayList<Contato> busca = new ArrayList<>();
        if(this.contatos.containsKey(patter))
            busca.add(contatos.get(patter));
        return busca;
    }
    
    abstract void rmContato(String name);
    abstract public String toString();
}
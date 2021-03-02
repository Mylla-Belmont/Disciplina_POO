import java.util.TreeMap;
import java.util.ArrayList;

abstract class Agenda{
    TreeMap<String, Contato> contatos;

    Agenda(){
        this.contatos = new TreeMap<>();
    }

    void addContato(ContatoPlus contatoPlus){
        if(!this.contatos.containsKey(contatoPlus.name))
            contatos.put(contatoPlus.name, new ContatoPlus(contatoPlus.name, contatoPlus.foneTeste));
        for(int i=0; i < contatoPlus.foneTeste.size(); i++)
            contatos.get(contatoPlus.name).addFone(contatoPlus.foneTeste.get(i).label, contatoPlus.foneTeste.get(i).number);
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
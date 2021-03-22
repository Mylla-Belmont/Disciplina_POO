import java.util.TreeMap;

public class Cliente {
    String id;
    TreeMap<ContaCorrente, ContaPoupança> contas;

    Cliente(String id){
        this.id = id;
        this.contas = new TreeMap<>();
    }
    
    public String toString(){
        return id + contas.values().toString();
    }
}

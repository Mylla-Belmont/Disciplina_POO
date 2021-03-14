import java.util.TreeMap;

public class Cliente {
    String id;
    TreeMap<ContaCorrente, ContaPoupança> contas;

    Cliente(){
        this.contas = new TreeMap<>();
    }

    void cliente(String id){
    }

    public String toString(){
        return id + contas + "bubuia";
    }
}

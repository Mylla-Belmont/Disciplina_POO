import java.util.TreeMap;

public class Cliente {
    String id;
    TreeMap<String, Conta> contas;

    Cliente(String id){
        this.id = id;
        this.contas = new TreeMap<>();
    }

    public String toString(){
        return null;
    }
}

import java.util.TreeSet;

public class Cliente {
    String id;
    TreeSet<Conta> contas;

    Cliente(String id){
        this.id = id;
        this.contas = new TreeSet<>();
    }

    void conta(String id){

    }
}

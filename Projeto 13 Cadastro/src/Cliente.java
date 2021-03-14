import java.util.TreeSet;

public class Cliente {
    String id;
    TreeSet<Conta> contas;

    Cliente(String id){
        this.id = id;
        this.contas = new TreeSet<>();
    }

    void cliente(String id){
        Agencia agencia = new Agencia();
        agencia.adicionarCliente(id);
    }
}

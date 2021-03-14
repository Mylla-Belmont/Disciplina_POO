import java.util.TreeMap;

public class Cliente {
    String id;
    TreeMap<ContaCorrente, ContaPoupança> contas;

    Cliente(String id){
        this.id = id;
        this.contas = new TreeMap<>();
    }

    void cliente(String id){
        contas.put(new ContaCorrente(0, 0, id, "CC"), new ContaPoupança(0, 0, id, "CP"));
        Agencia agencia = new Agencia();
        agencia.adicionarCliente(id);
    }
}

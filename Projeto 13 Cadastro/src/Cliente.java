import java.util.TreeMap;

public class Cliente {
    String id;
    TreeMap<ContaCorrente, ContaPoupança> contas;

    Cliente(){
        this.contas = new TreeMap<>();
    }

    void cliente(String id){
        this.id = id;
        contas.put(new ContaCorrente(0, 0, id, "CC"), new ContaPoupança(0, 0, id, "CP"));
        Agencia agencia = new Agencia();
        agencia.adicionarCliente(id);
    }

    public String toString(){
        return id + contas;
    }
}

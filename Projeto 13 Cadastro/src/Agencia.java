import java.util.TreeSet;

public class Agencia {
    TreeSet<Cliente> clientes;
    TreeSet<Conta> contas;

    Agencia(){
        this.clientes = new TreeSet<>();
        this.contas = new    TreeSet<>();
    }

    void cliente(String id){
        int num = 0;
        clientes.add(new ContaCorrente(num, 0, id, "CC"), new )
    }

    void adicionarCliente(String id){
        if(clientes.contains(id))
            throw new RuntimeException("fail: cliente já esxite.");
        clientes.add(id);
    }

    public String toString(){
        return "bobocasdf";
    }
}

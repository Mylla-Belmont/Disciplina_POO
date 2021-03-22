import java.util.TreeMap;

public class Agencia {
    TreeMap<String, Cliente> clientes;
    TreeMap<String, Conta> contas;
    int cont;

    Agencia(){
        this.clientes = new TreeMap<>();
        this.contas = new TreeMap<>();
    }

    void adicionarCliente(String id){
        if(clientes.containsKey(id))
            throw new RuntimeException("fail: cliente já esxite.");
        Cliente cliente = new Cliente(id);
        ContaCorrente CC = new ContaCorrente(cont, id);
        ContaPoupança CP = new ContaPoupança(cont, id);
        clientes.put(id, cliente);
        contas.put(id, CC);
        contas.put(id, CP);

    }

    public String toString(){
        return null;
    }
}

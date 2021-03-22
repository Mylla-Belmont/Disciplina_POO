import java.util.TreeMap;

public class Agencia {
    TreeMap<String, Cliente> clientes;
    TreeMap<String, Conta> contas;

    Agencia(){
        this.clientes = new TreeMap<>();
        this.contas = new TreeMap<>();
    }

    // void cliente(String id){
    //     // int num = 0;
    //     // clientes.add(new ContaCorrente(num, 0, id, "CC"), new )
    // }

    void adicionarCliente(String id){
        if(clientes.containsKey(id))
            throw new RuntimeException("fail: cliente já esxite.");
        clientes.put(id, new Cliente(id));
        contas.put(id, new ContaCorrente(0, 0, id, "CC"));
    }

    public String toString(){
        return contas.values().toString();
    }
}

import java.util.ArrayList;
import java.util.TreeMap;

public class Agencia {
    TreeMap<String, Cliente> clientes;
    ArrayList<Conta> contas;
    int cont;

    Agencia(){
        this.clientes = new TreeMap<>();
        this.contas = new ArrayList<>();
    }

    void adicionarCliente(String id){
        if(clientes.containsKey(id))
            throw new RuntimeException("fail: cliente já esxite.");
        Cliente cliente = new Cliente(id);
        clientes.put(id, cliente);
        cliente.contas.put(id, new ContaCorrente(cont, id));
        this.contas.add(new ContaCorrente(cont, id));
        cont++;
        cliente.contas.put(id, new ContaPoupança(cont, id));
        this.contas.add(new ContaPoupança(cont, id));
        ++cont;
    }

    public String toString(){
        StringBuilder out = new StringBuilder();
        for (Conta conta : contas)
            out.append(conta + "\n");
        return out.toString();
    }
}

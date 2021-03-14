import java.util.TreeSet;

public class Agencia {
    TreeSet<String> clientes;
    TreeSet<Conta> contas;

    Agencia(){
        this.clientes = new TreeSet<>();
        this.contas = new TreeSet<>();
    }

    void cliente(String id){

    }

    void adicionarCliente(String id){
        if(clientes.contains(id))
            throw new RuntimeException("fail: cliente já esxite.");
        clientes.add(id);
    }
}

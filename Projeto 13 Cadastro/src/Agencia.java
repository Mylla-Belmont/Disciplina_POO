import java.util.TreeSet;

public class Agencia {
    TreeSet<Cliente> cliente;
    TreeSet<Conta> contas;

    Agencia(){
        this.cliente = new TreeSet<>();
        this.contas = new TreeSet<>();
    }

    void cliente(String id){

    }

    void adicionarCliente(String id){
        cliente.add(id);
    }

}

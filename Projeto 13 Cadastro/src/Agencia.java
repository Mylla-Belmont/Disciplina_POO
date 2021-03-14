import java.util.TreeMap;
import java.util.TreeSet;

public class Agencia {
    TreeMap<Cliente, Conta> cliente;
    TreeSet<Conta> contas;

    Agencia(){
        this.cliente = new TreeMap<>();
        this.contas = new TreeSet<>();
    }

    void cliente(String id){

    }

    void adicionarCliente(String id){
        cliente.put(id, new Conta(){
            
        };
    }

}

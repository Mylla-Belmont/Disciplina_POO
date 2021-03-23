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
        cliente.contas.put(id, new ContaPoupança(cont, id));
    }

    // void depositar(int idConta, float value){
    //     getConta(idConta).depositar(value);
    // }
    // void transferir(int contaDe, int contaPara, float value){
    //     getConta(contaDe).transferir(getConta(contaPara), value);
    // }
    // void atualizarContas(){
    //     for(auto& [k, v] : this->contas)
    //         v->atualizarMes();
    // }

    public String toString(){
        return contas.toString();
    }
}

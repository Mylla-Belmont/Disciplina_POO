public class ContaCorrente extends Conta {
    float tarifaMensal;

    ContaCorrente(int id, String idCliente) {
        super(id, idCliente);
        this.type = "CC";
    }

    void contaCorrente(int id, String idCliente){

    }

    void atualizacaoMensal() {
        
    }
}

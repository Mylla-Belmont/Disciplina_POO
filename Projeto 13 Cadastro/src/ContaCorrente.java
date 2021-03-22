public class ContaCorrente extends Conta {
    float tarifaMensal;

    ContaCorrente(int id, String idCliente) {
        super(id, idCliente);
        this.type = "CC";
        this.tarifaMensal = 20;
    }

    void atualizacaoMensal() {
        saldo -= tarifaMensal;
    }
}

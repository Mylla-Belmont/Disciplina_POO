public class ContaPoupança extends Conta{
    float rendimento;

    ContaPoupança(int id, String idCliente) {
        super(id, idCliente);
        this.type = "CP";
        this.rendimento = (float) 1.01;
    }

    void atualizacaoMensal() {
        saldo *= rendimento;
    }
}

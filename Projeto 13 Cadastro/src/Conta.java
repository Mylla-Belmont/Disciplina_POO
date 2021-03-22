public abstract class Conta {
    int id;
    float saldo;
    String idCliente;
    String type;

    Conta(int id, String idCliente){
        this.id = id;
        this.saldo = 0;
        this.idCliente = idCliente;
    }

    void sacar(float value){
        if(saldo >= value)
            saldo -= value;
        else
            throw new RuntimeException("fail: saldo insuficiente");
    }

    void depositar(float value){
        saldo += value;
    }

    void transferir(Conta otherConta, float value){
        this.sacar(value);
        otherConta.depositar(value);
    }

    abstract void atualizacaoMensal();

    public String toString(){
        return id+":"+idCliente+":"+saldo+":"+type;
    }
}

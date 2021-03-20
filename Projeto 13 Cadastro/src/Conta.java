public abstract class Conta {
    int id;
    float saldo;
    String idCliente;
    String type;

    Conta(int id, float saldo, String idCliente, String type){
        this.id = id;
        this.saldo = saldo;
        this.idCliente = idCliente;
        this.type = type;
    }

    void conta(int id, String idCliente){

    }

    void sacar(){

    }

    void depositar(){

    }

    void transferir(){

    }

    abstract void atualizacaoMensal();

    public String toString(){
        return id+":"+idCliente+":"+saldo+":"+type;
    }
}

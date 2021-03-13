abstract class Conta {
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


}

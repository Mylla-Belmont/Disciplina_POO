import java.util.ArrayList;

class Espiral{

    String nome;
    int quantidade;
    float preco;

    Espiral(String nome, int quantidade, float preco){
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public void espiral (String nome, int quantidade, float preco){
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }     
}


class junkFood{

    float lucro;
    float saldoCliente;
    int maxProdutos;
    ArrayList<Espiral> espiral;

    junkFood(int numEspirais, int maxProdutos){
        this.lucro = 0;
        this.saldoCliente = 0;
        this.maxProdutos = maxProdutos;
        this.espiral = new ArrayList<>();
        for(int i=0; i < numEspirais; i++)
            this.espiral.add(new Espiral("-", 0, 0));
    }


    float pedirTroco(){
        return saldoCliente;
    }

    void vender(int index){
        if(saldoCliente > 0){
            float valorProduto = espiral.get(index).preco;
            saldoCliente -= valorProduto;
            espiral.get(index).quantidade -= 1;
            
            if(saldoCliente < 0)
                saldoCliente = 0;
            
            if(espiral.get(index).quantidade < 0)
                espiral.get(index).quantidade = 0;
        }else
            System.out.println("Saldo insuficiente");
    }

    void inserirDinheiro(float dinheiro){
        saldoCliente += dinheiro; 
    }

    void limparEspiral(int index){
        if(index >= 0 && index < espiral.size()){
            espiral.remove(index);
            espiral.add(index, new Espiral("-", 0, 0));
        }
    }

    void alterarEspiral(int index, String produto, int quantidade, float preco){
        if(index >= 0 && index < espiral.size())
            espiral.set(index, new Espiral(produto, quantidade, preco)); 
    }

    public String toString(){
        String saida = "Saldo: " + saldoCliente + "\n";
        int i = 0;
        for(Espiral espiral : espiral){
            saida +=  i + " [" + espiral.nome + " : " + espiral.quantidade + " U : " + espiral.preco + " RS]\n";
            i++;
        }
        return saida;
    }

    public static void main(String[] args){
        junkFood maquina = new junkFood(3, 5);

        //Inserindo produtos na espirais
        maquina.alterarEspiral(0, "picanha", 2, 1.50f);
        maquina.alterarEspiral(1, "todinho", 3, 2.50f); 
        maquina.alterarEspiral(2, "pamonha", 5, 5.20f); 

        //Removendo produtos na espirais
        //maquina.limparEspiral(1);

        //Inserindo dinheiro
        maquina.inserirDinheiro(5f);
        maquina.inserirDinheiro(5f);

        //Pedir troco
        maquina.pedirTroco();

        //Vender produto
        maquina.vender(1);
        maquina.vender(1);
        maquina.vender(1);
        maquina.vender(1);


        System.out.println(maquina);

    }
}
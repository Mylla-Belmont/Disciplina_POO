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

    void alterarEspiral(int index, String produto, int qtd, float preço){
        if(index >= 0 && index < espiral.size())
            espiral.set(index, new Espiral(produto, qtd, preço)); 
    }

    public String toString(){
        String saida = "";
        int i = 0;
        for(Espiral espiral : espiral){
            saida += i + " [ " + espiral.nome + " : " + espiral.quantidade + " U : " + espiral.preco + " RS]\n";
            i++;
        }
        return saida;
    }

    public static void main(String[] args){
        junkFood maquina = new junkFood(3, 5);

        maquina.alterarEspiral(2, "todinho", 3, 2.50f); 
        System.out.println(maquina);

    }
}
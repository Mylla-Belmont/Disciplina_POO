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

    void alterarEspiral(int index, String nome){
        if(index >= 0 && index < espiral.size())
            espiral.set(index, nome); 
    }

    public String toString(){
        String saida = "";
        int i = 0;
        for(Espiral espiral : espiral){
            saida += " [" + i + ":" + espiral + "]";
            i++;
        }
        return saida;
    }

    public static void main(String[] args){
        junkFood maquina = new junkFood(3, 5);

        maquina.alterarEspiral(1, "nome");
    }
}
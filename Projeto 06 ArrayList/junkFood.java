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

    int maxProdutos;
    float saldoCliente;
    float lucro;
    ArrayList<Espiral> espiral;

    public junkFood(int numEspirais, int maxProdutos, float saldoCliente, float lucro){
        this.saldoCliente = saldoCliente;
        this.lucro = lucro;
        this.maxProdutos = maxProdutos;
        this.espiral = new ArrayList<>();
        for(int i = 0; i < numEspirais; i++)
            this.espiral.add(new Espiral("", 0, 0f));
    }

    public String toString(){
        String output = "";
        int i = 0;
        for(Espiral espiral : espiral){
            output += i + " [ " + espiral + " ]\n";
            i++;
        }
        return output;
    }   

    public static void main (String[] args){
        junkFood maquina = new junkFood(0, 0 , 0 , 0);
    }
}
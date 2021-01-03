import java.util.ArrayList;
import java.util.Scanner;

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

class maquina{

    ArrayList<Espiral> espiral;
    float saldoCliente;
    float lucro;
    int maxProdutos;

    public maquina(int numEspirais, float saldoCliente, float lucro, int maxProdutos){
        this.espiral = new ArrayList<>();
        for(int i = 0; i < numEspirais; i++){
            this.espiral.add(new Espiral("", 0, 0f));
        }
        this.saldoCliente = saldoCliente;
        this.lucro = lucro;
        this.maxProdutos = maxProdutos;
    }

    public String toString(){
        return "[]";
    }   
}

public class junkFood{
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("-----");
        String line = input.nextLine();
        String[] Ui = line.split(" ");
        
        maquina novaMaquina = new maquina(0, 0, 0, 0);

        if(Ui[0].equals("show")){
            System.out.println(novaMaquina);
        }

        input.close();
    }
}
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

    maquina(float saldoCliente, float lucro, int maxProdutos){
        this.espiral = new ArrayList<>();
        this.saldoCliente = saldoCliente;
        this.lucro = lucro;
        this.maxProdutos = maxProdutos;
    }
}

public class junkFood{
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("-----");
        String line = input.nextLine();
        String[] Ui = line.split(" ");

        input.close();
    }
}
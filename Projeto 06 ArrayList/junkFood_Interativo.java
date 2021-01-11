import java.util.Scanner;
import java.util.ArrayList;

class Espirais{

    String nome;
    int quantidade;
    float preco;

    Espirais(String nome, int quantidade, float preco){
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public void espirais (String nome, int quantidade, float preco){
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }     
}

class maquina{

    private float lucro;
    private int maxProdutos;
    private float saldoCliente;
    ArrayList<Espirais> espiral;

    maquina(int numEspirais, int maxProdutos){
        this.lucro = 0;
        this.saldoCliente = 0;
        this.maxProdutos = maxProdutos;
        this.espiral = new ArrayList<>();
        for(int i=0; i < numEspirais; i++)
            this.espiral.add(new Espirais("-", 0, 0));
    }   

    private void setInserirDinheiro(float dinheiro){
        saldoCliente += dinheiro; 
    }

    private void setPedirTroco(){
        saldoCliente = 0;
    }

    public float getTroco(){
        return saldoCliente;
    }

}

public class junkFood_Interativo {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo a Junk-Food World! Digite as novas configurações da máquina:");
        String line = scanner.nextLine();
        String[] Ui = line.split(" ");

        maquina maquina = new maquina(Integer.parseInt(Ui[1]), Integer.parseInt(Ui[2]));

        while(true){

            System.out.println("O que deseja fazer?");

            if(Ui[0].equals("set")){

            }

            if(Ui[0].equals("show")){

            }

            if(Ui[0].equals("clear")){

            }

            if(Ui[0].equals("money")){

            }

            if(Ui[0].equals("change")){
                System.out.println("Você recebeu " + maquina.getTroco() + "R$");
            }

            if(Ui[0].equals("break"))
                break;
        }

    scanner.close();
    }
    
}

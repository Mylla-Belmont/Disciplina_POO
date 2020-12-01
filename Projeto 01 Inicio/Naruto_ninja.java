import java.util.Scanner;
import java.util.Random;

public class Naruto_ninja{
    int vida;
    int chakra;
    
    Naruto_ninja (int vida, int chakra){ 
        this.vida = vida;
        this.chakra = chakra;
    }

    boolean vida(int dano){
        if(vida > 0){
            vida -= dano;
            return false;
        }
        return true;
    }

    void chakra(int ataque){
        if(ataque == 1)
            chakra -= 20;
        if(ataque == 2)
            chakra -= 30;
        if(ataque == 3)
            chakra -= 40;
    }

    int ataque(int ataque){
        switch(ataque){
            case 1:
                return 30; 
            case 2:
                return 40; 
            case 3:
                return 50; 
            default:
                System.out.println("Errou!");
        }
        return 0;
    }

    public String toString(){
        return "Vida: " + vida + "/100" + " Chakra: " + chakra;
    }

    public static void main(String[] args) {
        Naruto_ninja Naruto = new Naruto_ninja(100, 100);
        Naruto_ninja Sasuke = new Naruto_ninja(100, 100);
        
        System.out.println("\nNaruto: - SASUKEEE!!!");
        System.out.println("Sasuke: - NARUTOOO!!!");

        System.out.println("Sakura: - Naruto! O sasuke tá ficando doido! Mete a surra nele!!!");
        System.out.println("\n1 - Rasengan\n");
        System.out.println("2 - Jutsu multiclones da sombras\n");
        System.out.println("3 - Dedo secreto da aldeia da folha");

        Scanner input = new Scanner(System.in);
        Random aleatorio = new Random();

        for(int i=0; i != -1; i++){        //loop infinito

            if(Sasuke.vida(0) == true || Naruto.vida(0)  == true){
                System.err.println("Alguém morreu...");
                break;
            }

            System.out.println("\nNaruto, escolha o seu jutsu:\n");
            int ataque = input.nextInt();

            Sasuke.vida(Naruto.ataque(ataque));
            Naruto.chakra(ataque);
           
            int ataqueSasuke = aleatorio.nextInt(4);

            System.out.println("\nEle te acertou também!");
            Naruto.vida(Sasuke.ataque(ataqueSasuke));
            Sasuke.chakra(ataqueSasuke);

            System.out.println("Sasuke " + Sasuke);
            System.out.println("Naruto " + Naruto);
        }   
        input.close();
    }
}

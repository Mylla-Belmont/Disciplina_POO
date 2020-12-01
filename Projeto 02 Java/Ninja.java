import java.util.Scanner;
import java.util.Random;

public class Ninja {
    int vida;
    int chakra;
    int velocidade;
    
    Ninja (int vida, int chakra){ 
        this.vida = vida;
        this.chakra = chakra;
    }

    boolean vida(){
        if(vida > 0)
            return true;
        else 
            return false;
    }

    void recuperarVida(){
        if(chakra >= 20 && chakra <= 40){
            vida += 10;
        }else if(chakra >= 40 && chakra <= 80){
            vida += 20;
        }else if(chakra >= 80 && chakra < 100){
            vida += 30;
        }else
            System.out.println("Isso não vai ser possiel.");
    }

    void recuperarChakra(){
        if(vida >= 20 && vida <= 40){
            chakra += 20;
        }else if(vida >= 40 && vida <= 80){
            chakra += 30;
        }else if(vida >= 80 && vida < 100){
            chakra += 40;
        }else
            System.out.println("Isso não vai ser possiel.");
    }

    void dano(int dano){
        vida -= dano;
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
        if(ataque == 1 && chakra >= 20){
            return 10;
        }else if(ataque == 2 && chakra >= 30){
            return 20;
        }else if(ataque == 3 && chakra >= 40){
            return 30;
        }else
            return 0;
    }

    public String toString(){
        return "Vida: " + vida + "/100" + " Chakra: " + chakra;
    }

    public static void main(String[] args) {
        Ninja Naruto = new Ninja(100, 100);
        Ninja Sasuke = new Ninja(100, 100);
        
        System.out.println("\nNaruto: - SASUKEEE!!!\nSasuke: - NARUTOOO!!!");
        System.out.println("Sakura: - Naruto! O sasuke tá ficando doido! Mete a surra nele!!!");
        System.out.println("\n1 - Rasengan\n2 - Jutsu multiclones da sombras\n3 - Dedo secreto da aldeia da folha");
        System.out.println("4 - Recuperar chakra\n5 - Recuperar vida");

        Scanner input = new Scanner(System.in);
        Random aleatorio = new Random();

        while(Naruto.vida() == true && Sasuke.vida() == true){        //loop infinito

            System.out.println("\nNaruto, escolha o seu jutsu:");
            int acao = input.nextInt();

            if(acao == 1 || acao == 2 || acao == 3){
                Sasuke.dano(Naruto.ataque(acao));           //Ataque naruto
                Naruto.chakra(acao);
            }else if(acao == 4){
                Naruto.recuperarChakra();           //Recuperar chakra
            }else if(acao == 5)
                Naruto.recuperarVida();             //Recuperar vida
           
            int ataqueSasuke = aleatorio.nextInt(4);    //Ataque do Sasuke
            Naruto.dano(Sasuke.ataque(ataqueSasuke));
            Sasuke.chakra(ataqueSasuke);

            System.out.println("\nSasuke " + Sasuke);
            System.out.println("Naruto " + Naruto);
        }

        if(Naruto.vida() == true && Sasuke.vida() == false){
            System.out.println("Sasuke morreu...");
        }else if(Sasuke.vida() == true && Naruto.vida() == false){   
            System.out.println("Naruto morreu...");
        }else
            System.out.println("Ambos morreram...");

        input.close();
    }    
}

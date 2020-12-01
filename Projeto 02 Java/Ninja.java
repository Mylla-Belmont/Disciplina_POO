import java.util.Scanner;
import java.util.Random;

public class Ninja {
    int vida;
    int chakra;
    int especial;
    int agilidade;
    
    Ninja (int vida, int chakra, int agilidade){ 
        this.vida = vida;
        this.chakra = chakra;
        this.agilidade = agilidade;
    }

    void dano(int dano){        //Subtrai a vida dos personagens de acordo com os ataques
        vida -= dano;
    }

    boolean vida(){            //Verifica se algum deles ainda estão vivo
        if(vida > 0)
            return true;
        else 
            return false;
    }

    boolean desvio(){           //Verifica se é possivel desviar
        if(agilidade >= 20){
            agilidade -= 30;
            return true;
        }else
            return false;
    }

    void recuperarVida(){         //Permiti recuperar vida de acordo com a quantidade de chakra
        if(chakra >= 20 && chakra <= 40){
            vida += 10;
        }else if(chakra >= 40 && chakra <= 80){
            vida += 20;
        }else if(chakra >= 80 && chakra < 100){
            vida += 30;
        }else
            System.out.println("Isso não vai ser possiel.");
    }

    void recuperarChakra(){     //Permiti recuperar chakra de acordo com a quantidade de vida
        if(vida >= 20 && vida <= 40){
            chakra += 20;
        }else if(vida >= 40 && vida <= 80){
            chakra += 30;
            agilidade += 5;
        }else if(vida >= 80 && vida < 100){
            chakra += 40;
            agilidade += 10;
        }else
            System.out.println("Isso não vai ser possiel.");
    }

    void chakra(int ataque){     //Diminui qtd de chakra e agilidade a cada ataque
        if(ataque == 1){
            chakra -= 20;
            agilidade -= 5;
        }else if(ataque == 2){
            chakra -= 30;
            agilidade -= 10;
        }else if(ataque == 3){
            chakra -= 40;
            agilidade -= 20;
        }
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
    
    public static void luta_Ninja(){
        System.out.println("\nNaruto: - SASUKEEE!!!\nSasuke: - NARUTOOO!!!");
        System.out.println("Sakura: - Naruto! O sasuke tá ficando doido! Mete a surra nele!!!");
        System.out.println("\n1 - Rasengan\n2 - Jutsu multiclones da sombras\n3 - Dedo secreto da aldeia da folha");
        System.out.println("4 - Recuperar chakra\n5 - Recuperar vida");
    }

    public static void main(String[] args) {
        Ninja Naruto = new Ninja(100, 100, 50);
        Ninja Sasuke = new Ninja(100, 100, 50);

        luta_Ninja();

        Scanner input = new Scanner(System.in);
        Random aleatorio = new Random();

        while(Naruto.vida() == true && Sasuke.vida() == true){        //loop infinito

            System.out.println("\nNaruto, escolha o seu jutsu:");
            int acao = input.nextInt();

            if(acao == 1 || acao == 2 || acao == 3){

                if(Naruto.desvio() == true){        //Verifica se Sasuke pode desviar do golpe
                    System.out.println("\nVocê atacou, mas Sasuke deviou do golpe!");
                }else{
                    Sasuke.dano(Naruto.ataque(acao));           //Ataque naruto
                    Naruto.chakra(acao);
                }
            }else if(acao == 4){
                Naruto.recuperarChakra();           //Recuperar chakra
            }else if(acao == 5)
                Naruto.recuperarVida();             //Recuperar vida

            if(Naruto.desvio() == true){
                System.out.println("Sasuke atacou, mas você deviou do golpe!");
            }else{
                int ataqueSasuke = aleatorio.nextInt(4);    //Ataque do Sasuke
                Naruto.dano(Sasuke.ataque(ataqueSasuke));
                System.out.println("\nVocê sofreu dano.");
            }
            System.out.println("Sasuke " + Sasuke);
            System.out.println("Naruto " + Naruto);
        }

        if(Naruto.vida() == true && Sasuke.vida() == false){
            System.out.println("Sasuke morreu...");
        }else if(Sasuke.vida() == true && Naruto.vida() == false){   
            System.out.println("Você morreu...");
        }else
            System.out.println("Ambos morreram em uma épica batalha...");

        input.close();
    }    
}
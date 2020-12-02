import java.util.Scanner;
import java.util.Random;

class Ninja_personagem {
    int vida;
    int chakra;
    int especial;
    int agilidade;
    
    Ninja_personagem (int vida, int chakra, int especial, int agilidade){ 
        this.vida = vida;
        this.chakra = chakra;
        this.especial = especial;
        this.agilidade = agilidade;
    }

    boolean vida(){            //Verifica se algum deles ainda estão vivo
        if(vida > 0)
            return true;
        else 
            return false;
    }

    boolean recuperarVida(){         //Permiti recuperar vida de acordo com a quantidade de chakra
        if(chakra >= 20 && chakra <= 40){
            vida += 10;
            return true;
        }else if(chakra >= 40 && chakra <= 80){
            vida += 20;
            return true;
        }else if(chakra >= 80 && chakra < 100){
            vida += 30;
            return true;
        }else{
            System.out.println("Isso não vai ser possivel.");
            return false;
        }
    }

    boolean recuperarChakra(){     //Permiti recuperar chakra de acordo com a quantidade de vida
        if(vida >= 20 && vida <= 40){
            chakra += 20;
            return true;
        }else if(vida >= 40 && vida <= 80){
            chakra += 30;
            agilidade += 5;
            return true;
        }else if(vida >= 80 && vida < 100){
            chakra += 40;
            agilidade += 10;
            return true;
        }else{
            System.out.println("Isso não vai ser possivel.");
            return false;
        }
    }

    boolean agilidade(){
        if(agilidade > 0){
            agilidade -= 10;
            return true;
        }else 
            return false;
    }

    void dano(int dano){        //Subtrai a vida dos personagens de acordo com os ataques
        vida -= dano;
    }

    int ataque(int ataque){     //Executa o ataque conforme a quantidade de chakra
        if(ataque == 1 && chakra >= 5){
            return 10;
        }else if(ataque == 2 && chakra >= 10){
            return 20;
        }else if(ataque == 3 && chakra >= 15){
            return 30;
        }else
            System.out.println("Errou o golpe.");
            return 0;
    }

    public String toString(){
        return "Vida: " + vida + "/100" + " Chakra: " + chakra + " Agilidade: " + agilidade;
    }

    public static void main(String[] args) {
        Ninja_personagem Naruto = new Ninja_personagem(100, 100, 0, 50);
        Ninja_personagem Sasuke = new Ninja_personagem(100, 100, 0, 50);
        
        System.out.println(Naruto);
        System.out.println(Sasuke);
    }
}

public class Ninja_Interativo {

    public static void imprimir(){
        System.out.println("\nNaruto: - SASUKEEE!!!\nSasuke: - NARUTOOO!!!");
        System.out.println("Sakura: - Naruto! O sasuke tá ficando doido! Mete a surra nele!!!");

        System.out.println("\nAtaque 1 - Rasengan");
        System.out.println("Ataque 2 - Jutsu multiclones da sombras");
        System.out.println("Ataque 3 - Dedo secreto da aldeia da folha");
        System.out.println("Chakra (recuperar)");
        System.out.println("Vida (recuperar)");
        System.out.println("Especial");
    }

    public static void main(String[] args){

        Ninja_personagem Naruto = new Ninja_personagem(100, 100, 0, 50);
        Ninja_personagem Sasuke = new Ninja_personagem(100, 100, 0, 50);

        Scanner input = new Scanner(System.in);         //Inicializando scanner com noe input
        Random aleatorio = new Random();                //Inicializando gerador de numeros aleatorios

        imprimir();
        
        while(Naruto.vida() == true && Sasuke.vida() == true){            //loop infinito pra continuidade do jogo

            System.out.println("\nNaruto, escolha sua ação:");
            String line = input.nextLine();
            String[] tipo = line.split(" ");
            System.out.println("\n");

            if(line.equals("end")){
                System.out.println("Você desistiu da luta. Você não iria matar se amigo, não é mesmo?"); break;
            }else if(tipo[0].equals("ataque")){        

                if(aleatorio.nextBoolean() == true && Sasuke.agilidade() == true){      //Gera aleatoriedade para movimento e verifica se desvio é possivel
                    System.out.println("Sasuke desviou.");
                }else{
                    System.out.println("Sasuke sofreu dano!");
                    Sasuke.dano(Naruto.ataque(Integer.parseInt(tipo[1])));              //Sasuke sofre dano de acordo com o ataque de Naruto
                }

            }else if(tipo[0].equals("chakra")){
                Naruto.recuperarChakra();
            }else if(tipo[0].equals("vida")){
                Naruto.recuperarVida();
            }else{
                System.out.println("fail: comando invalido");
            }

            System.out.println("Sasuke " + Sasuke);
            System.out.println("Naruto " + Naruto);

            int movimentoSasuke = aleatorio.nextInt(3);
            
            if(movimentoSasuke == 1){
                int ataqueSasuke = aleatorio.nextInt(3);    //Ataque do Sasuke
                Naruto.dano(Sasuke.ataque(ataqueSasuke));
                System.out.println("\nVocê sofreu dano.");
            }else if(movimentoSasuke == 2){
                if(Sasuke.recuperarChakra() == true){
                    System.out.println("\nSasuke recuperou chakra!");
                }else 
                    System.out.println("\nSeu oponente é muito esperto, mas ele não é pareo pra você!");
            }else if(movimentoSasuke == 3){
                if(Sasuke.recuperarVida() == true){
                    System.out.println("\nSasuke recuperou vida!");
                }else
                    System.out.println("\nSAKURA: - Naruto idiota! Não machuque o meu Sasuke!");
            }
        }
        input.close();
    }
}
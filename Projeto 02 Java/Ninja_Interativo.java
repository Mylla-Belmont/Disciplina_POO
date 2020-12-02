import java.util.Scanner;

class Ninja_personagem {
    int vida;
    int chakra;
    int especial;
    int agilidade;

    boolean vida(){            //Verifica se algum deles ainda estão vivo
        if(vida > 0)
            return true;
        else 
            return false;
    }
    
    Ninja_personagem (int vida, int chakra, int agilidade){ 
        this.vida = vida;
        this.chakra = chakra;
        this.agilidade = agilidade;
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
            System.out.println("Você errou o golpe.");
            return 0;
    }

    public String toString(){
        return "Vida: " + vida + "/100" + " Chakra: " + chakra;
    }

    public static void main(String[] args) {
        Ninja_personagem Naruto = new Ninja_personagem(100, 100, 50);
        Ninja_personagem Sasuke = new Ninja_personagem(100, 100, 50);

        System.out.println(Naruto);
        System.out.println(Sasuke);

    }
}

public class Ninja_Interativo {
    public static void main(String[] args){

        Ninja Naruto = new Ninja(100, 100, 50);         //Objetos do código
        Ninja Sasuke = new Ninja(100, 100, 50);

        Scanner input = new Scanner(System.in);         //Inicializando scanner com noe input

        System.out.println("\nNaruto: - SASUKEEE!!!\nSasuke: - NARUTOOO!!!");
        System.out.println("Sakura: - Naruto! O sasuke tá ficando doido! Mete a surra nele!!!");

        System.out.println("\nAtaque 1 - Rasengan");
        System.out.println("Ataque 2 - Jutsu multiclones da sombras");
        System.out.println("Ataque 3 - Dedo secreto da aldeia da folha");
        System.out.println("Chakra (recuperar)");
        System.out.println("Vida (recuperar)");
        System.out.println("Especial");
        
        while(Naruto.vida() == true && Sasuke.vida() == true){            //loop infinito pra continuidade do jogo

            System.out.println("\nNaruto, escolha sua ação:");
            String line = input.nextLine();
            String[] tipo = line.split(" ");

            if(line.equals("end")){
                    System.out.println("Você desistiu da luta. Você não iria matar se amigo, não é mesmo?"); break;
            }else if(line.equals("show")){
                    System.out.println("Sasuke " + Sasuke);
                    System.out.println("Naruto " + Naruto);
            }else if(tipo[0].equals("ataque")){
                    Sasuke.dano(Naruto.ataque(Integer.parseInt(tipo[1])));
            }else if(tipo[0].equals("chakra")){
                    Naruto.recuperarChakra();
            }else if(tipo[0].equals("vida")){
                    Naruto.recuperarVida();
            }else{
                    System.out.println("fail: comando invalido");
            }
        }
        input.close();
    }
}
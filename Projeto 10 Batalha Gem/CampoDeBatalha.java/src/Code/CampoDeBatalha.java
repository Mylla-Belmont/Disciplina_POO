package Code;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

abstract class Gems{
    int poder;
    int maxPoder;
    int energia;
    int maxEnergia;
    int minEnergia;
    int resistenciaArma;
    int maxRecuperacao;
    boolean vida;
    ArrayList<Fusões> fusão;

    public Gems(int poder, int energia, int minEnergia, int resistenciaArma, int maxRecuperacao){
        this.vida = true;
        this.poder = poder;
        this.maxPoder = poder;
        this.energia = energia;
        this.maxEnergia = energia;
        this.minEnergia = minEnergia;
        this.resistenciaArma = resistenciaArma;
        this.maxRecuperacao = maxRecuperacao;
        this.fusão = new ArrayList<>();
    }
    
    abstract int atacar();
    abstract void sofrerDano(int dano);
    abstract int usarPoder();
    abstract void recuperar();
}

interface CristalGems{
    void fundir(String nomeFusão);
}

public class CampoDeBatalha {
    public static void main(String[] pargs) throws Exception {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        Batalha batalha = new Batalha();
        Perolas perola = new Perolas(80, 90, 15, 10, 3);
        Ametistas ametista = new Ametistas(70, 100, 10, 10, 2);

        System.out.println("Escolha sua Gem:");
        String input = scanner.nextLine();
        String oponente = "";
            
        if(random.nextInt(5) == 0)
            oponente = "perola";
        else if(random.nextInt(5) == 1)
            oponente = "ametista";
        else if(random.nextInt(5) == 2)
            oponente = "rubi";
        else if(random.nextInt(5) == 3)
            oponente = "safira";
        else if(random.nextInt(5) == 4)
            oponente = "lapis";
        else if(random.nextInt(5) == 5)
            oponente = "jasper";
        
            oponente = "ametista"; //Teste
        
        System.out.println("Seu oponente será a " + oponente + "!");
            //Apagar mensagem
        System.out.println("Sua oponente está preparada para atacar! Qual será sua ação?");
        System.out.println("1 - Atacar");
        System.out.println("2 - Usar poder");
        System.out.println("3 - Recuperar");
        System.out.println("4 - Fundir");

        switch(input){
            case "perola":
            
                if(oponente.equals("perola")){
                    batalha.perolaXperola(scanner, perola, perola);
                }else if(oponente.equals("ametista")){
                    batalha.perolaXametista(scanner, perola, ametista);
                }
                break;
            }
        scanner.close();
    }
}

// Rubis rubi = new Rubis(100, 100, 100, 100, 100);
        // Safiras safira = new Safiras(100, 100, 100, 100, 100);
        // Lapis Lapis = new Lapis(100, 100, 100, 100, 100);
        // Japers jasper = new Japers(100, 100, 100, 100, 100);

// case "ametista":
                // break;
                // case "rubi":
                // break;
                // case "safira":
                // break;
                // case "lapis":
                // break;
                // case "jasper":
                // break;
                // default:

//Melhorar morte dos personagens
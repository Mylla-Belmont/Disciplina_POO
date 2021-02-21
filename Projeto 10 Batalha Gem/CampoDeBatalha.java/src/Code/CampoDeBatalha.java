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

        Perolas perola = new Perolas(80, 90, 15, 10, 3);
        Ametistas ametista = new Ametistas(70, 100, 10, 10, 2);
        Rubis rubi = new Rubis(100, 100, 100, 100, 100);
        Safiras safira = new Safiras(100, 100, 100, 100, 100);
        Lapis Lapis = new Lapis(100, 100, 100, 100, 100);
        Japers jasper = new Japers(100, 100, 100, 100, 100);

        BatalhaPerola batalhaPerola = new BatalhaPerola();
        BatalhaAmetista batalhaAmetista = new BatalhaAmetista();
        BatalhaRubi batalhaRubi = new BatalhaRubi();
        BatalhaSafira batalhaSafira = new BatalhaSafira();

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
                    batalhaPerola.perolaXperola(scanner, perola, perola);
                }else if(oponente.equals("ametista")){
                    batalhaPerola.perolaXametista(scanner, perola, ametista);
                }else if(oponente.equals("rubi")){
                    batalhaPerola.perolaXrubi(scanner, perola, rubi);
                }else if(oponente.equals("safira")){
                    batalhaPerola.perolaXsafira(scanner, perola, safira);
                }else if(oponente.equals("lapis")){
                    batalhaPerola.perolaXlapis(scanner, perola, Lapis);
                }else if(oponente.equals("jasper"))
                    batalhaPerola.perolaXjasper(scanner, perola, jasper);
                break;

            case "ametista":
                if(oponente.equals("perola")){
                    batalhaAmetista.ametistaXperola(scanner, ametista, perola);
                }else if(oponente.equals("ametista")){
                    batalhaAmetista.ametistaXametista(scanner, ametista, ametista);
                }else if(oponente.equals("rubi")){
                    batalhaAmetista.ametistaXrubi(scanner, ametista, rubi);
                }else if(oponente.equals("safira")){
                    batalhaAmetista.ametistaXsafira(scanner, ametista, safira);
                }else if(oponente.equals("lapis")){
                    batalhaAmetista.ametistaXlapis(scanner, ametista, Lapis);
                }else if(oponente.equals("jasper"))
                    batalhaAmetista.ametistaXjasper(scanner, ametista, jasper);
                break;
            
            case "rubi":
                if(oponente.equals("perola")){
                    batalhaRubi.rubiXperola(scanner, rubi, perola);
                }else if(oponente.equals("ametista")){
                    batalhaRubi.rubiXametista(scanner, rubi, ametista);
                }else if(oponente.equals("rubi")){
                    batalhaRubi.rubiXrubi(scanner, rubi, rubi);
                }else if(oponente.equals("safira")){
                    batalhaRubi.rubiXsafira(scanner, rubi, safira);
                }else if(oponente.equals("lapis")){
                    batalhaRubi.rubiXlapis(scanner, rubi, Lapis);
                }else if(oponente.equals("jasper"))
                    batalhaRubi.rubiXjasper(scanner, rubi, jasper);
                break;
            
            case "safira":
                if(oponente.equals("perola")){
                    batalhaSafira.safiraXperola(scanner, safira, perola);
                }else if(oponente.equals("ametista")){
                    batalhaSafira.safiraXametista(scanner, safira, ametista);
                }else if(oponente.equals("rubi")){
                    batalhaSafira.safiraXrubi(scanner, safira, rubi);
                }else if(oponente.equals("safira")){
                    batalhaSafira.safiraXsafira(scanner, safira, safira);
                }else if(oponente.equals("lapis")){
                    batalhaSafira.safiraXlapis(scanner, safira, Lapis);
                }else if(oponente.equals("jasper"))
                    batalhaSafira.safiraXjasper(scanner, safira, jasper);
                break;
            }
        scanner.close();
    }
}
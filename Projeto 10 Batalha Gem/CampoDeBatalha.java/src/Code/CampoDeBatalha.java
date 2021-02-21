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
        Rubis rubi = new Rubis(0, 90, 5, 0, 2);
        Safiras safira = new Safiras(90, 70, 20, 0, 2);
        Lapis lapis = new Lapis(100, 90, 5, 0, 3);
        Japers jasper = new Japers(0, 100, 5, 0, 4);

        BatalhaPerola batalhaPerola = new BatalhaPerola();
        BatalhaAmetista batalhaAmetista = new BatalhaAmetista();
        BatalhaRubi batalhaRubi = new BatalhaRubi();
        BatalhaSafira batalhaSafira = new BatalhaSafira();
        BatalhaLapis batalhaLapis = new BatalhaLapis();
        BatalhaJasper batalhaJasper = new BatalhaJasper();

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
                    batalhaPerola.perolaXlapis(scanner, perola, lapis);
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
                    batalhaAmetista.ametistaXlapis(scanner, ametista, lapis);
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
                    batalhaRubi.rubiXlapis(scanner, rubi, lapis);
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
                    batalhaSafira.safiraXlapis(scanner, safira, lapis);
                }else if(oponente.equals("jasper"))
                    batalhaSafira.safiraXjasper(scanner, safira, jasper);
                break;

            case "lapis":
                if(oponente.equals("perola")){
                    batalhaLapis.lapisXperola(scanner, lapis, perola);
                }else if(oponente.equals("ametista")){
                    batalhaLapis.lapisXametista(scanner, lapis, ametista);
                }else if(oponente.equals("rubi")){
                    batalhaLapis.lapisXrubi(scanner, lapis, rubi);
                }else if(oponente.equals("safira")){
                    batalhaLapis.lapisXsafira(scanner, lapis, safira);
                }else if(oponente.equals("lapis")){
                    batalhaLapis.lapisXlapis(scanner, lapis, lapis);
                }else if(oponente.equals("jasper"))
                    batalhaLapis.lapisXjasper(scanner, lapis, jasper);
                break;

            case "jasper":
                if(oponente.equals("perola")){
                    batalhaJasper.jasperXperola(scanner, jasper, perola);
                }else if(oponente.equals("ametista")){
                    batalhaJasper.jasperXametista(scanner, jasper, ametista);
                }else if(oponente.equals("rubi")){
                    batalhaJasper.jasperXrubi(scanner, jasper, rubi);
                }else if(oponente.equals("safira")){
                    batalhaJasper.jasperXsafira(scanner, jasper, safira);
                }else if(oponente.equals("lapis")){
                    batalhaJasper.jasperXlapis(scanner, jasper, lapis);
                }else if(oponente.equals("jasper"))
                    batalhaJasper.jasperXjasper(scanner, jasper, jasper);
                break;
            }
        scanner.close();
    }
}
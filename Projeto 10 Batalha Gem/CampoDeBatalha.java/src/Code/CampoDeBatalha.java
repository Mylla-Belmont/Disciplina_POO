package Code;

import java.util.Scanner;
import java.util.ArrayList;

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
        
        Scanner scanner = new Scanner(System.in);
        Perolas perola = new Perolas(100, 100, 100, 100, 100);
        Ametistas ametista = new Ametistas(100, 100, 100, 100, 100);
        Rubis rubi = new Rubis(100, 100, 100, 100, 100);
        Safiras safira = new Safiras(100, 100, 100, 100, 100);
        Lapis Lapis = new Lapis(100, 100, 100, 100, 100);
        Japers jasper = new Japers(100, 100, 100, 100, 100);

        try{

            while(true){
                System.out.println("Escolha uma gem seguinda ação");
                String input = scanner.nextLine();
                String[] Ui = input.split(" ");

                if(Ui[0].equals("perola") && Ui[1].equals("atacar") && Ui[2].equals("ametista")){
                    ametista.sofrerDano(perola.atacar());
                    System.out.println(ametista);
                }if(Ui[0].equals("end")){
                    break;
                }
            }

        }catch(RuntimeException e){
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}

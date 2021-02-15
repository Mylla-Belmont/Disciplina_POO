package Code;

import java.util.Scanner;

abstract class Gems{
    abstract int atacar();
    abstract void sofrerDano(int dano);
    abstract int usarPoder();
    abstract void recuperarEnergia();
    abstract void fundir(String nomeFusão);
}

public class CampoDeBatalha {
    public static void main(String[] pargs) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        Perolas perola = new Perolas(90, 70, 70);
        Ametistas ametistas = new Ametistas(80, 100, 60);

        try{

            while(true){
                System.out.println("Escolha uma gem seguinda ação");
                String input = scanner.nextLine();
                String[] Ui = input.split(" ");

                if(Ui[0].equals("perola") && Ui[1].equals("atacar") && Ui[2].equals("ametista")){
                    ametistas.sofrerDano(perola.atacar());
                    System.out.println(ametistas);
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

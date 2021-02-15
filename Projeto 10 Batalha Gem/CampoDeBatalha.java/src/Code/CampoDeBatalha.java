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
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        //Perolas perolas = new Perolas(20, 50, 30);

        try{
            System.out.println("!!!!!!!!!!!!!");
            String input = scanner.nextLine();
            String[] Ui = input.split(" ");


        }catch(RuntimeException e){
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}

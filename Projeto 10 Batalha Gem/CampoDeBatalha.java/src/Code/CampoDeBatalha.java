package Code;

import java.util.Scanner;

abstract class Guerreiras{
    abstract int atacar();
    abstract void sofrerDano(int dano);
    abstract void fundir(String nomeFusão);
    abstract int usarPoder();
    abstract void recuperarEnergia();
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

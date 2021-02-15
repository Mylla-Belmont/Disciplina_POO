package Main;

import java.util.Scanner;

abstract class Guerreiras{
    abstract int atacar();
    abstract void sofrerDano(int dano);
    abstract void fundir(String nomeFusão);
}

public class CampoDeBatalha {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("!!!!!!!!!!!!!");
        String input = scanner.nextLine();
        String[] Ui = input.split(" ");

        scanner.close();
    }
}

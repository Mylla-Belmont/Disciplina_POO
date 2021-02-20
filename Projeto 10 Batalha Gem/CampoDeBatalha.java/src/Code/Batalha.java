package Code;

import java.util.Scanner;

public class Batalha {
    
    public void perolaXperola(Scanner scanner, Perolas perola, Perolas perolaAdversario){ //fazer fusão
        try{
            while(perola.vida && perolaAdversario.vida){
                String Ui = scanner.nextLine();
                if(Ui.equals("1")){
                    perolaAdversario.sofrerDano(perola.atacar());
                    System.out.println("\n" + perola + "\n");
                    System.out.println(perolaAdversario + "\n");
                }else if(Ui.equals("2")){
                    perolaAdversario.sofrerDano(perola.usarPoder());
                    System.out.println("\n" + perola + "\n");
                    System.out.println(perolaAdversario + "\n");
                }else if(Ui.equals("3")){
                    perola.recuperar();
                    System.out.println("\n" + perola + "\n");
                }else if(Ui.equals("end"))
                    break;
                System.out.println("Qual será sua nova ação?");
            }
        } catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
    }

    public void perolaXametista(Scanner scanner, Perolas perola, Ametistas ametistaAdversario){ //fazer fusão
        try{
            while(perola.vida && ametistaAdversario.vida){
                String Ui = scanner.nextLine();
                if(Ui.equals("1")){
                    ametistaAdversario.sofrerDano(perola.atacar());
                    System.out.println("\n" + perola + "\n");
                    System.out.println(ametistaAdversario + "\n");
                }else if(Ui.equals("2")){
                    ametistaAdversario.sofrerDano(perola.usarPoder());
                    System.out.println("\n" + perola + "\n");
                    System.out.println(ametistaAdversario + "\n");
                }else if(Ui.equals("3")){
                    perola.recuperar();
                    System.out.println("\n" + perola + "\n");
                }else if(Ui.equals("end"))
                    break;
                System.out.println("Qual será sua nova ação?");
            }
        } catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
    }
}

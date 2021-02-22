package Code.Batalhas;

import java.util.Scanner;
import Code.*;

public class BatalhaLapis {
    public void lapisXperola(Scanner scanner, Lapis lapis, Perolas perolasAdversario){ //fazer fusão
        try{
            while(lapis.vida && perolasAdversario.vida){
                String Ui = scanner.nextLine();
                if(Ui.equals("1")){
                    perolasAdversario.sofrerDano(lapis.atacar());
                    System.out.println("\n" + lapis + "\n");
                    System.out.println(perolasAdversario + "\n");
                }else if(Ui.equals("2")){
                    perolasAdversario.sofrerDano(lapis.usarPoder());
                    System.out.println("\n" + lapis + "\n");
                    System.out.println(perolasAdversario + "\n");
                }else if(Ui.equals("3")){
                    lapis.recuperar();
                    System.out.println("\n" + lapis + "\n");
                }else if(Ui.equals("end"))
                    break;
                RandomAdversario.PerolaAdversario(perolasAdversario);
                System.out.println("Qual será sua nova ação?");
            }
        } catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
    }

    public void lapisXametista(Scanner scanner, Lapis lapis, Ametistas ametistaAdversario){ //fazer fusão
        try{
            while(lapis.vida && ametistaAdversario.vida){
                String Ui = scanner.nextLine();
                if(Ui.equals("1")){
                    ametistaAdversario.sofrerDano(lapis.atacar());
                    System.out.println("\n" + lapis + "\n");
                    System.out.println(ametistaAdversario + "\n");
                }else if(Ui.equals("2")){
                    ametistaAdversario.sofrerDano(lapis.usarPoder());
                    System.out.println("\n" + lapis + "\n");
                    System.out.println(ametistaAdversario + "\n");
                }else if(Ui.equals("3")){
                    lapis.recuperar();
                    System.out.println("\n" + lapis + "\n");
                }else if(Ui.equals("end"))
                    break;
                RandomAdversario.AmetistaAdversario(ametistaAdversario);
                System.out.println("Qual será sua nova ação?");
            }
        } catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
    }

    public void lapisXrubi(Scanner scanner, Lapis lapis, Rubis rubiAdversario){ 
        try{
            while(lapis.vida && rubiAdversario.vida){
                String Ui = scanner.nextLine();
                if(Ui.equals("1")){
                    rubiAdversario.sofrerDano(lapis.atacar());
                    System.out.println("\n" + lapis + "\n");
                    System.out.println(rubiAdversario + "\n");
                }else if(Ui.equals("2")){
                    rubiAdversario.sofrerDano(lapis.usarPoder());
                    System.out.println("\n" + lapis + "\n");
                    System.out.println(rubiAdversario + "\n");
                }else if(Ui.equals("3")){
                    lapis.recuperar();
                    System.out.println("\n" + lapis + "\n");
                }else if(Ui.equals("end"))
                    break;
                RandomAdversario.RubiAdversario(rubiAdversario);
                System.out.println("Qual será sua nova ação?");
            }
        } catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
    }

    public void lapisXsafira(Scanner scanner, Lapis lapis, Safiras safiraAdversario){ 
        try{
            while(lapis.vida && safiraAdversario.vida){
                String Ui = scanner.nextLine();
                if(Ui.equals("1")){
                    safiraAdversario.sofrerDano(lapis.atacar());
                    System.out.println("\n" + lapis + "\n");
                    System.out.println(safiraAdversario + "\n");
                }else if(Ui.equals("2")){
                    safiraAdversario.sofrerDano(lapis.usarPoder());
                    System.out.println("\n" + lapis + "\n");
                    System.out.println(safiraAdversario + "\n");
                }else if(Ui.equals("3")){
                    lapis.recuperar();
                    System.out.println("\n" + lapis + "\n");
                }else if(Ui.equals("end"))
                    break;
                RandomAdversario.SafiraAdversario(safiraAdversario);
                System.out.println("Qual será sua nova ação?");
            }
        } catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
    }

    public void lapisXlapis(Scanner scanner, Lapis lapis, Lapis lapisAdversario){ 
        try{
            while(lapis.vida && lapisAdversario.vida){
                String Ui = scanner.nextLine();
                if(Ui.equals("1")){
                    lapisAdversario.sofrerDano(lapis.atacar());
                    System.out.println("\n" + lapis + "\n");
                    System.out.println(lapisAdversario + "\n");
                }else if(Ui.equals("2")){
                    lapisAdversario.sofrerDano(lapis.usarPoder());
                    System.out.println("\n" + lapis + "\n");
                    System.out.println(lapisAdversario + "\n");
                }else if(Ui.equals("3")){
                    lapis.recuperar();
                    System.out.println("\n" + lapis + "\n");
                }else if(Ui.equals("end"))
                    break;
                RandomAdversario.LapisAdversario(lapisAdversario);
                System.out.println("Qual será sua nova ação?");
            }
        } catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
    }

    public void lapisXjasper(Scanner scanner, Lapis lapis, Japers jasperAdversario){ 
        try{
            while(lapis.vida && jasperAdversario.vida){
                String Ui = scanner.nextLine();
                if(Ui.equals("1")){
                    jasperAdversario.sofrerDano(lapis.atacar());
                    System.out.println("\n" + lapis + "\n");
                    System.out.println(jasperAdversario + "\n");
                }else if(Ui.equals("2")){
                    jasperAdversario.sofrerDano(lapis.usarPoder());
                    System.out.println("\n" + lapis + "\n");
                    System.out.println(jasperAdversario + "\n");
                }else if(Ui.equals("3")){
                    lapis.recuperar();
                    System.out.println("\n" + lapis + "\n");
                }else if(Ui.equals("end"))
                    break;
                RandomAdversario.JasperAdversario(jasperAdversario);
                System.out.println("Qual será sua nova ação?");
            }
        } catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
    }
}
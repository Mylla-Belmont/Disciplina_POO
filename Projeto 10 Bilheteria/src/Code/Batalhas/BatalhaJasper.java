package Code.Batalhas;

import java.util.Scanner;
import Code.*;

public class BatalhaJasper {
    public void jasperXperola(Scanner scanner, Japers jasper, Perolas perolasAdversario) { // fazer fusão
        try{
            while(jasper.vida && perolasAdversario.vida){
                String Ui = scanner.nextLine();
                if(Ui.equals("1")){
                    perolasAdversario.sofrerDano(jasper.atacar());
                    System.out.println(jasper);
                    System.out.println(perolasAdversario);
                }else if(Ui.equals("2")){
                    perolasAdversario.sofrerDano(jasper.usarPoder());
                    System.out.println(jasper);
                    System.out.println(perolasAdversario);
                }else if(Ui.equals("3")){
                    jasper.recuperar();
                    System.out.println(jasper);
                }else if(Ui.equals("4")){
                    System.out.println("Jasper não pode fundir-se");
                }else if(Ui.equals("end"))
                    break;
                RandomAdversario.PerolaAdversario(perolasAdversario);
                System.out.println("Qual será sua nova ação?");
            }
        } catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
    }

    public void jasperXametista(Scanner scanner, Japers jasper, Ametistas ametistaAdversario){ //fazer fusão
        try{
            while(jasper.vida && ametistaAdversario.vida){
                String Ui = scanner.nextLine();
                if(Ui.equals("1")){
                    ametistaAdversario.sofrerDano(jasper.atacar());
                    System.out.println(jasper);
                    System.out.println(ametistaAdversario);
                }else if(Ui.equals("2")){
                    ametistaAdversario.sofrerDano(jasper.usarPoder());
                    System.out.println(jasper);
                    System.out.println(ametistaAdversario);
                }else if(Ui.equals("3")){
                    jasper.recuperar();
                    System.out.println(jasper);
                }else if(Ui.equals("4")){
                    System.out.println("Jasper não pode fundir-se");
                }else if(Ui.equals("end"))
                    break;
                RandomAdversario.AmetistaAdversario(ametistaAdversario);
                System.out.println("Qual será sua nova ação?");
            }
        } catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
    }

    public void jasperXrubi(Scanner scanner, Japers jasper, Rubis rubiAdversario){ 
        try{
            while(jasper.vida && rubiAdversario.vida){
                String Ui = scanner.nextLine();
                if(Ui.equals("1")){
                    rubiAdversario.sofrerDano(jasper.atacar());
                    System.out.println(jasper);
                    System.out.println(rubiAdversario);
                }else if(Ui.equals("2")){
                    rubiAdversario.sofrerDano(jasper.usarPoder());
                    System.out.println(jasper);
                    System.out.println(rubiAdversario);
                }else if(Ui.equals("3")){
                    jasper.recuperar();
                    System.out.println(jasper);
                }else if(Ui.equals("4")){
                    System.out.println("Jasper não pode fundir-se");
                }else if(Ui.equals("end"))
                    break;
                RandomAdversario.RubiAdversario(rubiAdversario);
                System.out.println("Qual será sua nova ação?");
            }
        } catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
    }

    public void jasperXsafira(Scanner scanner, Japers jasper, Safiras safiraAdversario){ 
        try{
            while(jasper.vida && safiraAdversario.vida){
                String Ui = scanner.nextLine();
                if(Ui.equals("1")){
                    safiraAdversario.sofrerDano(jasper.atacar());
                    System.out.println(jasper);
                    System.out.println(safiraAdversario);
                }else if(Ui.equals("2")){
                    safiraAdversario.sofrerDano(jasper.usarPoder());
                    System.out.println(jasper);
                    System.out.println(safiraAdversario);
                }else if(Ui.equals("3")){
                    jasper.recuperar();
                    System.out.println(jasper);
                }else if(Ui.equals("4")){
                    System.out.println("Jasper não pode fundir-se");
                }else if(Ui.equals("end"))
                    break;
                RandomAdversario.SafiraAdversario(safiraAdversario);
                System.out.println("Qual será sua nova ação?");
            }
        } catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
    }

    public void jasperXlapis(Scanner scanner, Japers jasper, Lapis lapisAdversario){ 
        try{
            while(jasper.vida && lapisAdversario.vida){
                String Ui = scanner.nextLine();
                if(Ui.equals("1")){
                    lapisAdversario.sofrerDano(jasper.atacar());
                    System.out.println(jasper);
                    System.out.println(lapisAdversario);
                }else if(Ui.equals("2")){
                    lapisAdversario.sofrerDano(jasper.usarPoder());
                    System.out.println(jasper);
                    System.out.println(lapisAdversario);
                }else if(Ui.equals("3")){
                    jasper.recuperar();
                    System.out.println(jasper);
                }else if(Ui.equals("4")){
                    System.out.println("Jasper não pode fundir-se");
                }else if(Ui.equals("end"))
                    break;
                RandomAdversario.LapisAdversario(lapisAdversario);
                System.out.println("Qual será sua nova ação?");
            }
        } catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
    }

    public void jasperXjasper(Scanner scanner, Japers jasper, Japers jasperAdversario){ 
        try{
            while(jasper.vida && jasperAdversario.vida){
                String Ui = scanner.nextLine();
                if(Ui.equals("1")){
                    jasperAdversario.sofrerDano(jasper.atacar());
                    System.out.println(jasper);
                    System.out.println(jasperAdversario);
                }else if(Ui.equals("2")){
                    jasperAdversario.sofrerDano(jasper.usarPoder());
                    System.out.println(jasper);
                    System.out.println(jasperAdversario);
                }else if(Ui.equals("3")){
                    jasper.recuperar();
                    System.out.println(jasper);
                }else if(Ui.equals("4")){
                    System.out.println("Jasper não pode fundir-se");
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

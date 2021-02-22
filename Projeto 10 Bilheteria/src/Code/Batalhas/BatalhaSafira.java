package Code.Batalhas;

import java.util.Scanner;
import Code.*;

public class BatalhaSafira {
    public void safiraXperola(Scanner scanner, Safiras safira, Perolas perolasAdversario){ //fazer fusão
        try{
            while(safira.vida && perolasAdversario.vida){
                String Ui = scanner.nextLine();
                if(Ui.equals("1")){
                    perolasAdversario.sofrerDano(safira.atacar());
                    System.out.println(safira);
                    System.out.println(perolasAdversario);
                }else if(Ui.equals("2")){
                    perolasAdversario.sofrerDano(safira.usarPoder());
                    System.out.println(safira);
                    System.out.println(perolasAdversario);
                }else if(Ui.equals("3")){
                    safira.recuperar();
                    System.out.println(safira);
                }else if(Ui.equals("end"))
                    break;
                RandomAdversario.PerolaAdversario(perolasAdversario);
                System.out.println("Qual será sua nova ação?");
            }
        } catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
    }

    public void safiraXametista(Scanner scanner, Safiras safira, Ametistas ametistaAdversario){ //fazer fusão
        try{
            while(safira.vida && ametistaAdversario.vida){
                String Ui = scanner.nextLine();
                if(Ui.equals("1")){
                    ametistaAdversario.sofrerDano(safira.atacar());
                    System.out.println(safira);
                    System.out.println(ametistaAdversario);
                }else if(Ui.equals("2")){
                    ametistaAdversario.sofrerDano(safira.usarPoder());
                    System.out.println(safira);
                    System.out.println(ametistaAdversario);
                }else if(Ui.equals("3")){
                    safira.recuperar();
                    System.out.println(safira);
                }else if(Ui.equals("end"))
                    break;
                RandomAdversario.AmetistaAdversario(ametistaAdversario);
                System.out.println("Qual será sua nova ação?");
            }
        } catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
    }

    public void safiraXrubi(Scanner scanner, Safiras safira, Rubis rubiAdversario){ 
        try{
            while(safira.vida && rubiAdversario.vida){
                String Ui = scanner.nextLine();
                if(Ui.equals("1")){
                    rubiAdversario.sofrerDano(safira.atacar());
                    System.out.println(safira);
                    System.out.println(rubiAdversario);
                }else if(Ui.equals("2")){
                    rubiAdversario.sofrerDano(safira.usarPoder());
                    System.out.println(safira);
                    System.out.println(rubiAdversario);
                }else if(Ui.equals("3")){
                    safira.recuperar();
                    System.out.println(safira);
                }else if(Ui.equals("end"))
                    break;
                RandomAdversario.RubiAdversario(rubiAdversario);
                System.out.println("Qual será sua nova ação?");
            }
        } catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
    }

    public void safiraXsafira(Scanner scanner, Safiras Safiras, Safiras safiraAdversario){ 
        try{
            while(Safiras.vida && safiraAdversario.vida){
                String Ui = scanner.nextLine();
                if(Ui.equals("1")){
                    safiraAdversario.sofrerDano(Safiras.atacar());
                    System.out.println(Safiras);
                    System.out.println(safiraAdversario);
                }else if(Ui.equals("2")){
                    safiraAdversario.sofrerDano(Safiras.usarPoder());
                    System.out.println(Safiras);
                    System.out.println(safiraAdversario);
                }else if(Ui.equals("3")){
                    Safiras.recuperar();
                    System.out.println(Safiras);
                }else if(Ui.equals("end"))
                    break;
                RandomAdversario.SafiraAdversario(safiraAdversario);
                System.out.println("Qual será sua nova ação?");
            }
        } catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
    }

    public void safiraXlapis(Scanner scanner, Safiras Safiras, Lapis lapisAdversario){ 
        try{
            while(Safiras.vida && lapisAdversario.vida){
                String Ui = scanner.nextLine();
                if(Ui.equals("1")){
                    lapisAdversario.sofrerDano(Safiras.atacar());
                    System.out.println(Safiras);
                    System.out.println(lapisAdversario);
                }else if(Ui.equals("2")){
                    lapisAdversario.sofrerDano(Safiras.usarPoder());
                    System.out.println(Safiras);
                    System.out.println(lapisAdversario);
                }else if(Ui.equals("3")){
                    Safiras.recuperar();
                    System.out.println(Safiras);
                }else if(Ui.equals("end"))
                    break;
                RandomAdversario.LapisAdversario(lapisAdversario);
                System.out.println("Qual será sua nova ação?");
            }
        } catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
    }

    public void safiraXjasper(Scanner scanner, Safiras Safiras, Japers jasperAdversario){ 
        try{
            while(Safiras.vida && jasperAdversario.vida){
                String Ui = scanner.nextLine();
                if(Ui.equals("1")){
                    jasperAdversario.sofrerDano(Safiras.atacar());
                    System.out.println(Safiras);
                    System.out.println(jasperAdversario);
                }else if(Ui.equals("2")){
                    jasperAdversario.sofrerDano(Safiras.usarPoder());
                    System.out.println(Safiras);
                    System.out.println(jasperAdversario);
                }else if(Ui.equals("3")){
                    Safiras.recuperar();
                    System.out.println(Safiras);
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
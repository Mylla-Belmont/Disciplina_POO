package Code.Batalhas;

import java.util.Scanner;
import Code.*;

public class BatalhaPerola {
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
                RandomAdversario.PerolaAdversario(perolaAdversario);
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
                RandomAdversario.AmetistaAdversario(ametistaAdversario);
                System.out.println("Qual será sua nova ação?");
            }
        } catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
    }

    public void perolaXrubi(Scanner scanner, Perolas perola, Rubis rubiAdversario){ 
        try{
            while(perola.vida && rubiAdversario.vida){
                String Ui = scanner.nextLine();
                if(Ui.equals("1")){
                    rubiAdversario.sofrerDano(perola.atacar());
                    System.out.println("\n" + perola + "\n");
                    System.out.println(rubiAdversario + "\n");
                }else if(Ui.equals("2")){
                    rubiAdversario.sofrerDano(perola.usarPoder());
                    System.out.println("\n" + perola + "\n");
                    System.out.println(rubiAdversario + "\n");
                }else if(Ui.equals("3")){
                    perola.recuperar();
                    System.out.println("\n" + perola + "\n");
                }else if(Ui.equals("end"))
                    break;
                RandomAdversario.RubiAdversario(rubiAdversario);
                System.out.println("Qual será sua nova ação?");
            }
        } catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
    }

    public void perolaXsafira(Scanner scanner, Perolas perola, Safiras safiraAdversario){ 
        try{
            while(perola.vida && safiraAdversario.vida){
                String Ui = scanner.nextLine();
                if(Ui.equals("1")){
                    safiraAdversario.sofrerDano(perola.atacar());
                    System.out.println("\n" + perola + "\n");
                    System.out.println(safiraAdversario + "\n");
                }else if(Ui.equals("2")){
                    safiraAdversario.sofrerDano(perola.usarPoder());
                    System.out.println("\n" + perola + "\n");
                    System.out.println(safiraAdversario + "\n");
                }else if(Ui.equals("3")){
                    perola.recuperar();
                    System.out.println("\n" + perola + "\n");
                }else if(Ui.equals("end"))
                    break;
                RandomAdversario.SafiraAdversario(safiraAdversario);
                System.out.println("Qual será sua nova ação?");
            }
        } catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
    }

    public void perolaXlapis(Scanner scanner, Perolas perola, Lapis lapisAdversario){ 
        try{
            while(perola.vida && lapisAdversario.vida){
                String Ui = scanner.nextLine();
                if(Ui.equals("1")){
                    lapisAdversario.sofrerDano(perola.atacar());
                    System.out.println("\n" + perola + "\n");
                    System.out.println(lapisAdversario + "\n");
                }else if(Ui.equals("2")){
                    lapisAdversario.sofrerDano(perola.usarPoder());
                    System.out.println("\n" + perola + "\n");
                    System.out.println(lapisAdversario + "\n");
                }else if(Ui.equals("3")){
                    perola.recuperar();
                    System.out.println("\n" + perola + "\n");
                }else if(Ui.equals("end"))
                    break;
                RandomAdversario.LapisAdversario(lapisAdversario);
                System.out.println("Qual será sua nova ação?");
            }
        } catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
    }

    public void perolaXjasper(Scanner scanner, Perolas perola, Japers jasperAdversario){ 
        try{
            while(perola.vida && jasperAdversario.vida){
                String Ui = scanner.nextLine();
                if(Ui.equals("1")){
                    jasperAdversario.sofrerDano(perola.atacar());
                    System.out.println("\n" + perola + "\n");
                    System.out.println(jasperAdversario + "\n");
                }else if(Ui.equals("2")){
                    jasperAdversario.sofrerDano(perola.usarPoder());
                    System.out.println("\n" + perola + "\n");
                    System.out.println(jasperAdversario + "\n");
                }else if(Ui.equals("3")){
                    perola.recuperar();
                    System.out.println("\n" + perola + "\n");
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

//Terminar Random para as outras

package Code.Batalhas;

import java.util.Scanner;
import Code.*;

public class BatalhaAmetista {
    public void ametistaXperola(Scanner scanner, Ametistas ametista, Perolas perolasAdversario){ //fazer fusão
        try{
            while(ametista.vida && perolasAdversario.vida){
                String Ui = scanner.nextLine();
                if(Ui.equals("1")){
                    perolasAdversario.sofrerDano(ametista.atacar());
                    System.out.println(ametista);
                    System.out.println(perolasAdversario);
                }else if(Ui.equals("2")){
                    perolasAdversario.sofrerDano(ametista.usarPoder());
                    System.out.println(ametista);
                    System.out.println(perolasAdversario);
                }else if(Ui.equals("3")){
                    ametista.recuperar();
                    System.out.println(ametista);
                }else if(Ui.equals("4")){
                    System.out.println("Com qual Gem deseja se fundir?");
                    String nomeOther = scanner.nextLine();
                    perolasAdversario.sofrerDano(ametista.fundir(nomeOther));;
                    System.out.println(ametista);
                }else if(Ui.equals("end"))
                    break;
                RandomAdversario.PerolaAdversario(perolasAdversario);
                System.out.println("Qual será sua nova ação?");
            }
        } catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
    }

    public void ametistaXametista(Scanner scanner, Ametistas ametista, Ametistas ametistaAdversario){ //fazer fusão
        try{
            while(ametista.vida && ametistaAdversario.vida){
                String Ui = scanner.nextLine();
                if(Ui.equals("1")){
                    ametistaAdversario.sofrerDano(ametista.atacar());
                    System.out.println(ametista);
                    System.out.println(ametistaAdversario);
                }else if(Ui.equals("2")){
                    ametistaAdversario.sofrerDano(ametista.usarPoder());
                    System.out.println(ametista);
                    System.out.println(ametistaAdversario);
                }else if(Ui.equals("3")){
                    ametista.recuperar();
                    System.out.println(ametista);
                }else if(Ui.equals("4")){
                    System.out.println("Com qual Gem deseja se fundir?");
                    String nomeOther = scanner.nextLine();
                    ametistaAdversario.sofrerDano(ametista.fundir(nomeOther));;
                    System.out.println(ametista);
                }else if(Ui.equals("end"))
                    break;
                RandomAdversario.AmetistaAdversario(ametistaAdversario);
                System.out.println("Qual será sua nova ação?");
            }
        } catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
    }

    public void ametistaXrubi(Scanner scanner, Ametistas ametista, Rubis rubiAdversario){ 
        try{
            while(ametista.vida && rubiAdversario.vida){
                String Ui = scanner.nextLine();
                if(Ui.equals("1")){
                    rubiAdversario.sofrerDano(ametista.atacar());
                    System.out.println(ametista);
                    System.out.println(rubiAdversario);
                }else if(Ui.equals("2")){
                    rubiAdversario.sofrerDano(ametista.usarPoder());
                    System.out.println(ametista);
                    System.out.println(rubiAdversario);
                }else if(Ui.equals("3")){
                    ametista.recuperar();
                    System.out.println(ametista);
                }else if(Ui.equals("4")){
                    System.out.println("Com qual Gem deseja se fundir?");
                    String nomeOther = scanner.nextLine();
                    rubiAdversario.sofrerDano(ametista.fundir(nomeOther));;
                    System.out.println(ametista);
                }else if(Ui.equals("end"))
                    break;
                RandomAdversario.RubiAdversario(rubiAdversario);
                System.out.println("Qual será sua nova ação?");
            }
        } catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
    }

    public void ametistaXsafira(Scanner scanner, Ametistas ametista, Safiras safiraAdversario){ 
        try{
            while(ametista.vida && safiraAdversario.vida){
                String Ui = scanner.nextLine();
                if(Ui.equals("1")){
                    safiraAdversario.sofrerDano(ametista.atacar());
                    System.out.println(ametista);
                    System.out.println(safiraAdversario);
                }else if(Ui.equals("2")){
                    safiraAdversario.sofrerDano(ametista.usarPoder());
                    System.out.println(ametista);
                    System.out.println(safiraAdversario);
                }else if(Ui.equals("3")){
                    ametista.recuperar();
                    System.out.println(ametista);
                }else if(Ui.equals("4")){
                    System.out.println("Com qual Gem deseja se fundir?");
                    String nomeOther = scanner.nextLine();
                    safiraAdversario.sofrerDano(ametista.fundir(nomeOther));
                    System.out.println(ametista);
                }else if(Ui.equals("end"))
                    break;
                RandomAdversario.SafiraAdversario(safiraAdversario);
                System.out.println("Qual será sua nova ação?");
            }
        } catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
    }

    public void ametistaXlapis(Scanner scanner, Ametistas ametista, Lapis lapisAdversario){ 
        try{
            while(ametista.vida && lapisAdversario.vida){
                String Ui = scanner.nextLine();
                if(Ui.equals("1")){
                    lapisAdversario.sofrerDano(ametista.atacar());
                    System.out.println(ametista);
                    System.out.println(lapisAdversario);
                }else if(Ui.equals("2")){
                    lapisAdversario.sofrerDano(ametista.usarPoder());
                    System.out.println(ametista);
                    System.out.println(lapisAdversario);
                }else if(Ui.equals("3")){
                    ametista.recuperar();
                    System.out.println(ametista);
                }else if(Ui.equals("4")){
                    System.out.println("Com qual Gem deseja se fundir?");
                    String nomeOther = scanner.nextLine();
                    lapisAdversario.sofrerDano(ametista.fundir(nomeOther));
                    System.out.println(ametista);
                }else if(Ui.equals("end"))
                    break;
                RandomAdversario.LapisAdversario(lapisAdversario);
                System.out.println("Qual será sua nova ação?");
            }
        } catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
    }

    public void ametistaXjasper(Scanner scanner, Ametistas ametista, Japers jasperAdversario){ 
        try{
            while(ametista.vida && jasperAdversario.vida){
                String Ui = scanner.nextLine();
                if(Ui.equals("1")){
                    jasperAdversario.sofrerDano(ametista.atacar());
                    System.out.println(ametista);
                    System.out.println(jasperAdversario);
                }else if(Ui.equals("2")){
                    jasperAdversario.sofrerDano(ametista.usarPoder());
                    System.out.println(ametista);
                    System.out.println(jasperAdversario);
                }else if(Ui.equals("3")){
                    ametista.recuperar();
                    System.out.println(ametista);
                }else if(Ui.equals("4")){
                    System.out.println("Com qual Gem deseja se fundir?");
                    String nomeOther = scanner.nextLine();
                    jasperAdversario.sofrerDano(ametista.fundir(nomeOther));
                    System.out.println(ametista);
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
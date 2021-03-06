package Code.Batalhas;

import java.util.Scanner;
import Code.*;

public class BatalhaRubi {
    public void rubiXperola(Scanner scanner, Rubis rubi, Perolas perolasAdversario){ //fazer fusão
        try{
            while(rubi.vida && perolasAdversario.vida){
                String Ui = scanner.nextLine();
                if(Ui.equals("1")){
                    perolasAdversario.sofrerDano(rubi.atacar());
                    System.out.println(rubi);
                    System.out.println(perolasAdversario);
                }else if(Ui.equals("2")){
                    perolasAdversario.sofrerDano(rubi.usarPoder());
                    System.out.println(rubi);
                    System.out.println(perolasAdversario);
                }else if(Ui.equals("3")){
                    rubi.recuperar();
                    System.out.println(rubi);
                }else if(Ui.equals("4")){
                    System.out.println("Com qual Gem deseja se fundir?");
                    String nomeOther = scanner.nextLine();
                    perolasAdversario.sofrerDano(rubi.fundir(nomeOther));;
                    System.out.println(rubi);
                }else if(Ui.equals("end"))
                    break;
                RandomAdversario.PerolaAdversario(perolasAdversario);
                System.out.println("Qual será sua nova ação?");
            }
        } catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
    }

    public void rubiXametista(Scanner scanner, Rubis rubi, Ametistas ametistaAdversario){ //fazer fusão
        try{
            while(rubi.vida && ametistaAdversario.vida){
                String Ui = scanner.nextLine();
                if(Ui.equals("1")){
                    ametistaAdversario.sofrerDano(rubi.atacar());
                    System.out.println(rubi);
                    System.out.println(ametistaAdversario);
                }else if(Ui.equals("2")){
                    ametistaAdversario.sofrerDano(rubi.usarPoder());
                    System.out.println(rubi);
                    System.out.println(ametistaAdversario);
                }else if(Ui.equals("3")){
                    rubi.recuperar();
                    System.out.println(rubi);
                }else if(Ui.equals("4")){
                    System.out.println("Com qual Gem deseja se fundir?");
                    String nomeOther = scanner.nextLine();
                    ametistaAdversario.sofrerDano(rubi.fundir(nomeOther));;
                    System.out.println(rubi);
                }else if(Ui.equals("end"))
                    break;
                RandomAdversario.AmetistaAdversario(ametistaAdversario);
                System.out.println("Qual será sua nova ação?");
            }
        } catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
    }

    public void rubiXrubi(Scanner scanner, Rubis rubis, Rubis rubiAdversario){ 
        try{
            while(rubis.vida && rubiAdversario.vida){
                String Ui = scanner.nextLine();
                if(Ui.equals("1")){
                    rubiAdversario.sofrerDano(rubis.atacar());
                    System.out.println(rubis);
                    System.out.println(rubiAdversario);
                }else if(Ui.equals("2")){
                    rubiAdversario.sofrerDano(rubis.usarPoder());
                    System.out.println(rubis);
                    System.out.println(rubiAdversario);
                }else if(Ui.equals("3")){
                    rubis.recuperar();
                    System.out.println(rubis);
                }else if(Ui.equals("4")){
                    System.out.println("Com qual Gem deseja se fundir?");
                    String nomeOther = scanner.nextLine();
                    rubiAdversario.sofrerDano(rubis.fundir(nomeOther));;
                    System.out.println(rubis);
                }else if(Ui.equals("end"))
                    break;
                RandomAdversario.RubiAdversario(rubiAdversario);
                System.out.println("Qual será sua nova ação?");
            }
        } catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
    }

    public void rubiXsafira(Scanner scanner, Rubis rubis, Safiras safiraAdversario){ 
        try{
            while(rubis.vida && safiraAdversario.vida){
                String Ui = scanner.nextLine();
                if(Ui.equals("1")){
                    safiraAdversario.sofrerDano(rubis.atacar());
                    System.out.println(rubis);
                    System.out.println(safiraAdversario);
                }else if(Ui.equals("2")){
                    safiraAdversario.sofrerDano(rubis.usarPoder());
                    System.out.println(rubis);
                    System.out.println(safiraAdversario);
                }else if(Ui.equals("3")){
                    rubis.recuperar();
                    System.out.println(rubis);
                }else if(Ui.equals("4")){
                    System.out.println("Com qual Gem deseja se fundir?");
                    String nomeOther = scanner.nextLine();
                    safiraAdversario.sofrerDano(rubis.fundir(nomeOther));;
                    System.out.println(rubis);
                }else if(Ui.equals("end"))
                    break;
                RandomAdversario.SafiraAdversario(safiraAdversario);
                System.out.println("Qual será sua nova ação?");
            }
        } catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
    }

    public void rubiXlapis(Scanner scanner, Rubis rubis, Lapis lapisAdversario){ 
        try{
            while(rubis.vida && lapisAdversario.vida){
                String Ui = scanner.nextLine();
                if(Ui.equals("1")){
                    lapisAdversario.sofrerDano(rubis.atacar());
                    System.out.println(rubis);
                    System.out.println(lapisAdversario);
                }else if(Ui.equals("2")){
                    lapisAdversario.sofrerDano(rubis.usarPoder());
                    System.out.println(rubis);
                    System.out.println(lapisAdversario);
                }else if(Ui.equals("3")){
                    rubis.recuperar();
                    System.out.println(rubis);
                }else if(Ui.equals("4")){
                    System.out.println("Com qual Gem deseja se fundir?");
                    String nomeOther = scanner.nextLine();
                    lapisAdversario.sofrerDano(rubis.fundir(nomeOther));;
                    System.out.println(rubis);
                }else if(Ui.equals("end"))
                    break;
                RandomAdversario.LapisAdversario(lapisAdversario);
                System.out.println("Qual será sua nova ação?");
            }
        } catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
    }

    public void rubiXjasper(Scanner scanner, Rubis rubis, Japers jasperAdversario){ 
        try{
            while(rubis.vida && jasperAdversario.vida){
                String Ui = scanner.nextLine();
                if(Ui.equals("1")){
                    jasperAdversario.sofrerDano(rubis.atacar());
                    System.out.println(rubis);
                    System.out.println(jasperAdversario);
                }else if(Ui.equals("2")){
                    jasperAdversario.sofrerDano(rubis.usarPoder());
                    System.out.println(rubis);
                    System.out.println(jasperAdversario);
                }else if(Ui.equals("3")){
                    rubis.recuperar();
                    System.out.println(rubis);
                }else if(Ui.equals("4")){
                    System.out.println("Com qual Gem deseja se fundir?");
                    String nomeOther = scanner.nextLine();
                    jasperAdversario.sofrerDano(rubis.fundir(nomeOther));;
                    System.out.println(rubis);
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
package Code;

import java.util.Scanner;

public class BatalhaAmetista {
    public void ametistaXperola(Scanner scanner, Ametistas ametista, Perolas perolasAdversario){ //fazer fusão
        try{
            while(ametista.vida && perolasAdversario.vida){
                String Ui = scanner.nextLine();
                if(Ui.equals("1")){
                    perolasAdversario.sofrerDano(ametista.atacar());
                    System.out.println("\n" + ametista + "\n");
                    System.out.println(perolasAdversario + "\n");
                }else if(Ui.equals("2")){
                    perolasAdversario.sofrerDano(ametista.usarPoder());
                    System.out.println("\n" + ametista + "\n");
                    System.out.println(perolasAdversario + "\n");
                }else if(Ui.equals("3")){
                    ametista.recuperar();
                    System.out.println("\n" + ametista + "\n");
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
                    System.out.println("\n" + ametista + "\n");
                    System.out.println(ametistaAdversario + "\n");
                }else if(Ui.equals("2")){
                    ametistaAdversario.sofrerDano(ametista.usarPoder());
                    System.out.println("\n" + ametista + "\n");
                    System.out.println(ametistaAdversario + "\n");
                }else if(Ui.equals("3")){
                    ametista.recuperar();
                    System.out.println("\n" + ametista + "\n");
                }else if(Ui.equals("end"))
                    break;
                RandomAdversario.AmetistaAdversario(ametistaAdversario);
                System.out.println("Qual será sua nova ação?");
            }
        } catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
    }

    public void ametistaXrubi(Scanner scanner, Ametistas ametistas, Rubis rubiaAdversario){ 
        try{
            while(ametistas.vida && rubiaAdversario.vida){
                String Ui = scanner.nextLine();
                if(Ui.equals("1")){
                    rubiaAdversario.sofrerDano(ametistas.atacar());
                    System.out.println("\n" + ametistas + "\n");
                    System.out.println(rubiaAdversario + "\n");
                }else if(Ui.equals("2")){
                    rubiaAdversario.sofrerDano(ametistas.usarPoder());
                    System.out.println("\n" + ametistas + "\n");
                    System.out.println(rubiaAdversario + "\n");
                }else if(Ui.equals("3")){
                    ametistas.recuperar();
                    System.out.println("\n" + ametistas + "\n");
                }else if(Ui.equals("end"))
                    break;
                RandomAdversario.RubiAdversario(rubiaAdversario);
                System.out.println("Qual será sua nova ação?");
            }
        } catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
    }

    public void ametistaXsafira(Scanner scanner, Ametistas ametistas, Safiras safiraAdversario){ 
        try{
            while(ametistas.vida && safiraAdversario.vida){
                String Ui = scanner.nextLine();
                if(Ui.equals("1")){
                    safiraAdversario.sofrerDano(ametistas.atacar());
                    System.out.println("\n" + ametistas + "\n");
                    System.out.println(safiraAdversario + "\n");
                }else if(Ui.equals("2")){
                    safiraAdversario.sofrerDano(ametistas.usarPoder());
                    System.out.println("\n" + ametistas + "\n");
                    System.out.println(safiraAdversario + "\n");
                }else if(Ui.equals("3")){
                    ametistas.recuperar();
                    System.out.println("\n" + ametistas + "\n");
                }else if(Ui.equals("end"))
                    break;
                RandomAdversario.SafiraAdversario(safiraAdversario);
                System.out.println("Qual será sua nova ação?");
            }
        } catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
    }

    public void ametistaXlapis(Scanner scanner, Ametistas ametistas, Lapis lapisAdversario){ 
        try{
            while(ametistas.vida && lapisAdversario.vida){
                String Ui = scanner.nextLine();
                if(Ui.equals("1")){
                    lapisAdversario.sofrerDano(ametistas.atacar());
                    System.out.println("\n" + ametistas + "\n");
                    System.out.println(lapisAdversario + "\n");
                }else if(Ui.equals("2")){
                    lapisAdversario.sofrerDano(ametistas.usarPoder());
                    System.out.println("\n" + ametistas + "\n");
                    System.out.println(lapisAdversario + "\n");
                }else if(Ui.equals("3")){
                    ametistas.recuperar();
                    System.out.println("\n" + ametistas + "\n");
                }else if(Ui.equals("end"))
                    break;
                RandomAdversario.LapisAdversario(lapisAdversario);
                System.out.println("Qual será sua nova ação?");
            }
        } catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
    }

    public void ametistaXjasper(Scanner scanner, Ametistas ametistas, Japers jasperAdversario){ 
        try{
            while(ametistas.vida && jasperAdversario.vida){
                String Ui = scanner.nextLine();
                if(Ui.equals("1")){
                    jasperAdversario.sofrerDano(ametistas.atacar());
                    System.out.println("\n" + ametistas + "\n");
                    System.out.println(jasperAdversario + "\n");
                }else if(Ui.equals("2")){
                    jasperAdversario.sofrerDano(ametistas.usarPoder());
                    System.out.println("\n" + ametistas + "\n");
                    System.out.println(jasperAdversario + "\n");
                }else if(Ui.equals("3")){
                    ametistas.recuperar();
                    System.out.println("\n" + ametistas + "\n");
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

//Fazer random
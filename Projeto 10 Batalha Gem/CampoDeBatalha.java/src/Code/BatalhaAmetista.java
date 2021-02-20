package Code;

import java.util.Scanner;

public class BatalhaAmetista {
    public void ametistaXperola(Scanner scanner, Ametistas ametista, Perolas perolaAdversario){ //fazer fusão
        try{
            while(ametista.vida && perolaAdversario.vida){
                String Ui = scanner.nextLine();
                if(Ui.equals("1")){
                    perolaAdversario.sofrerDano(ametista.atacar());
                    System.out.println("\n" + ametista + "\n");
                    System.out.println(perolaAdversario + "\n");
                }else if(Ui.equals("2")){
                    perolaAdversario.sofrerDano(ametista.usarPoder());
                    System.out.println("\n" + ametista + "\n");
                    System.out.println(perolaAdversario + "\n");
                }else if(Ui.equals("3")){
                    ametista.recuperar();
                    System.out.println("\n" + ametista + "\n");
                }else if(Ui.equals("end"))
                    break;
                System.out.println("Qual será sua nova ação?");
            }
        } catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
    }

    public void ametistaXametista(Scanner scanner, Ametistas ametista, Ametistas ametistaAdversario){ //fazer fusão
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

    public void perolaXrubi(Scanner scanner, Perolas perola, Rubis rubiaAdversario){ 
        try{
            while(perola.vida && rubiaAdversario.vida){
                String Ui = scanner.nextLine();
                if(Ui.equals("1")){
                    rubiaAdversario.sofrerDano(perola.atacar());
                    System.out.println("\n" + perola + "\n");
                    System.out.println(rubiaAdversario + "\n");
                }else if(Ui.equals("2")){
                    rubiaAdversario.sofrerDano(perola.usarPoder());
                    System.out.println("\n" + perola + "\n");
                    System.out.println(rubiaAdversario + "\n");
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
                System.out.println("Qual será sua nova ação?");
            }
        } catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
    }
}
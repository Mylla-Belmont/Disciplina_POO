package Code;

public class Batalha {
    
    public void perolaXperola(String Ui, Perolas perola, Perolas perolaAdversario){ //fazer fusão
        try{
            while(perola.vida && perolaAdversario.vida){
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
            }
        } catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
    }

    public void perolaXametista(String Ui, Perolas perola, Ametistas ametistaAdversario){ //fazer fusão
        try{
            while(perola.vida && ametistaAdversario.vida){
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
            }
        } catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
    }
}

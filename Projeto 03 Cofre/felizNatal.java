import java.util.Scanner;
import java.util.Random;

class Cachorro  {
    int barriga;
    int maxBarriga;

    Cachorro (int barriga, int maxBarriga){
        this.barriga = barriga;
        this.maxBarriga = maxBarriga;
    }

    void comer(){
        if(barriga <= maxBarriga){
            System.out.println("Já estou cheio!");
        }else
            System.out.println("Presentes! Delicius!!!");
    }

    boolean vomitar(){
        if(barriga != 0){
            System.out.println("O cachorro vomitou o presente");
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        
        Cachorro cachorro = new Cachorro(0, 0);

        System.out.println(cachorro);
    }
}

class Personagens  {
    int vida;
    int energia;
    
    Personagens(int vida, int energia){
        this.vida = vida;
        this.energia = energia;
    }

    void perderVida(){
        //vida -= golpe;
    }

    // int atacar(){
    //     if("rosa"){

    //     }if("azul"){

    //     }if("verde"){

    //     }

    //     return 0;
    // }

    public String toString() {
        return "Vida: " + vida + "/100";
    }

    public static void main(String[] args) {

        Personagens papaiNoel = new Personagens(0, 0);
        Personagens doidin = new Personagens(0, 0);

        System.out.println(papaiNoel);
        System.out.println(doidin);
    }
}

public class felizNatal {

    public static void main(String[] args) {

        Personagens papaiNoel = new Personagens(0, 0);
        Personagens doidin = new Personagens(0, 0);
        Cachorro cachorro = new Cachorro(0, 0)

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while(true){

            System.out.println("O que você vai fazer?");
            String line = scanner.nextLine();

            if(line.equals("end")){
                System.out.println("\nPAPAI NOEL: - Não me deixe aqui sozinho!");
                break;
            }else if(line.equals("show")){ 
                System.out.println("Papai Noel: " + papaiNoel);
            }else if(line.equals("presente")){
                
            }else if(line.equals("vomitar")){

            }
        }
        scanner.close();
    }
}
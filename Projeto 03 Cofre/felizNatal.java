import java.util.Scanner;
import java.util.Random;

class Presente  {
    String cor;

    Presente (String cor){
        this.cor = cor;
    }
}

class Cachorro  {       //Classe para caracterizar cachorro
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

class Personagens  {        //Classe para caracterizar personagens
    int vida;
    int energia;
    
    Personagens(int vida, int energia){
        this.vida = vida;
        this.energia = energia;
    }

    void perderVida(){
        //vida -= golpe;
    }

    void pegarPresente(String input){

        //Presente presente = new Presente(input);

        if(input.equals("rosa")){

        }
        if(input.equals("azul")){

        }
        if(input.equals("verde")){

        }
    }

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

public class felizNatal {       //Classe interativa

    public static void main(String[] args) {

        Personagens papaiNoel = new Personagens(0, 0);
        Personagens doidin = new Personagens(0, 0);
        //Cachorro cachorro = new Cachorro(0, 0);

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while(true){

            System.out.println("O que você vai fazer?");
            String line = scanner.nextLine();
            String[] input = line.split(" ");


            if(input[0].equals("end")){
                System.out.println("\nPAPAI NOEL: - Não me deixe aqui sozinho!");
                break;

            }else if(input[0].equals("show")){ 
                System.out.println("Papai Noel: " + papaiNoel);

            }else if(input[0].equals("presente")){

                if(random.nextBoolean()){
                    papaiNoel.pegarPresente(input[0]);
                    System.out.println("Papai noel pegou o presente!");
                }else{
                    doidin.pegarPresente(input[0]);
                    System.out.println("O doidin pegou o presente!");
                }

            }else if(line.equals("vomitar")){

            }
        }
        scanner.close();
    }
}
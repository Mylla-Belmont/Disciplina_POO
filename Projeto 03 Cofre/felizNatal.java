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
    boolean recursos;
    
    Personagens(int vida, int energia, boolean recursos){
        this.vida = vida;
        this.energia = energia;
        this.recursos = recursos;
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

    boolean recursos(){
        if(recursos == true){
            return true;
        }
        return false;
    }

    public String toString() {
        return "Vida: " + vida + "/100";
    }

    public static void main(String[] args) {

        Personagens papaiNoel = new Personagens(0, 0, false);
        Personagens grinch = new Personagens(0, 0, false);

        System.out.println(papaiNoel);
        System.out.println(grinch);
    }
}

public class felizNatal {       //Classe interativa

    public static void main(String[] args) {

        Personagens papaiNoel = new Personagens(0, 0, false);
        Personagens grinch = new Personagens(0, 0, false);
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

                if(!papaiNoel.recursos && random.nextBoolean()){    //Se não tiver recurso nenhum pode pegar presente
                    papaiNoel.pegarPresente(input[0]);
                    System.out.println("Papai noel pegou o presente!");
                }else if(!grinch.recursos){
                    grinch.pegarPresente(input[0]);
                    System.out.println("O grinch pegou o presente!");
                }else{
                    //fazer cachorro comer presente
                    System.out.println("Ninguém pegou o presente");
                }

            }else if(line.equals("vomitar")){

            }
        }
        scanner.close();
    }
}
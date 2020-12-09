import java.util.Scanner;
import java.util.Random;

class sacolaPresente  {       //Classe para caracterizar os presentes
    int resistenciaRosa;
    int resistenciaAzul;
    int resistenciaVerde;

    sacolaPresente (int resistenciaRosa, int resistenciaAzul, int resistenciaVerde){
        this.resistenciaRosa = resistenciaRosa;
        this.resistenciaAzul = resistenciaAzul;
        this.resistenciaVerde = resistenciaVerde;
    }

    void resistenciaPresentes(String input){    //Especificar qual presente
        if(input.equals("rosa") && resistenciaRosa != 0){

        }if(input.equals("azul") && resistenciaAzul != 0){

        }if(input.equals("verde") && resistenciaVerde != 0){

        }
    }

    public static void main(String[] args) {

        sacolaPresente presente = new sacolaPresente(0, 0, 0);
        System.out.println(presente);
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
    int poderRecursos;
    
    Personagens(int vida, int energia, boolean recursos, int poderRecursos){
        this.vida = vida;
        this.energia = energia;
        this.recursos = recursos;
        this.poderRecursos = poderRecursos;
    }

    // void perderVida(){
    //     //vida -= golpe;
    // }

    void brigar(Personagens other){
        if(this.poderRecursos > other.poderRecursos){
            //other.vida -= *****;
        }
        if(other.poderRecursos > this.poderRecursos){
            //this.vida -= *****;
        }

    }

    void pegarPresente(String input){

        if(input.equals("rosa")){
            //chamar metodo de outra classe
            System.out.println("Você jogou um presente rosa");
        }
        if(input.equals("azul")){
            System.out.println("Você jogou um presente azul");
        }
        if(input.equals("verde")){
            System.out.println("Você jogou um presente verde");
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

        Personagens papaiNoel = new Personagens(0, 0, false, 0);
        Personagens grinch = new Personagens(0, 0, false, 0);
        sacolaPresente presente = new sacolaPresente(0, 0, 0);
                
        System.out.println(papaiNoel);
        System.out.println(grinch);
        System.out.println(presente);
    }
}

public class felizNatal {       //Classe interativa

    public static void main(String[] args) {

        Personagens papaiNoel = new Personagens(0, 0, false, 0);
        Personagens grinch = new Personagens(0, 0, false, 0);
        //Cachorro cachorro = new Cachorro(0, 0);

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while(true){

            System.out.println("\nO que você vai fazer?");
            String line = scanner.nextLine();
            String[] input = line.split(" ");


            if(input[0].equals("end")){
                System.out.println("\nPAPAI NOEL: - Não me deixe aqui sozinho!");
                break;

            }else if(input[0].equals("show")){ 
                System.out.println("Papai Noel: " + papaiNoel);

            }else if(input[0].equals("presente")){

                if(!papaiNoel.recursos && random.nextBoolean()){    //Se não tiver recurso nenhum pode pegar presente
                    papaiNoel.pegarPresente(input[1]);
                    System.out.println("Papai noel pegou o presente!");
                    
                }else if(!grinch.recursos){
                    grinch.pegarPresente(input[1]);
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
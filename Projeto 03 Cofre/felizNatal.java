import java.util.Scanner;
import java.util.Random;

class sacolaPresente  {       //Classe para caracterizar os presentes
    int resistencia;
    String nomePresente;

    sacolaPresente (int resistencia, String nomePresente){   
        this.resistencia = resistencia;
        this.nomePresente = nomePresente;
    }

    void pacotePresente(String input, Random random){    //Especificar qual presente

        if(input.equals("rosa")){

            int objeto = random.nextInt(4);         //Usar array

            if(objeto == 0){        //Adicionar resistencia depois
                nomePresente = "palito de dente";
            }
            if(objeto == 1){
                nomePresente = "Iphone 2 pro max";
            }
            if(objeto == 2){
                nomePresente = "fonde de ouvido";
            }
            if(objeto == 3){
                nomePresente = "1k de arroz";
            }
        }

        if(input.equals("azul")){  
            
        }if(input.equals("verde")){ 
            
        }
    }

    public static void main(String[] args) {

        sacolaPresente presente = new sacolaPresente(0, "");
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
    boolean recurso;
    int poderrecurso;
    
    Personagens(int vida, int energia, Boolean recurso, int poderrecurso){
        this.vida = vida;
        this.energia = energia;
        this.recurso = recurso;
        this.poderrecurso = poderrecurso;
    }

    void brigar(Personagens other){     //FALTA adicionar entrada de parametros na main
        if(this.poderrecurso > other.poderrecurso){
            //other.vida -= *****;
        }
        if(other.poderrecurso > this.poderrecurso){
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

    boolean recurso(){
        if(recurso){
            // recurso = 
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
        sacolaPresente presente = new sacolaPresente(0, "");

        

        System.out.println(papaiNoel);
        System.out.println(grinch);
        System.out.println(presente);
    }
}

public class felizNatal {       //Classe interativa

    public static void main(String[] args) {

        Personagens papaiNoel = new Personagens(0, 0, false, 0);
        Personagens grinch = new Personagens(0, 0, false, 0);
        sacolaPresente presente = new sacolaPresente(0, "");
        
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

                presente.pacotePresente(input[1], random);

                if(!papaiNoel.recurso && random.nextBoolean()){    //Se não tiver recurso nenhum pode pegar presente
                    papaiNoel.pegarPresente(input[1]);
                    System.out.println("Papai noel pegou um " + presente.nomePresente);
                    
                }else if(!grinch.recurso){
                    grinch.pegarPresente(input[1]);
                    System.out.println("O grinch pegou um " + presente.nomePresente);

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
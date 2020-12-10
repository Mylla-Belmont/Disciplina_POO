import java.util.Scanner;
import java.util.Random;

class sacolaPresente  {       //Classe para caracterizar os presentes
    String nomePresente;

    sacolaPresente (String nomePresente){   
        this.nomePresente = nomePresente;
    }

    int pacotePresente(String input, Random random){    //Especificar qual presente

        int objeto = random.nextInt(4);         //Usar array

        if(input.equals("rosa")){
            if(objeto == 0){        //Adicionar resistencia depois
                nomePresente = "palito de dente";
                return 0;
            }
            if(objeto == 1){
                nomePresente = "Iphone 12 pro max";
                return 1;
            }
            if(objeto == 2){
                nomePresente = "fone de ouvido";
                return 2;
            }
            if(objeto == 3){
                nomePresente = "1k de arroz";
                return 3;
            }
        }
       
        if(input.equals("verde")){ 
            if(objeto == 0){        //Adicionar resistencia depois
                nomePresente = "poster do Felipe Neto";
                return 0;
            }
            if(objeto == 1){
                nomePresente = "estojo de maquiagem";
                return 1;
            }
            if(objeto == 2){
                nomePresente = "frigobar da polishop";
                return 2;
            }
            if(objeto == 3){
                nomePresente = "Play Station 5";
                return 3;
            }
        }
        return 0;
    }

    public static void main(String[] args) {

        sacolaPresente presente = new sacolaPresente("");
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
    boolean recurso;
    int poderRecurso;
    
    Personagens(int vida, int energia, Boolean recurso, int poderRecurso){
        this.vida = vida;
        this.recurso = recurso;
        this.poderRecurso = poderRecurso;
    }

    void brigar(Personagens other){     //FALTA adicionar entrada de parametros na main
        if(this.poderRecurso > other.poderRecurso){
            other.vida -= this.poderRecurso;
            this.recurso = false;
        }
        if(other.poderRecurso > this.poderRecurso){
            this.vida -= other.poderRecurso;
            other.recurso = false;
        }
    }

    public String toString() {
        return "Vida: " + vida + "/100";
    }

    public static void main(String[] args) {

        Personagens papaiNoel = new Personagens(100, 0, false, 0);
        Personagens grinch = new Personagens(100, 0, false, 0);
        sacolaPresente presente = new sacolaPresente("");

        System.out.println(papaiNoel);
        System.out.println(grinch);
        System.out.println(presente);
    }
}

public class felizNatal {       //Classe interativa

    public static void main(String[] args) {

        Personagens papaiNoel = new Personagens(100, 0, false, 0);
        Personagens grinch = new Personagens(100, 0, false, 0);
        sacolaPresente presente = new sacolaPresente("");
        
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

                System.out.println("\nVocê jogou um presente " + input[1]);
                System.out.println("\n");
                
                if(!papaiNoel.recurso && random.nextBoolean()){    //Se não tiver recurso nenhum pode pegar presente
                    papaiNoel.recurso = true;
                    papaiNoel.poderRecurso = presente.pacotePresente(input[1], random);
                    papaiNoel.brigar(grinch);
                    System.out.println("Papai noel pegou um " + presente.nomePresente);
                    
                }else if(!grinch.recurso){
                    grinch.recurso = true;
                    grinch.poderRecurso = presente.pacotePresente(input[1], random);
                    grinch.brigar(papaiNoel);
                    System.out.println("Grinch pegou um " + presente.nomePresente);

                }else{
                    //fazer cachorro comer presente
                    System.out.println("Ninguém pegou o presente");
                }

            }else if(line.equals("vomitar")){

            }

            System.out.println("Papai Noel:" + papaiNoel);
            System.out.println("Grinch: " + grinch);
        }
        scanner.close();
    }
}
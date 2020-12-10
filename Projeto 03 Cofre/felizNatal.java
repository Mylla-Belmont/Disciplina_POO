import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

class sacolaPresente  {       //Classe para caracterizar os presentes
    String nomePresente;
    int poderPresente;
    int qtdPresentes;
    int maxPresentes;
    int resistencia;

    sacolaPresente (String nomePresente, int poderPresente, int qtdPresentes, int maxPresentes, int resistencia){   
        this.nomePresente = nomePresente;
        this.poderPresente = poderPresente;
        this.qtdPresentes = qtdPresentes;
        this.maxPresentes = maxPresentes;
        this.resistencia = resistencia;
    }

    void abrirPresente(int tipoPresente){    //Recebe como parametro um aleatorio para escolher um dos presentes

        ArrayList<String> conteudoPresente = new ArrayList<String>();

        conteudoPresente.add("palito de dente");
        conteudoPresente.add("poster do Felipe Neto");
        conteudoPresente.add("estojo de maquiagem");
        conteudoPresente.add("fone de ouvido");
        conteudoPresente.add("Iphone 12 pro max");
        conteudoPresente.add("1k de arroz");
        conteudoPresente.add("Play Station 5");
        conteudoPresente.add("frigobar da polishop");

        nomePresente = conteudoPresente.get(tipoPresente);
        resistencia = tipoPresente;
        poderPresente = tipoPresente;
    }

    boolean diminuirResistencia(){

        if(resistencia > 0){
            resistencia -= 1;
            return true;
        }
        return false;
    }

    public String toString() {
        return nomePresente + ": " + qtdPresentes;
    }

    public static void main(String[] args) {

        sacolaPresente presente = new sacolaPresente("", 0, 0, 28, 0);
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
    int levarDano;
    
    Personagens(int vida, int energia, Boolean recurso, int poderRecurso, int levarDano){
        this.vida = vida;
        this.recurso = recurso;
        this.poderRecurso = poderRecurso;
        this.levarDano = levarDano;
    }

    void brigar(Personagens other){     //FALTA adicionar entrada de parametros na main
        if(this.poderRecurso > other.poderRecurso){
            other.vida -= this.poderRecurso;
            other.levarDano += this.poderRecurso; 
        }
        if(other.poderRecurso > this.poderRecurso){
            this.vida -= other.poderRecurso;
            this.levarDano += poderRecurso; 
        }
    }

    public String toString() {
        return "Vida: " + vida + "/100";
    }

    public static void main(String[] args) {

        Personagens papaiNoel = new Personagens(100, 0, false, 0, 0);
        Personagens grinch = new Personagens(100, 0, false, 0, 0);
        sacolaPresente presente = new sacolaPresente("", 0, 0, 28, 0);

        System.out.println(papaiNoel);
        System.out.println(grinch);
        System.out.println(presente);
    }
}

public class felizNatal {       //Classe interativa

    public static void main(String[] args) {

        Personagens papaiNoel = new Personagens(100, 0, false, 0, 0);
        Personagens grinch = new Personagens(100, 0, false, 0, 0);
        sacolaPresente presente = new sacolaPresente("", 0, 0, 28, 0);
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        while(true){

            System.out.println("\nO que você vai fazer?");
            String line = scanner.nextLine();
            String[] input = line.split(" ");

            if(input[0].equals("end")){
                System.out.println("\nPAPAI NOEL: - Não me deixe aqui sozinho!");
                break;

            }else if(input[0].equals("presentes")){ 
                System.out.println("Papai Noel: " + papaiNoel);

            }else if(input[0].equals("jogar")){

                System.out.println("\nVocê jogou um presente.");
                System.out.println("\n");

                int tipoPresente = random.nextInt(7);
                presente.abrirPresente(tipoPresente);                   //Chama o metodo abrirPresente da classe sacolaPresente para sortear o conteudo do presente
                
                if(!papaiNoel.recurso && random.nextBoolean()){         //Se não tiver recurso nenhum pode pegar presente
                    papaiNoel.recurso = true;                           //Modifica atributo recurso para True, já que o personagem pegou o presente
                    papaiNoel.poderRecurso = presente.poderPresente;    //Atributo poderRecurso recebe valor do atributo proderPresente da classe sacolaPresente
                    System.out.println("Papai noel pegou um " + presente.nomePresente);

                        do{
                            papaiNoel.brigar(grinch);                           //Chama o metodo brigar~
                        }while(presente.diminuirResistencia());

                    System.out.println("Papai noel atacou " + tipoPresente + " vezes");
                    System.out.println("Grinch sofreu " + grinch.levarDano + " de dano");
                    papaiNoel.recurso = false;
                    
                }else if(!grinch.recurso){                         
                    grinch.recurso = true;                         
                    grinch.poderRecurso = presente.poderPresente;
                    System.out.println("Grinch pegou um " + presente.nomePresente);

                        do{
                            grinch.brigar(papaiNoel);
                        }while(presente.diminuirResistencia());

                    System.out.println("Grinch atacou " + tipoPresente + " vezes");
                    System.out.println("Papai Noel sofreu " + papaiNoel.levarDano + " de dano");
                    grinch.recurso = false;

                }else{
                    //fazer cachorro comer presente
                    System.out.println("Ninguém pegou o presente");
                }

            }else if(line.equals("vomitar")){

            }else
                System.out.println("Fail: Comano inválido");

            System.out.println("\nPapai Noel:" + papaiNoel);
            System.out.println("Grinch: " + grinch);
        }
        scanner.close();
    }
}


//Resolver poderPresente dos presentes
//Melhorar metodo personagem
//Melhorar classe presente (adicionar mais atributos - poderPresente objetos para que eles se quebrem)
//Fazer classe cachorro
//Resolver lógica de dano e ataque
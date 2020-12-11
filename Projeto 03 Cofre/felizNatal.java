import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.io.IOException;

class sacolaPresente  {       //Classe para caracterizar os presentes
    String nomePresente;
    int poderPresente;
    int resistencia;
    int qtdPresentes;

    sacolaPresente (String nomePresente, int poderPresente, int resistencia, int qtdPresentes){   
        this.nomePresente = nomePresente;
        this.poderPresente = poderPresente;
        this.resistencia = resistencia;
        this.qtdPresentes = qtdPresentes;
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

    boolean tirarPresente(){
        if(qtdPresentes > 0){
            qtdPresentes -= 1;
            return true;
        }
        return false;
    }

    public String toString(){
        return "Quantidade de presentes: " + qtdPresentes; 
    }

    public static void main(String[] args) {

        sacolaPresente presente = new sacolaPresente("", 0, 0, 15);
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

    boolean comerPresente(){
        if(barriga <= maxBarriga){
            System.out.println("O cachorro comeu o presente");
            barriga += 1;
            return true;
        }
        System.out.println("O cachorro chegou ao seu limite");
        return false;
    }

    // boolean vomitar(){
    //     if(barriga != 0){
    //         System.out.println("O cachorro vomitou o presente");
    //         return true;
    //     }
    //     return false;
    // }

    public static void main(String[] args) {
        
        Cachorro cachorro = new Cachorro(0, 5);

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
            other.levarDano = this.poderRecurso; 
        }
        if(other.poderRecurso > this.poderRecurso){
            this.vida -= other.poderRecurso;
            this.levarDano = poderRecurso; 
        }
    }

    boolean estaVivo(){
        if(vida > 0){
            return true;
        }
        return false;
    }

    public String toString() {
        return vida + "/100";
    }

    public static void main(String[] args) {

        Personagens papaiNoel = new Personagens(100, 0, false, 0, 0);
        Personagens grinch = new Personagens(100, 0, false, 0, 0);

        System.out.println(papaiNoel);
        System.out.println(grinch);
    }
}

public class felizNatal {       //Classe interativa

    static void batalha(Personagens papaiNoel, Personagens grinch, sacolaPresente presente,  int tipoPresente){

        if(papaiNoel.recurso && papaiNoel.poderRecurso > grinch.poderRecurso){
            papaiNoel.brigar(grinch);

            if(!presente.diminuirResistencia()){
                papaiNoel.recurso = false;
                System.out.println("Papai Noel não tem mais recuros! Jogue alguma coisa");
            }

        System.out.println("Papai noel atacou " + tipoPresente + " vezes");
        System.out.println("Grinch sofreu " + grinch.levarDano + " de dano");
                
        }else if(grinch.recurso && grinch.poderRecurso > papaiNoel.poderRecurso){
            grinch.brigar(papaiNoel);

            if(!presente.diminuirResistencia()){
                grinch.recurso = false;
                System.out.println("Grinch não tem mais recursos");
            }

        System.out.println("Grinch atacou " + tipoPresente + " vezes");
        System.out.println("Papai Noel sofreu " + papaiNoel.levarDano + " de dano");
        
        }else 
            System.out.println("Eles estão discutindo. Tente jogar alguma coisa");
    }


    public static void main(String[] args) throws IOException, InterruptedException {

        Personagens papaiNoel = new Personagens(100, 0, false, 0, 0);
        Personagens grinch = new Personagens(100, 0, false, 0, 0);
        sacolaPresente presente = new sacolaPresente("", 0, 0, 15);
        //Cachorro cachorro = new Cachorro(0, 5);
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        while(papaiNoel.estaVivo() && grinch.estaVivo()){

            System.out.println("\nO que você vai fazer?");
            String line = scanner.nextLine();
            String[] input = line.split(" ");

            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");

            int tipoPresente = random.nextInt(7);
            presente.abrirPresente(tipoPresente);
            
            if(input[0].equals("end")){
                System.out.println("\nPAPAI NOEL: - Não me deixe aqui sozinho!");
                break;

            }else if(input[0].equals("brigar")){
                if(papaiNoel.recurso || grinch.recurso){
                    batalha(papaiNoel, grinch, presente, tipoPresente);
                }else   
                    System.out.println("Eles não possuem recursos! Jogue alguma coisa");

            }else if(input[0].equals("jogar")){
                System.out.println("\nVocê jogou um presente.");
                presente.qtdPresentes -= 1;
                
                if(presente.qtdPresentes > 0){
                    if(!papaiNoel.recurso && random.nextBoolean()){        
                        papaiNoel.recurso = true;                           
                        papaiNoel.poderRecurso = presente.poderPresente;    
                        System.out.println("Papai noel pegou um " + presente.nomePresente);
                    
                    }else if(!grinch.recurso){                         
                        grinch.recurso = true;                         
                        grinch.poderRecurso = presente.poderPresente;                    
                        System.out.println("Grinch pegou um " + presente.nomePresente);
                    
                    }else 
                        System.out.println("Eles ainda estão brigando");
                }else  
                    System.out.println("A sacola está vazia! Você não tem mais presentes pra jogar");

            }else
                System.out.println("Fail: Comano inválido");
            
            System.out.println("\nPapai Noel:" + papaiNoel);
            System.out.println("Grinch: " + grinch);
            System.out.println("\n" + presente);
        }
        if(papaiNoel.estaVivo() == true && grinch.estaVivo() == false){
            System.out.println("\nPapai Noel ganhou! Parabéns por ajudar!\n\n");
        }else if(grinch.estaVivo() == true && papaiNoel.estaVivo() == false){  
            System.out.println("Grinch ganhou! O natal não vai ser bom pra ninguém...\n\n");
        }else if(papaiNoel.estaVivo() == false && grinch.estaVivo() == false){
            System.out.println("Ningupem ganhou. Grinch fugiu e Papai Noel está muito cansado...\n\n");
        }
        scanner.close();
    }
}

//Fazer classe cachorro
//Adicionar quantidade de presentes
//Melhorar classe cachorro
//Melhorar metodo brigar
//Adicionar tirar presente
//Sempre que grinch não tiver recuros, cachorro vomita
//Faxer cachorro comer presentes que ninguém pega
//Fazer presentes serem queimados quando cachorro estiver cheio
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.io.IOException;

class sacolaPresente  {       //Classe para caracterizar os presentes
    int resistencia;
    int qtdPresentes;
    String nomePresente;

    sacolaPresente (int resistencia, int qtdPresentes, String nomePresente){   
        this.resistencia = resistencia;
        this.qtdPresentes = qtdPresentes;
        this.nomePresente = nomePresente;
    }

    void abrirPresente(int tipoPresente){    

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
        sacolaPresente presente = new sacolaPresente(0, 20, "");
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

    public static void main(String[] args) {      
        Cachorro cachorro = new Cachorro(0, 5);
        System.out.println(cachorro);
    }
}

class Personagens  {        //Classe para caracterizar personagens
    int vida;
    boolean recurso;
    String nomeRecurso;
    int poderRecurso;
    
    Personagens(int vida, int energia, Boolean recurso, String nomeRecurso, int poderRecurso){
        this.vida = vida;
        this.recurso = recurso;
        this.nomeRecurso = nomeRecurso;
        this.poderRecurso = poderRecurso;
    }

    int brigar(Personagens other){     
        if(this.poderRecurso > other.poderRecurso)
            other.vida -= this.poderRecurso;

        if(other.poderRecurso > this.poderRecurso)
            this.vida -= other.poderRecurso;

        return poderRecurso;
    }

    void pegarPresente(int valorPresente, String nomePresente){
        this.recurso = true;
        this.poderRecurso = valorPresente;
        this.nomeRecurso = nomePresente;
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

        Personagens papaiNoel = new Personagens(100, 0, false, "", 0);
        Personagens grinch = new Personagens(100, 0, false, "", 0);

        System.out.println(papaiNoel);
        System.out.println(grinch);
    }
}

public class felizNatal {       //Classe interativa

    static void batalha(Personagens papaiNoel, Personagens grinch, sacolaPresente presente,  int tipoPresente){

        if(papaiNoel.recurso && papaiNoel.poderRecurso > grinch.poderRecurso){
            int totalDano = papaiNoel.brigar(grinch);

            if(!presente.diminuirResistencia()){
                papaiNoel.recurso = false;
                System.out.println("Papai Noel não tem mais recuros! Jogue alguma coisa");
            }

        System.out.println("Papai noel atacou " + tipoPresente + " vezes com " + presente.nomePresente);
        System.out.println("Grinch sofreu " + totalDano + " de dano");
                
        }else if(grinch.recurso && grinch.poderRecurso > papaiNoel.poderRecurso){
            int totalDano = grinch.brigar(papaiNoel);

            if(!presente.diminuirResistencia()){
                grinch.recurso = false;
                System.out.println("Grinch não tem mais recursos");
            }

        System.out.println("Grinch atacou " + tipoPresente + " vezes com " + presente.nomePresente);
        System.out.println("Papai Noel sofreu " + totalDano + " de dano");
        
        }else 
            System.out.println("Eles estão discutindo. Tente jogar alguma coisa");
    }

    public static void main(String[] args) throws IOException, InterruptedException {

        Personagens papaiNoel = new Personagens(100, 0, false, "", 0);
        Personagens grinch = new Personagens(100, 0, false, "", 0);
        sacolaPresente presente = new sacolaPresente(0, 20, "");
        //Cachorro cachorro = new Cachorro(0, 5);
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        while(papaiNoel.estaVivo() && grinch.estaVivo()){

            System.out.println("\nO que você vai fazer?");
            String line = scanner.nextLine();
            String[] input = line.split(" ");

            if (System.getProperty("os.name").contains("Windows")) { new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); }
            else { Runtime.getRuntime().exec("clear"); }

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
                        papaiNoel.pegarPresente(tipoPresente, presente.nomePresente);      
                        System.out.println("Papai noel pegou um " + papaiNoel.nomeRecurso);
                    
                    }else if(!grinch.recurso){   
                        grinch.pegarPresente(tipoPresente, presente.nomePresente);                          
                        System.out.println("Grinch pegou um " + grinch.nomeRecurso);
                    
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
//Melhorar MUITA COISA DESSA MERDA!!!
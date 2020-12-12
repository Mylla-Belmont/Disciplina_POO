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

    void abrirPresente(int presenteSorteado){    

        ArrayList<String> conteudoPresente = new ArrayList<String>();

        conteudoPresente.add("palito de dente");
        conteudoPresente.add("poster do Felipe Neto");
        conteudoPresente.add("estojo de maquiagem");
        conteudoPresente.add("fone de ouvido");
        conteudoPresente.add("Iphone 12 pro max");
        conteudoPresente.add("1k de arroz");
        conteudoPresente.add("Play Station 5");
        conteudoPresente.add("frigobar da polishop");

        nomePresente = conteudoPresente.get(presenteSorteado);
        qtdPresentes -= 1;
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

    void brigar(Personagens other){     
        other.vida -= this.poderRecurso;
        this.vida -= other.poderRecurso;
    }

    void pegarPresente(int valorPresente, String nomePresente){
        this.recurso = true;
        this.poderRecurso = valorPresente;
        this.nomeRecurso = nomePresente;
    }

    boolean estaVivo(){
        if(vida > 0)
            return true;
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
    static void batalha(Personagens papaiNoel, Personagens grinch, sacolaPresente presente){

        int maisForte;
       
        if(papaiNoel.poderRecurso > grinch.poderRecurso){
            maisForte = papaiNoel.poderRecurso;
            papaiNoel.recurso = false;
            System.out.println("Papai Noel atacou com um " + papaiNoel.nomeRecurso);
            System.out.println("Grinch sofreu " + papaiNoel.poderRecurso + " de dano");
            System.out.println("O " + papaiNoel.nomeRecurso + " do papai Noel quebrou");

        }else{
            maisForte = grinch.poderRecurso;
            grinch.recurso = false;
            System.out.println("Papai Noel atacou com um " + papaiNoel.nomeRecurso);
            System.out.println("Papai Noel sofreu " + grinch.poderRecurso + " de dano");
        }

        for(int i = maisForte; i != 0; i--){
            papaiNoel.brigar(grinch);
            grinch.brigar(papaiNoel);
        }
    }



    public static void main(String[] args) throws IOException, InterruptedException {

        Personagens papaiNoel = new Personagens(100, 0, false, "", 0);
        Personagens grinch = new Personagens(100, 0, false, "", 0);
        sacolaPresente presente = new sacolaPresente(0, 20, "");
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        do{
            System.out.println("\n1 - Assitir a briga");
            System.out.println("2 - Jogar presente na arena");
            System.out.println("3 - Fazer cachorro comer presente");
            System.out.println("4 - Fazer chacorro vomitar presente");
            System.out.println("5 - Fim da luta");

            System.out.println("\nO que você vai fazer?");
            int line = scanner.nextInt();
            
            if (System.getProperty("os.name").contains("Windows")) { new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); }
            else { Runtime.getRuntime().exec("clear"); }

            int presenteSorteado = random.nextInt(7);
            presente.abrirPresente(presenteSorteado);

            if(line == 1){
                if(papaiNoel.recurso){
                    if(!grinch.recurso && presente.qtdPresentes > 0){
                        grinch.pegarPresente(presenteSorteado, presente.nomePresente);                          
                        System.out.println("Grinch roubou um " + grinch.nomeRecurso);
                    }
                    batalha(papaiNoel, grinch, presente);
                }else   
                    System.out.println("\nEles não possuem recursos! Jogue alguma coisa");
            }else
                
            if(line == 2){
                System.out.println("\nVocê jogou um presente");
                if(presente.qtdPresentes > 0){
                    if(!papaiNoel.recurso){
                        papaiNoel.pegarPresente(presenteSorteado, presente.nomePresente);      
                        System.out.println("Papai noel pegou um " + papaiNoel.nomeRecurso);
                    }else 
                        System.out.println("Papai Noel já pegou um presente");
                }else  
                    System.out.println("A sacola está vazia! Talvez o cachorro tenha alguma coisa");       

            }else

            if(line == 5){
                System.out.println("\nVocê deixou o Papai Noel sozinho na arena"); break;
            
            }else
                System.out.println("Fail: Comano inválido");
            
            System.out.println("\nPapai Noel:" + papaiNoel);
            System.out.println("Grinch: " + grinch);
            System.out.println("\n" + presente);
        
        }while(papaiNoel.estaVivo() && grinch.estaVivo());
        
        if(papaiNoel.estaVivo() && grinch.estaVivo()){
            System.out.println("\nPapai Noel ganhou! Parabéns por ajudar!\n\n");
        }else 
        
        if(grinch.estaVivo() && papaiNoel.estaVivo()){  
            System.out.println("Grinch ganhou! O natal não vai ser bom pra ninguém...\n\n");
        }else 
        
        if(papaiNoel.estaVivo() && grinch.estaVivo()){
            System.out.println("Ningupem ganhou. Grinch fugiu e Papai Noel está muito cansado...\n\n");
        }
        scanner.close();
    }
}


//MELHORAR RELAÇÃO ENTRE BRIGAR E JOGAR
//Fazer classe cachorro
//Adicionar quantidade de presentes
//Melhorar classe cachorro
//Melhorar metodo brigar
//Adicionar tirar presente
//Sempre que grinch não tiver recuros, cachorro vomita
//Faxer cachorro comer presentes que ninguém pega
//Fazer presentes serem queimados quando cachorro estiver cheio
//Melhorar MUITA COISA DESSA MERDA!!!
//Se grinch pegar um presente, fazer jogar outra vez
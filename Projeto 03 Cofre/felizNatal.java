import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.io.IOException;

class sacolaPresente  {       //Classe para caracterizar os presentes
    int resistencia;
    int qtdPresentes;
    String nomePresenteSorteado;

    sacolaPresente (int resistencia, int qtdPresentes, String nomePresenteSorteado){   
        this.resistencia = resistencia;
        this.qtdPresentes = qtdPresentes;
        this.nomePresenteSorteado = nomePresenteSorteado;
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

        nomePresenteSorteado = conteudoPresente.get(presenteSorteado);
    }

    void tirarPresenteSacola(){
            qtdPresentes -= 1;
    }

    boolean sacolaPresenteCheio(){      //Verifica se a sacola de presentes não está vazia
        if(qtdPresentes > 0){
            return true;
        }
        System.out.println("Não há mais presentes na sacola");
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

//____________________________________________________________________

class Cachorro  {       //Classe para caracterizar cachorro
    int barriga;
    int maxBarriga;

    Cachorro (int barriga, int maxBarriga){
        this.barriga = barriga;
        this.maxBarriga = maxBarriga;
    }

    void comerPresente(){
        if(barriga <= maxBarriga){
            barriga += 1;
            System.out.println("o cachorro comeu o o que você jogou");
        }else
            System.out.println("o presente queimou na laleira");
    }

    public static void main(String[] args) {      

        Cachorro cachorro = new Cachorro(0, 5);
        System.out.println(cachorro);
    }
}

//____________________________________________________________________

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

    void pegarPresente(int poderPresente, String nomePresenteSorteado){
        this.recurso = true;
        this.poderRecurso = poderPresente;
        this.nomeRecurso = nomePresenteSorteado;
    }

    boolean estaVivo(){     //Verifica se o personagem está vivo
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

//____________________________________________________________________

public class felizNatal {       //Classe interativa

    static void batalha(Personagens papaiNoel, Personagens grinch){

        int maisForte;
       
        if(papaiNoel.poderRecurso > grinch.poderRecurso){   //Verifica quem possui o recurso mais forte
            maisForte = papaiNoel.poderRecurso;
            papaiNoel.recurso = false;                      //Faz com que o recurso "quebre" apos atacar
            System.out.println("Papai Noel atacou com um " + papaiNoel.nomeRecurso);
            System.out.println("Grinch sofreu " + papaiNoel.poderRecurso + " de dano");
            System.out.println("O " + papaiNoel.nomeRecurso + " do papai Noel não tem mais efeito");
            System.out.println("Jogue alguma coisa!");

        }else{
            maisForte = grinch.poderRecurso;
            grinch.recurso = false;
            System.out.println("Grinch atacou com um " + papaiNoel.nomeRecurso);
            System.out.println("Papai Noel sofreu " + grinch.poderRecurso + " de dano");
        }

        for(int i = maisForte; i != 0; i--){
            papaiNoel.brigar(grinch);
            grinch.brigar(papaiNoel);
        }
    }

//____________________________________________________________________

    public static void main(String[] args) throws IOException, InterruptedException {

        Personagens papaiNoel = new Personagens(100, 0, false, "", 0);
        Personagens grinch = new Personagens(100, 0, false, "", 0);
        sacolaPresente presente = new sacolaPresente(0, 20, "");
        Cachorro cachorro = new Cachorro(0, 5);
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        do{
            System.out.println("\n1 - Assitir a briga");
            System.out.println("2 - Jogar presente na arena");
            System.out.println("3 - Fazer chacorro vomitar presente");
            System.out.println("4 - Fim da luta");

            System.out.println("\nO que você vai fazer?");
            int line = scanner.nextInt();
            
            if (System.getProperty("os.name").contains("Windows")) { new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); }
            else { Runtime.getRuntime().exec("clear"); }

            int presenteSorteado = random.nextInt(7);
            presente.abrirPresente(presenteSorteado);

            if(line == 1){                                                  //Assitir a briga
                if(presente.sacolaPresenteCheio()){
                    presente.tirarPresenteSacola();
                    grinch.pegarPresente(presenteSorteado, presente.nomePresenteSorteado);                          
                    System.out.println("Grinch roubou um " + grinch.nomeRecurso);
                }
                if(papaiNoel.recurso){
                    batalha(papaiNoel, grinch);
                }else   
                    System.out.println("\nPapai Noel está de mãos vazias! Jogue alguma coisa");
            }else
                
            if(line == 2){                                                  //Jogar presente na arena
                System.out.println("\nVocê jogou um presente");
                presente.tirarPresenteSacola();

                if(!papaiNoel.recurso && presente.sacolaPresenteCheio()){
                    papaiNoel.pegarPresente(presenteSorteado, presente.nomePresenteSorteado);      
                    System.out.println("Papai noel pegou um " + papaiNoel.nomeRecurso);
                }else{ 
                    System.out.println("Papai Noel já pegou um presente, então");
                    cachorro.comerPresente();
                }     
            }else

            if(line == 5){
                System.out.println("\nVocê deixou o Papai Noel sozinho na arena"); break;
            
            }else
                System.out.println("Fail: Comano inválido");
            
            System.out.println("\nPapai Noel: " + papaiNoel);
            System.out.println("Grinch: " + grinch);
            System.out.println("\n" + presente);
        
        }while(papaiNoel.estaVivo() && grinch.estaVivo());
        
        if(papaiNoel.estaVivo() && !grinch.estaVivo()){
            System.out.println("\nPapai Noel ganhou! Parabéns por ajudar!\n\n");
        }else   
            if(grinch.estaVivo() && !papaiNoel.estaVivo()){  
                System.out.println("Grinch ganhou! O natal não vai ser bom pra ninguém...\n\n");
            }else 
                if(!papaiNoel.estaVivo() && !grinch.estaVivo()){
                    System.out.println("Ningupem ganhou. Grinch fugiu e Papai Noel está muito cansado...\n\n");
        }
        scanner.close();
    }
}


//Melhorar classe cachorro
//Fazer cachorro vomitar
//Fazer metodo para quando a sacola de presentes estiver vazia
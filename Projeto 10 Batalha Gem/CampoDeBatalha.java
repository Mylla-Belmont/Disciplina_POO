import java.util.Scanner;
import java.util.ArrayList;

abstract class Gem{
    abstract int atacar();
    abstract void sofrerDano(int dano);
    abstract void fundir(String nomeFusão);
    abstract void usarPoder();
    abstract void perderEnergia();
    abstract void recuperarEnergia();    //Volta para dentro da Gem para recuperar energia
    abstract void morrer();
}

interface CristalGem{

}

class Fusões{   // extends Gem
    String nome;
    int durabilidade;
    int poderFusão;

    Fusões(String nome){
        this.nome = nome;
    }

    public void tipoFusão(){
        if(nome.equals("Ganet")){
            durabilidade = 50;
            poderFusão = 40;
        }
    }
}

class Perolas extends Gem implements CristalGem{    //
    int poder;
    int energia;
    int minimoEnergia = 20;
    int msximoRecuperação = 2;
    int resistenciaArma;
    boolean vida = true;
    ArrayList<Fusões> fusão;

    Perolas(int poder, int energia, int resistenciaArma){
        this.poder = poder;
        this.energia = energia;
        this.resistenciaArma = resistenciaArma;
        this.fusão = new ArrayList<>();
    }

    public int atacar(){
        if(this.energia >= minimoEnergia)
            return 10;
        return 0;
    }

    public void sofrerDano(int dano){
        if(this.vida == true)
            if(this.energia - dano < 0)
                this.energia = 0;
            else 
                this.energia -= dano;
    }

    public void fundir(String nomeFusão){
        if(this.vida == true && this.energia >= 50)
            this.fusão.add(new Fusões(nomeFusão));
    }

    public void usarPoder(){

    }
    public void perderEnergia(){

    }
    public void recuperarEnergia(){

    }    
    public void morrer(){

    }
}

public class CampoDeBatalha{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("!!!!!!!!!!!!!");
        String input = scanner.nextLine();
        String[] Ui = input.split(" ");

        //while
        //if()


        scanner.close();
    }
}
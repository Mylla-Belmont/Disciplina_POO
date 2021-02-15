import java.util.Scanner;
import java.util.ArrayList;

class Fusões{

}

abstract class Gem{
    abstract void atacar();
    abstract void sofrerDano();
    abstract void fundir();
    abstract void usarPoder();
    abstract void perderEnergia();
    abstract void recuperarEnergia();    //Volta para dentro da Gem para recuperar energia
    abstract void morrer();
}

class Perolas extends Gem{
    int poder;
    int energia;
    int resistenciaArma;
    ArrayList<Fusões> fusão;

    Perolas(int poder, int energia, int resistenciaArma){
        this.poder = poder;
        this.energia = energia;
        this.resistenciaArma = resistenciaArma;
        this.fusão = new ArrayList<>();
    }

    public void atacar(){

    }
    public void sofrerDano(){

    }
    public void fundir(){

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

class Ametistas{

}

class Rubis{

}

class Safiras{

}

class Diamantes{

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
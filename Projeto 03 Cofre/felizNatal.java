import java.util.Scanner;
import java.util.Random;

class Cachorro  {
    int barriga;

    Cachorro (int barriga){
        this.barriga = barriga;
    }

    public static void main(String[] args) {
        
        Cachorro cachorro = new Cachorro(0);

        System.out.println(cachorro);
    }
}

class Personagens  {
    int vida;
    
    Personagens(int vida){
        this.vida = vida;
    }

    void perderVida(){
        //vida -= golpe;
    }

    int atacar(){

        return 0;
    }

    public static void main(String[] args) {

        Personagens papaiNoel = new Personagens(0);
        Personagens doidin = new Personagens(0);

        System.out.println(papaiNoel);
        System.out.println(doidin);
    }
}

public class felizNatal {

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    }
}
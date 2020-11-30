public class Naruto_ninja{
    int vida;
    int ataque;
    
    Naruto_ninja (int vida, int ataque){ 
        this.vida = vida;
        this.ataque = ataque;
    }


    public static void main(String[] args) {
        Naruto_ninja Naruto = new Naruto_ninja(100, 100);
        Naruto_ninja Sasuke = new Naruto_ninja(100, 100);

        System.out.println("SASUKEEE!!!");
        System.out.println("NARUTOOO!!!");

        Naruto.vida();
        Naruto.chakra();
        Naruto.ataque();
    }
}

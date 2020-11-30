import java.util.Scanner;
import java.util.Random;

public class Sapo_lutador{
    int vida;
    int ataque;
    
    Sapo_lutador(int vida, int ataque){ 
        this.vida = vida;
        this.ataque = ataque;
    }

    boolean vida(){
        if(vida <= 0)
            return false;
        return true;
    }

    void dano(int dano){
        vida -= dano;
        System.out.println("Ai minha cabeça!"); 
    } 

    int ataque(int ataque){
        
        if(ataque == 0){
            System.out.println("Toma isso!");
            ataque = 50;
        }   
        if(ataque == 1){
            System.out.println("Agora você não escapa!");
            ataque = 80;
        }
        return ataque;    
    }

    public String toString(){
        return "Vida: " + vida + "/150";
    }

    public static void main(String[] args){
        Sapo_lutador Kermit = new Sapo_lutador(150, 0);
        Sapo_lutador Caco = new Sapo_lutador(150, 0);
        
        Scanner input = new Scanner (System.in); 
        Random gerador = new Random();

            int ataque, dano, jogador = gerador.nextInt(1);
        
            if(jogador == 0){
                System.out.println("Caco, faça seu ataque:\n1 - Normal\n2 - Especial");
            }else
                System.out.println("Kermit, faça seu ataque:\n1 - Normal\n2 - Especial");
                ataque = input.nextInt();
        
            switch(jogador){
                case 0:
                    dano = Caco.ataque(ataque);
                    Kermit.dano(dano); break;
                case 1:
                    dano = Kermit.ataque(ataque);
                    Caco.dano(dano); break;
            }
       
            System.out.println(Kermit);
            System.out.println(Caco);
            System.out.println("\n");
      
        input.close();
    }
}
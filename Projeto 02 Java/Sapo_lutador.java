import java.util.Scanner;
import java.util.Random;

public class Sapo_lutador{
    int vida;
    int ataque;
    
    Sapo_lutador(int vida, int ataque){ 
        this.vida = vida;
        this.ataque = ataque;
    }

    void dano(int dano){
        if(vida > 0){
            vida -= dano;
            System.out.println("Ai minha cabeça!");
        }else 
            System.out.println("Pare com isso! Eu já morri..."); 
    } 

    int ataque(){
        Random gerador = new Random();
        int casoTeste =  gerador.nextInt(1);

        if(casoTeste == 0){
            System.out.println("Toma isso!");
            ataque = 50;
        }   
        if(casoTeste == 1){
            System.out.println("Agora você não escapa!");
            ataque = 80;
        }
        return ataque;    
    }

    public String toString(){
        return "Vida: " + vida + "/150" + " Ataque: " + ataque;
    }

    public static void main(String[] args){
        Sapo_lutador Kermit = new Sapo_lutador(150, 0);
        Sapo_lutador Saiyajin = new Sapo_lutador(150, 0);

        Scanner input = new Scanner (System.in);

        int jogada, dano;    
        System.out.println("Faça seu ataque:\n1 - Normal\n2 - Especial");
        jogada = input.nextInt();
        input.close();
      
        if(jogada == 1){
            dano = Kermit.ataque();
            Saiyajin.dano(dano);
        }else{
            dano = Kermit.ataque();
            Saiyajin.dano(dano);
        }
        System.out.println(Kermit);
        System.out.println(Saiyajin);
    }
}
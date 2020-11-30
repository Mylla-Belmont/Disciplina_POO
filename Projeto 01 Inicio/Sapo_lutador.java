import java.util.Scanner;

public class Sapo_lutador{
    int vida;
    int forca;
    int teste;
    
    Sapo_lutador(int vida, int forca, int teste){ 
        this.vida = vida;
        this.forca = forca;
        this.teste = teste;
    }

    int jogada(){
        teste = 0;
        return teste;
    }

    void dano(){
        vida -= 10;
        System.out.println("Ai minha cabeça!");
    } 

    void ataque(){
        if(vida > 0){
            forca -= 10;
            System.out.println("Toma isso!");
            return;
        }    
    }

    void curar(){
        if(forca > 50){
            vida += 20;
            System.out.println("Sai de casa comi pra car*lho");
            return;
        }
    }

    void recuperarPoder(){
        if(vida > 50){
            forca += 20;
            System.out.println("Saiu da jaula o monstro!");
            return;
        }
    }

    public String toString() {
        return "Vida: " + vida + "/150" + " Força: " + forca + "/100" + " Teste:" + teste;
    }

    public static void main(String[] args){
        Sapo_lutador Kermit = new Sapo_lutador(150, 100, 0);
        
        int dano;
        Scanner input = new Scanner (System.in);

        System.out.println("Faça a jogada");
        dano = input.nextInt();
        input.close();
        
        for(int i=0; i < dano ; i++){
            Kermit.dano();
        }
            Kermit.ataque();
            Kermit.curar();
            Kermit.recuperarPoder();
            System.out.println(Kermit);
    }
}

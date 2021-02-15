package Code;

import java.util.ArrayList;

public class Perolas extends Guerreiras{    //
    int poder;
    int maxPoder;
    int energia;
    int minimoEnergia = 20;
    int msximoRecuperação = 2;
    int resistenciaArma;
    boolean vida = true;
    ArrayList<Fusões> fusão;

    Perolas(int poder, int energia, int resistenciaArma){
        this.poder = poder;
        this.maxPoder = poder;
        this.energia = energia;
        this.resistenciaArma = resistenciaArma;
        this.fusão = new ArrayList<>();
    }

    public int atacar(){
        if(energia >= minimoEnergia){
            poder -= 5;
            energia -= 5;
            resistenciaArma -= 5;
            return 10;
        }throw new RuntimeException("Perola está com a energia baixa!");
    }

    public void sofrerDano(int dano){
        if(energia - dano < 0){
            vida = false;
            energia = 0;
            throw new RuntimeException("Perola está morta!");
        }
        if(vida == true)
            energia -= dano;
    }

    public int usarPoder(){
        if(poder >= (maxPoder/2) && energia >= 20){
            poder -= 10;
            energia -= 10;
            return maxPoder;
        } throw new RuntimeException("Perola está fraca!");
    }

    public void recuperarEnergia(){
        if(vida == true || energia != 0){
            poder += 20;
            energia += 20;
            resistenciaArma += 20;
        }throw new RuntimeException("Perola está morta!");
    }    

    public void fundir(String Gems){
        if(vida == true && energia >= minimoEnergia){
            fusão.add(new Fusões("Perola", Gems));
        }throw new RuntimeException("Perola não pode fundir-se com" + Gems);
    }
}
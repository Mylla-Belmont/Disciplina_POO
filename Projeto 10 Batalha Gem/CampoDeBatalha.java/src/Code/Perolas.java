package Code;

import java.util.ArrayList;

public class Perolas extends Gems{    //
    int poder;
    int maxPoder;
    int energia;
    int minimoEnergia = 20;
    int maximoRecuperação = 2;
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

    int atacar(){
        if(energia >= minimoEnergia){
            poder -= 5;
            energia -= 5;
            resistenciaArma -= 5;
            return 10;
        }throw new RuntimeException("Perola está com a energia baixa!");
    }

    void sofrerDano(int dano){
        if(energia - dano < 0){
            vida = false;
            energia = 0;
            throw new RuntimeException("Perola foi destruida!");
        }
        energia -= dano;
    }

    int usarPoder(){
        if(poder >= (maxPoder/2) && energia >= 20){
            poder -= 10;
            energia -= 10;
            return maxPoder;
        } throw new RuntimeException("Perola está fraca!");
    }

    void recuperarEnergia(){
        if(vida == true && maximoRecuperação != 0){
            poder += 20;
            energia += 20;
            resistenciaArma += 20;
            maximoRecuperação -= 1;
        }throw new RuntimeException("Perola está morta!");
    }    

    void fundir(String nomeFusão){
        if(vida == true && energia >= minimoEnergia){
            fusão.add(new Fusões("Perola", nomeFusão));
        }throw new RuntimeException("Perola não pode fundir-se com" + nomeFusão);
    }
}
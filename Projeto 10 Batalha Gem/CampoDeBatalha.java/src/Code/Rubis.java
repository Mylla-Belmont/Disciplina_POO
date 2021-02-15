package Code;

import java.util.ArrayList;

public class Rubis extends Gems{
    int poder;
    int maxPoder;
    int energia;
    int minimoEnergia = 15;
    int maximoRecuperação = 2;
    int resistenciaArma;
    boolean vida = true;
    ArrayList<Fusões> fusão;

    Rubis(int poder, int energia, int resistenciaArma){
        this.poder = poder;
        this.maxPoder = poder;
        this.energia = energia;
        this.resistenciaArma = resistenciaArma;
        this.fusão = new ArrayList<>();
    }

    int atacar() {
        if(energia >= minimoEnergia){
            poder -= 5;
            energia -= 20;
            resistenciaArma -= 20;
            return 10;
        }throw new RuntimeException("Rubi está com a energia baixa!");
    }

    void sofrerDano(int dano) {
        if(energia - dano < 0){
            vida = false;
            energia = 0;
            throw new RuntimeException("Rubi foi destruida!");
        }
        energia -= dano;
    }

    int usarPoder() {
        if(poder >= (maxPoder/2) && energia >= 40){
            poder -= 30;
            energia -= 40;
            return maxPoder;
        } throw new RuntimeException("Rubi está fraca!");
    }

    void recuperarEnergia() {
        if(vida == true && maximoRecuperação != 0){
            poder += 30;
            energia += 20;
            resistenciaArma += 5;
            maximoRecuperação -= 1;
        }throw new RuntimeException("Rubi está morta!");

    }

    void fundir(String nomeFusão) {
        if(vida == true && energia >= minimoEnergia){
            fusão.add(new Fusões("Rubi", nomeFusão));
        }throw new RuntimeException("Rubi não pode fundir-se com" + nomeFusão);
    }   
}
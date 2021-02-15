package Code;

import java.util.ArrayList;

public class Ametistas extends Gems{
    int poder;
    int maxPoder;
    int energia;
    int minimoEnergia = 10;
    int maximoRecuperação = 2;
    int resistenciaArma;
    boolean vida = true;
    ArrayList<Fusões> fusão;

    Ametistas(int poder, int energia, int resistenciaArma){
        this.poder = poder;
        this.maxPoder = poder;
        this.energia = energia;
        this.resistenciaArma = resistenciaArma;
        this.fusão = new ArrayList<>();
    }

    int atacar() {
        if(energia >= minimoEnergia){
            poder -= 10;
            energia -= 10;
            resistenciaArma -= 10;
            return 5;
        }throw new RuntimeException("Amestista está com a energia baixa!");
    }

    void sofrerDano(int dano) {
        if(energia - dano < 0){
            vida = false;
            energia = 0;
            throw new RuntimeException("Amestista foi destruida!");
        }
        if(vida == true)
            energia -= dano;
    }

    int usarPoder() {
        if(poder >= (maxPoder/2) && energia >= 10){
            poder -= 20;
            energia -= 20;
            return maxPoder;
        } throw new RuntimeException("Ametista está fraca!");
    }

    void recuperarEnergia() {
        if(vida == true && maximoRecuperação != 0){
            poder += 20;
            energia += 5;
            resistenciaArma += 10;
            maximoRecuperação -= 1;
        }throw new RuntimeException("Ametista está morta!");

    }

    void fundir(String nomeFusão) {
        if(vida == true && energia >= minimoEnergia){
            fusão.add(new Fusões("Ametista", nomeFusão));
        }throw new RuntimeException("Ametista não pode fundir-se com" + nomeFusão);
    }   
}

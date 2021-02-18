package Code;

import java.util.ArrayList;

public class Safiras extends Gems implements CristalGems{
    int poder;
    int maxPoder;
    int energia;
    int minimoEnergia = 15;
    int maximoRecuperação = 2;
    boolean vida = true;
    ArrayList<Fusões> fusão;

    Safiras(int poder, int energia, int resistenciaArma){
        this.poder = poder;
        this.maxPoder = poder;
        this.energia = energia;
        this.fusão = new ArrayList<>();
    }

    int atacar() {
        if(energia >= minimoEnergia){
            poder -= 10;
            energia -= 5;
            return 10;
        }throw new RuntimeException("Safira está com a energia baixa!");
    }

    void sofrerDano(int dano) {
        if(energia - dano < 0){
            vida = false;
            energia = 0;
            throw new RuntimeException("Safira foi destruida!");
        }
        energia -= dano;
    }

    int usarPoder() {
        if(poder >= (maxPoder/2) && energia >= 40){
            poder -= 50;
            energia -= 60;
            return maxPoder;
        } throw new RuntimeException("Safira está fraca!");
    }

    void recuperarEnergia() {
        if(vida == true && maximoRecuperação != 0){
            poder += 20;
            energia += 10;
            maximoRecuperação -= 3;
        }throw new RuntimeException("Rubi está morta!");

    }

    public void fundir(String nomeFusão) {
        if(vida == true && energia >= minimoEnergia){
            fusão.add(new Fusões("Safira", nomeFusão));
        }throw new RuntimeException("Safira não pode fundir-se com" + nomeFusão);
    }   

    public String toString() {
        return poder + "/" + maxPoder + "\n" + energia;
    }
}

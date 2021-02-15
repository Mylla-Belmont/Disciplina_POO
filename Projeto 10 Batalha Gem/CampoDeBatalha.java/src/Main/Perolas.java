package Main;

import java.util.ArrayList;

public class Perolas extends Guerreiras{    //
    int poder;
    int energia;
    int minimoEnergia = 20;
    int msximoRecuperação = 2;
    int resistenciaArma;
    boolean vida = true;
    ArrayList<Fusões> fusão;

    Perolas(int poder, int energia, int resistenciaArma){
        this.poder = poder;
        this.energia = energia;
        this.resistenciaArma = resistenciaArma;
        this.fusão = new ArrayList<>();
    }

    public int atacar(){
        if(this.energia >= minimoEnergia)
            return 10;
        return 0;
    }

    public void sofrerDano(int dano){
        if(this.vida == true)
            if(this.energia - dano < 0)
                this.energia = 0;
            else 
                this.energia -= dano;
    }

    public void fundir(String Gems){
        if(this.vida == true && this.energia >= 50)
            this.fusão.add(new Fusões("Perola", Gems));
    }
}
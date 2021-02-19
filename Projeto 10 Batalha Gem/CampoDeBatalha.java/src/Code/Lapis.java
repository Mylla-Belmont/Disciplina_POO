package Code;

public class Lapis extends Gems{    //
    
    public Lapis(int poder, int energia, int minEnergia, int resistenciaArma, int maxRecuperacao){
        super(poder, energia, minEnergia, resistenciaArma, maxRecuperacao);
    }

    int atacar(){
        if(energia >= minEnergia){
            poder -= 5;
            energia -= 5;
            return 10;
        }throw new RuntimeException("Lápis Lazúli está com a energia baixa!");
    }

    void sofrerDano(int dano){
        if(energia - dano < 0){
            vida = false;
            energia = 0;
            throw new RuntimeException("Lápis Lazúli foi destruida!");
        }
        energia -= dano;
    }

    int usarPoder(){
        if(poder >= (maxPoder/2) && energia >= 20){
            poder -= 10;
            energia -= 5;
            return maxPoder;
        } throw new RuntimeException("Lápis Lazúli está fraca!");
    }

    void recuperarEnergia(){
        if(vida == true && maxRecuperacao != 0){
            poder += 30;
            energia += 20;
            maxRecuperacao -= 1;
        }throw new RuntimeException("Lápis Lazúli está morta!");
    }    

    public String toString() {
        return poder + "/" + maxPoder + "\n" + energia;
    }
}
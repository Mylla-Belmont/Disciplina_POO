package Code;

public class Lapis extends Gems{    //
    
    public Lapis(int poder, int energia, int minEnergia, int resistenciaArma, int maxRecuperacao){
        super(poder, energia, minEnergia, resistenciaArma, maxRecuperacao);
    }

    int atacar(){
        if(vida == true && energia >= minEnergia){
            poder -= 5;
            energia -= 5;
            return 20;
        }throw new RuntimeException("Lápis Lazúli está com a energia baixa!");
    }

    void sofrerDano(int dano){
        if(energia - dano < 0 && maxRecuperacao != 0){
            energia = 0;
            System.out.println("Lápis Lazúli foi destruida!");
        }else if(energia - dano < 0 && maxRecuperacao == 0){
            vida = false;
            energia = 0;
        }else{
            energia -= dano;
        } throw new RuntimeException("Lápis Lazúli foi morta!");
    }

    int usarPoder(){
        if(poder != 0 && energia >= minEnergia){
            poder -= 30;
            energia -= 10;
            System.out.println("Lápis Lazúli atacou usando sua hidrosinesi!");
            return poder;
        } throw new RuntimeException("Safira está fraca!");
    }


    void recuperar(){
        if(vida == true && maxRecuperacao != 0){
            poder += 30;
            energia += 10;
            maxRecuperacao -= 1;
        }throw new RuntimeException("Lápis Lazúli está morta!");
    }    

    public String toString() {
        return poder + "/" + maxPoder + "\n" + energia;
    }
}
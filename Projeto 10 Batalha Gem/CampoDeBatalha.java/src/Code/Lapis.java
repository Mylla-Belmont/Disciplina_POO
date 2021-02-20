package Code;

public class Lapis extends Gems{    //
    
    public Lapis(int poder, int energia, int minEnergia, int resistenciaArma, int maxRecuperacao){
        super(poder, energia, minEnergia, resistenciaArma, maxRecuperacao);
    }

    int atacar(){
        if(vida == true && energia >= minEnergia){
            poder -= 5;
            energia -= 5;
            System.out.println("Lápis Lazúli atacou!");
            return 20;
        }throw new RuntimeException("Lápis Lazúli está com a energia baixa!");
    }

    void sofrerDano(int dano){
        if(energia - dano <= 0 && maxRecuperacao != 0){
            energia = 0;
            System.out.println("Lápis Lazúli foi destruida!");
            return;
        }
        if(energia - dano <= 0 && maxRecuperacao == 0){
            vida = false;
            energia = 0;
            return;
        }
        if(vida == false)
            throw new RuntimeException("Lápis Lazúli foi morta!");
        energia -= dano;
        System.out.println("Lápis Lazúli sofreu dano!");
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
        if(vida == true && maxRecuperacao == 0)
            throw new RuntimeException("Lápis Lazúli não pode se recuperar!");
        
        if(poder + 30 > maxPoder){
            poder = maxPoder;
        }else if(poder != maxPoder)
            poder += 30;
        
        if(energia + 10 > maxEnergia){
            energia = maxPoder;
        }else if(energia != maxEnergia)
            energia += 10;
    
        maxRecuperacao -= 1;
    }      

    public String toString() {
        return "\n" + "Lápis:" + "\n" + "Poder: " + poder + "/" + maxPoder + "\n" + "Energia: " + energia + "/" + maxEnergia + "\n";
    }
}
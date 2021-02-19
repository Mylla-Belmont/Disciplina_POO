package Code;

public class Safiras extends Gems implements CristalGems{
    
    public Safiras(int poder, int energia, int minEnergia, int resistenciaArma, int maxRecuperacao){
        super(poder, energia, minEnergia, resistenciaArma, maxRecuperacao);
    }

    int atacar() {
        if(energia >= minEnergia){
            poder -= 10;
            energia -= 5;
            System.out.println("Safira está atacando usando sua própria força!");
            return 5;
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
        if(vida == true && maxRecuperacao != 0){
            poder += 20;
            energia += 10;
            maxRecuperacao -= 1;
        }throw new RuntimeException("Rubi está morta!");

    }

    public void fundir(String nomeFusão) {
        if(vida == true && energia >= minEnergia){
            fusão.add(new Fusões("Safira", nomeFusão));
        }throw new RuntimeException("Safira não pode fundir-se com" + nomeFusão);
    }   

    public String toString() {
        return poder + "/" + maxPoder + "\n" + energia;
    }
}

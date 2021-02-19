package Code;

public class Rubis extends Gems implements CristalGems{
    
    public Rubis(int poder, int energia, int minEnergia, int resistenciaArma, int maxRecuperacao){
        super(poder, energia, minEnergia, resistenciaArma, maxRecuperacao);
    }

    int atacar() {
        if(vida == true && energia >= minEnergia){
            energia -= 5;
            System.out.println("Rubi está atacando com sua força!");
            return 15;
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
        System.out.println("Rubi não possui poderes");
        return 0;
    }

    void recuperarEnergia() {
        if(vida == true && maxRecuperacao != 0){
            energia += 20;
            maxRecuperacao -= 1;
        }throw new RuntimeException("Rubi está morta!");

    }

    public void fundir(String nomeFusão) {
        if(vida == true && energia >= minEnergia){
            fusão.add(new Fusões("Rubi", nomeFusão));
        }throw new RuntimeException("Rubi não pode fundir-se com" + nomeFusão);
    }   

    public String toString() {
        return energia + "/" + maxEnergia;
    }
}
package Code;

public class Ametistas extends Gems implements CristalGems{
    
    public Ametistas(int poder, int energia, int minEnergia, int resistenciaArma, int maxRecuperacao){
        super(poder, energia, minEnergia, resistenciaArma, maxRecuperacao);
    }

    int atacar() {
        if(vida == true && energia >= minEnergia && resistenciaArma > 0){
            poder -= 10;
            energia -= 10;
            resistenciaArma -= 5;
            System.out.println("Ametista está atacando com seu chicote!");
            return 15;
        }

        if(vida == true && energia >= minEnergia){
            poder -= 10;
            energia -= 10;
            System.out.println("Ametista está atacando, mas seu chicote partiu ao meio!");
            return 10;
        }throw new RuntimeException("Amestista está com a energia baixa!");
    }

    void sofrerDano(int dano) {
        if(energia - dano < 0){
            vida = false;
            energia = 0;
            throw new RuntimeException("Amestista foi destruida!");
        }
        energia -= dano;
    }

    int usarPoder() {
        if(poder >= (maxPoder/2) && energia >= 10){
            poder -= 20;
            energia -= 20;
            System.out.println("Ametista fez um vortice com seu chicote!");
            return maxPoder;
        } throw new RuntimeException("Ametista está fraca!");
    }

    void recuperarEnergia() {
        if(vida == true && maxRecuperacao != 0){
            poder += 20;
            energia += 5;
            resistenciaArma += 10;
            maxRecuperacao -= 1;
        }throw new RuntimeException("Ametista está morta!");

    }

    public void fundir(String nomeFusão) {
        if(vida == true && energia >= minEnergia){
            fusão.add(new Fusões("Ametista", nomeFusão));
        }throw new RuntimeException("Ametista não pode fundir-se com" + nomeFusão);
    }   

    public String toString() {
        if(poder < 0)
            poder = 0;
        if(energia < 0)
            energia = 0;
        return poder + "/" + maxPoder + "\n" + energia + "/" + maxEnergia + "\n";
    }
}

package Code;

public class Rubis extends Gems implements CristalGems{
    public Rubis(int poder, int energia, int minEnergia, int resistenciaArma, int maxRecuperacao){
        super(poder, energia, minEnergia, resistenciaArma, maxRecuperacao);
    }

    public int atacar() {
        if(vida == true && energia >= minEnergia){
            energia -= 5;
            System.out.println("Rubi está atacando com sua força!");
            return 15;
        }throw new RuntimeException("Rubi está com a energia baixa!");
    }

    public void sofrerDano(int dano){
        if(energia - dano <= 0 && maxRecuperacao != 0){
            energia = 0;
            System.out.println("Rubi foi destruida!");
            return;
        }
        if(energia - dano > 0 && maxRecuperacao != 0){
            energia -= dano;
            System.out.println("Rubi sofreu dano!");
        }
        energia = 0;
        vida = false; 
        throw new RuntimeException("Rubi foi morta!");
    }

    public int usarPoder() {
        System.out.println("Rubi não possui poderes");
        return 0;
    }

    public void recuperar(){
        if(vida == true && maxRecuperacao == 0)
            throw new RuntimeException("Rubi não pode se recuperar!");
        
        if(energia + 30 > maxEnergia){
            energia = maxPoder;
        }else if(energia != maxEnergia)
            energia += 30;
        
        maxRecuperacao -= 1;
    }  

    public void fundir(String nomeFusão) {
        if(vida == true && energia >= minEnergia){
            fusão.add(new Fusões("Rubi", nomeFusão));
        }throw new RuntimeException("Rubi não pode fundir-se com" + nomeFusão);
    }   

    public String toString() {
        if(energia < 0)
            energia = 0;
        return "\n" + "Rubi:" + "\n" + "Energia: " + energia + "/" + maxEnergia;
    }
}
package Code;

public class Safiras extends Gems implements CristalGems{   
    public Safiras(int poder, int energia, int minEnergia, int resistenciaArma, int maxRecuperacao){
        super(poder, energia, minEnergia, resistenciaArma, maxRecuperacao);
    }

    public int atacar() {
        if(energia >= minEnergia){
            poder -= 20;
            energia -= 15;
            System.out.println("Safira está atacando usando sua própria força!");
            return 10;
        }throw new RuntimeException("Safira está com a energia baixa!");
    }

    public void sofrerDano(int dano){
        if(energia - dano <= 0 && maxRecuperacao != 0){
            energia = 0;
            System.out.println("Safira foi destruida!");
            return;
        }
        if(energia - dano > 0 && maxRecuperacao != 0){
            energia -= dano;
            System.out.println("Safira sofreu dano!");
        }
        energia = 0;
        vida = false; 
        throw new RuntimeException("Safira foi morta!");
    }

    public int usarPoder(){
        if(poder != 0 && energia >= minEnergia){
            poder -= 5;
            energia -= 5;
            System.out.println("Safira está prevendo seus ataques!");
            return poder;
        } throw new RuntimeException("Safira está fraca!");
    }

    public void recuperar(){
        if(vida == true && maxRecuperacao == 0)
            throw new RuntimeException("Safira não pode se recuperar!");
        
        if(poder + 30 > maxPoder){
            poder = maxPoder;
        }else if(poder != maxPoder)
            poder += 30;
        
        if(energia + 5 > maxEnergia){
            energia = maxPoder;
        }else if(energia != maxEnergia)
            energia += 5;

        maxRecuperacao -= 1;
    }  

    public int fundir(String nomeOther){
        if(vida == true && energia >= minEnergia){
            Fusões fusão = new Fusões("safira", nomeOther);
            return fusão.tipoFusão();
        } throw new RuntimeException("Safira não pode fundir-se com" + nomeOther);
    } 

    public String toString() {
        if(poder < 0)
            poder = 0;
        if(energia < 0)
            energia = 0;
            return "\n" + "Safira:" + "\n" + "Poder: " + poder + "/" + maxPoder + "\n" + "Energia: " + energia + "/" + maxEnergia + "\n";
    }
}

package Code;

public class Ametistas extends Gems implements CristalGems{    //
   
    public Ametistas(int poder, int energia, int minEnergia, int resistenciaArma, int maxRecuperacao){
        super(poder, energia, minEnergia, resistenciaArma, maxRecuperacao);
    }

    int atacar(){       
        if(vida == true && energia >= minEnergia && resistenciaArma > 0){
            poder -= 10;
            energia -= 5;
            resistenciaArma -= 1;
            System.out.println("Ametista atacou com seu chicote!");
            return 15;
        }
        
        if(vida == true && energia >= minEnergia){
            poder -= 15;
            energia -= 20;
            System.out.println("Ametista atacou, mas a seu chicote está partido!");
            return 10;
        } throw new RuntimeException("Ametista está com a energia baixa!");
    }

    void sofrerDano(int dano){
        if(energia - dano <= 0 && maxRecuperacao != 0){
            energia = 0;
            System.out.println("Ametista foi destruida!");
            return;
        }
        if(energia - dano <= 0 && maxRecuperacao == 0){
            vida = false;
            energia = 0;
            return;
        }
        if(vida == false)
            throw new RuntimeException("Ametista foi morta!");
        energia -= dano;
        System.out.println("Ametista sofreu dano!");
    }

    int usarPoder(){
        if(poder != 0 && energia >= minEnergia){
            poder -= 20;
            energia -= 15;
            System.out.println("Ametista criou clones e está atacando!");
            return poder;
        } throw new RuntimeException("Ametista está fraca!");
    }

    void recuperar(){
        if(vida == true && maxRecuperacao != 0){
            poder += 20;
            energia += 40;
            resistenciaArma += 2;
            maxRecuperacao -= 1;
        } throw new RuntimeException("Ametista não pode se recuperar!");
    }    

    public void fundir(String nomeFusão){
        if(vida == true && energia >= minEnergia){
            fusão.add(new Fusões("Ametista", nomeFusão));
        } throw new RuntimeException("Ametista não pode fundir-se com" + nomeFusão);
    }

    public String toString() {
        if(poder < 0)
            poder = 0;
        if(energia < 0)
            energia = 0;
        return poder + "/" + maxPoder + "\n" + energia + "/" + maxEnergia + "\n";
    }
}
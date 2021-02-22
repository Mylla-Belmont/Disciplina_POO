package Code;

public class Perolas extends Gems implements CristalGems{    //
    public Perolas(int poder, int energia, int minEnergia, int resistenciaArma, int maxRecuperacao){
        super(poder, energia, minEnergia, resistenciaArma, maxRecuperacao);
    }

    public int atacar(){ 
        if(vida == false)
            throw new RuntimeException("Perola foi morta!");
        
        if(energia >= minEnergia && resistenciaArma > 0){
            poder -= 10;
            energia -= 5;
            resistenciaArma -= 1;
            System.out.println("Perola atacou com a sua lança!");
            return 15;
        }
        if(energia >= minEnergia){
            poder -= 15;
            energia -= 20;
            System.out.println("Perola atacou, mas sua lança está quebrada!");
            return 10;
        } throw new RuntimeException("Perola está com a energia baixa!");
    }

    public void sofrerDano(int dano){
        if(energia - dano <= 0 && maxRecuperacao != 0){
            energia = 0;
            System.out.println("Perola foi destruida!");
            return;
        }
        if(energia - dano > 0 && maxRecuperacao != 0){
            energia -= dano;
            System.out.println("Perola sofreu dano!");
        }
        energia = 0;
        vida = false; 
        throw new RuntimeException("Perola foi morta!");
    }

    public int usarPoder(){
        if(poder != 0 && energia >= minEnergia){
            poder -= 10;
            energia -= 10;
            System.out.println("Perola criou clones e está atacando!");
            return poder;
        } throw new RuntimeException("Perola está fraca!");
    }

    public void recuperar(){
        if(vida == true && maxRecuperacao == 0)
            throw new RuntimeException("Perola não pode se recuperar!");

        if(poder + 20 > maxPoder){
            poder = maxPoder;
        }else if(poder != maxPoder)
            poder += 20;
        
        if(energia + 30 > maxEnergia){
            energia = maxPoder;
        }else if(energia != maxEnergia)
            energia += 30;
        
        resistenciaArma += 3;
        maxRecuperacao -= 1;
    }    

    public void fundir(String nomeFusão){
        if(vida == true && energia >= minEnergia){
            fusão.add(new Fusões("Perola", nomeFusão));
        } throw new RuntimeException("Perola não pode fundir-se com" + nomeFusão);
    }

    public String toString() {
        if(poder < 0)
            poder = 0;
        if(energia < 0)
            energia = 0;
        return "Perola:" + "\n" + "Poder: " + poder + "/" + maxPoder + "\n" + "Energia: " + energia + "/" + maxEnergia;
    }
}
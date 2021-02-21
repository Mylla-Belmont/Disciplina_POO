package Code;

public class Perolas extends Gems implements CristalGems{    //
   
    public Perolas(int poder, int energia, int minEnergia, int resistenciaArma, int maxRecuperacao){
        super(poder, energia, minEnergia, resistenciaArma, maxRecuperacao);
    }

    int atacar(){       
        if(vida == true && energia >= minEnergia && resistenciaArma != 0){
            poder -= 5;
            energia -= 5;
            resistenciaArma -= 1;
            System.out.println("Perola atacou com sua lança!");
            return 10;
        }
        
        if(vida == true && energia >= minEnergia){
            poder -= 10;
            energia -= 10;
            System.out.println("Perola atacou, mas a sua lança está quebrada!");
            return 5;
        } throw new RuntimeException("Perola está com a energia baixa!");
    }

    void sofrerDano(int dano){
        if(energia - dano <= 0 && maxRecuperacao != 0){
            energia = 0;
            System.out.println("Perola foi destruida!");
            return;
        }
        if(energia - dano <= 0 && maxRecuperacao == 0){
            vida = false;
            energia = 0;
            return;
        }
        if(vida == false)
            throw new RuntimeException("Perola foi morta!");
        energia -= dano;
        System.out.println("Perola sofreu dano!");
    }

    int usarPoder(){
        if(poder != 0 && energia >= minEnergia){
            poder -= 10;
            energia -= 10;
            System.out.println("Perola criou clones e está atacando!");
            return poder;
        } throw new RuntimeException("Perola está fraca!");
    }

    void recuperar(){
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
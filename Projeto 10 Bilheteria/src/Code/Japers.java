package Code;

public class Japers extends Gems{
    public Japers(int poder, int energia, int minEnergia, int resistenciaArma, int maxRecuperacao){
        super(poder, energia, minEnergia, resistenciaArma, maxRecuperacao);
    }

    public int atacar(){       
        if(vida == true && energia >= minEnergia){
            poder -= 10;
            energia -= 20;
            System.out.println("Jasper atacou com sua força!");
            return 40;
        } throw new RuntimeException("Jasper está com a energia baixa!");
    }

    public void sofrerDano(int dano){
        if(energia - dano <= 0 && maxRecuperacao != 0){
            energia = 0;
            System.out.println("Jasper foi destruida!");
            return;
        }
        if(energia - dano > 0 && maxRecuperacao != 0){
            energia -= dano;
            System.out.println("Jasper sofreu dano!");
        }
        energia = 0;
        vida = false; 
        throw new RuntimeException("Jasper foi morta!");
    }

    public int usarPoder() {
        System.out.println("Jasper não possui poderes");
        return 0;
    }

    public void recuperar(){
        if(vida == true && maxRecuperacao == 0)
            throw new RuntimeException("Jasper não pode se recuperar!");
        
        if(energia + 50 > maxEnergia){
            energia = maxPoder;
        }else if(energia != maxEnergia)
            energia += 50;

        maxRecuperacao -= 1;
    }  

    public String toString() {
        if(poder < 0)
            poder = 0;
        if(energia < 0)
            energia = 0;
            return "\n" + "Jasper:" + "\n" + "Energia: " + energia + "/" + maxEnergia + "\n";
    }
}
package Code;

public class Japers extends Gems{
    
    public Japers(int poder, int energia, int minEnergia, int resistenciaArma, int maxRecuperacao){
        super(poder, energia, minEnergia, resistenciaArma, maxRecuperacao);
    }

    int atacar(){       
        if(vida == true && energia >= minEnergia){
            poder -= 10;
            energia -= 20;
            System.out.println("Jasper atacou com sua lança!");
            return 40;
        } throw new RuntimeException("Jasper está com a energia baixa!");
    }

    void sofrerDano(int dano){
        if(energia - dano < 0 && maxRecuperacao != 0){
            energia = 0;
            System.out.println("Jasper foi destruida!");
        }else if(energia - dano < 0 && maxRecuperacao == 0){
            vida = false;
            energia = 0;
        }else{
            energia -= dano;
        } throw new RuntimeException("Jasper foi morta!");
    }

    int usarPoder() {
        System.out.println("Jasper não possui poderes");
        return 0;
    }

    void recuperar(){
        if(vida == true && maxRecuperacao != 0){
            poder += 40;
            energia += 50;
            maxRecuperacao -= 1;
        } throw new RuntimeException("Jasper não pode se recuperar!");
    }    

    public String toString() {
        if(poder < 0)
            poder = 0;
        if(energia < 0)
            energia = 0;
        return poder + "/" + maxPoder + "\n" + energia + "/" + maxEnergia + "\n";
    }
}
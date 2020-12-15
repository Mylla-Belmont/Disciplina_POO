class tamagotchi{
    private int saciedade;
    private int energia;
    private int limpeza;
    private int maxSaciedade;
    private int maxEnergia;
    private int maxLimpeza;
    private int diamante;
    private int idade;
    private boolean vida;

    tamagotchi(int maxSaciedade, int maxEnergia, int maxLimpeza, int diamante, int idade){
        this.saciedade = maxSaciedade;
        this.energia = maxEnergia;
        this.limpeza = maxLimpeza;
        this.maxSaciedade = maxSaciedade;
        this.maxEnergia = maxEnergia;
        this.maxLimpeza = maxLimpeza;
        this.diamante = diamante;
        this.idade = idade;
        this.vida = true;
    }

    private void setlimpeza(int valor){
        limpeza = valor;
        if(limpeza > maxLimpeza){
            limpeza = maxLimpeza;
        }
        if(limpeza < 0){
            limpeza = 0;
            this.vida = false;
            System.out.println("Seu Tamagotchi morreu doente");
        }
    }

    private void setSaciedade(int valor){
        saciedade = valor;
        if(saciedade > maxSaciedade){
            saciedade = maxSaciedade;
        }
        if(saciedade < 0){
            saciedade = 0;
            this.vida = false;
            System.out.println("Seu Tamagotchi morreu de Saciedade");
        }
    }

    private void setEnergia(int valor){
        energia = valor;
        if(energia > maxEnergia){
            energia = maxEnergia;
        }
        if(energia < 0){
            energia = 0;
            this.vida = false;
            System.out.println("Seu Tamagotchi morreu de cansaço");
        }
    }

    public int getEnergia(){
        return energia;
    }

    public int getSaciedade(){
        return saciedade;
    }

    public int getLimpeza(){
        return limpeza;
    }

    public void getComer(){
        this.setEnergia(getEnergia() - 1 );
        this.setSaciedade(getSaciedade() + 4);
        this.setlimpeza(getLimpeza() - 2);
        diamante = 0;   //Modificar para get e set depois
        idade = 1;
    }

    public void getBrincar(){

    }

    public void getDormir(){

    }

    void novoTamagochi(int valorEnegia, int valorSaciedade, int valorLimpeza){
        vida = true;
        maxEnergia = valorEnegia;
        maxSaciedade = valorSaciedade;
        maxLimpeza = valorLimpeza;
    }



    public static void main(String[] args) {

        tamagotchi tamagotchi = new tamagotchi(10, 10, 10, 0, 0);
        System.out.println(tamagotchi);
        
    }
}

public class jogo{
    public static void main(String[] args) {

        tamagotchi tamagotchi = new tamagotchi(0, 0, 0, 0, 0);

    }
}

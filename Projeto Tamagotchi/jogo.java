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

    public boolean vida(){
        return vida;
    }

    private void setIdade(int valor){
        idade = valor;
    }

    private void setDiamante(int valor){
        diamante = valor;
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

    public int getIdade(){
        return idade;
    }

    public int getDiamante(){
        return diamante;
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
        this.setEnergia(getEnergia() - 1);
        this.setSaciedade(getSaciedade() + 4);
        this.setlimpeza(getLimpeza() - 2);
        this.setIdade(getIdade() + 1);
    }

    public void getBrincar(){
        this.setEnergia(getEnergia() - 2);
        this.setSaciedade(getSaciedade() - 1);
        this.setlimpeza(getLimpeza() - 3);
        this.setDiamante(getDiamante() + 1);
        this.setIdade(getIdade() + 1);
    }

    public void getBanho(){
        this.setEnergia(getEnergia() - 3);
        this.setSaciedade(getSaciedade() - 1);
        this.setlimpeza(getLimpeza() + maxLimpeza);
        this.setIdade(getIdade() + 2);
    }

    public void getDormir(int qtdDormida){
        if(this.energia == maxEnergia){
            System.out.println("O Tamagotchi não está com sono");
            return;
        }
        this.setEnergia(getEnergia() + maxEnergia);
        this.setIdade(getIdade() + qtdDormida);
    }

    public String toString(){
        return energia + "/" + maxEnergia + ", " + saciedade + "/" + maxSaciedade + ", " + limpeza + "/" + maxLimpeza + ", " + diamante + ", " + idade;
    }

    public static void main(String[] args) {

        tamagotchi tamagotchi = new tamagotchi(0, 0, 0, 0, 0);
        System.out.println(tamagotchi);
        
    }
}

public class jogo{
    public static void main(String[] args) {

        tamagotchi tamagotchi = new tamagotchi(0, 0, 0, 0, 0);

    }
}

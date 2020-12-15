import java.util.Scanner;

class tamagotchi{
    private int saciedade;
    private int energia;
    private int limpeza;
    private int maxSaciedade;
    private int maxEnergia;
    private int maxLimpeza;
    private int diamante;
    private int idade;
    private boolean Alive;

    tamagotchi(int maxSaciedade, int maxEnergia, int maxLimpeza, int diamante, int idade){
        this.saciedade = maxSaciedade;
        this.energia = maxEnergia;
        this.limpeza = maxLimpeza;
        this.maxSaciedade = maxSaciedade;
        this.maxEnergia = maxEnergia;
        this.maxLimpeza = maxLimpeza;
        this.diamante = diamante;
        this.idade = idade;
        this.Alive = true;
    }

    private void setlimpeza(int entrada ){
        limpeza = entrada ;
        if(limpeza > maxLimpeza){
            limpeza = maxLimpeza;
        }
        if(limpeza < 0){
            limpeza = 0;
            this.Alive = false;
            System.out.println("Seu Tamagotchi morreu doente");
        }
    }

    private void setIdade(int entrada ){
        idade = entrada ;
    }

    private void setDiamante(int entrada ){
        diamante = entrada ;
    }

    private void setSaciedade(int entrada ){
        saciedade = entrada ;
        if(saciedade > maxSaciedade){
            saciedade = maxSaciedade;
        }
        if(saciedade < 0){
            saciedade = 0;
            this.Alive = false;
            System.out.println("Seu Tamagotchi morreu de Saciedade");
        }
    }

    private void setEnergia(int entrada ){
        energia = entrada ;
        if(energia > maxEnergia){
            energia = maxEnergia;
        }
        if(energia < 0){
            energia = 0;
            this.Alive = false;
            System.out.println("Seu Tamagotchi morreu de cansaço");
        }
    }

    public boolean isAlive(){
        return this.Alive;
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

        tamagotchi tamagotchi = new tamagotchi(10, 10, 10, 0, 0);
        System.out.println(tamagotchi);
        
    }
}

public class jogo{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        tamagotchi tamagotchi = new tamagotchi(10, 10, 10, 0, 0);   //Mudar entrada

        while(tamagotchi.isAlive()){

            System.out.println("\nO que você vai fazer?");
            String input = scanner.nextLine();
            String[] entrada = input.split(" ");
            int qtdDormida = entrada.length;

            if(input.equals("show")){
                System.out.println(tamagotchi);
            }else
            if(input.equals("play")){
                tamagotchi.getBrincar();
            }else
            if(input.equals("eat")){
                tamagotchi.getComer();
            }else 
            if(entrada[0].equals("sleep")){
                tamagotchi.getDormir(qtdDormida);
            }else
            if(input.equals("clean")){
                tamagotchi.getBanho();
            }else
            if(input.equals("end")){
                break;
            }else
                System.out.println("Fail: Comando inválido");
        }
        scanner.close();
    }
}

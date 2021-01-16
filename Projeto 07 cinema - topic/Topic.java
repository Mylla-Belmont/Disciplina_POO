import java.util.ArrayList;

class Passageiros{

    String nome;
    int idade;

    Passageiros(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String ToString(){
        return nome + " " + idade;
    }
}

class Carro{

    ArrayList<Passageiros> cadeiras;
    int qtdPreferencial;

    Carro(int qtd, int qtdPreferencial){
        this.qtdPreferencial = qtdPreferencial;
        this.cadeiras = new ArrayList<>();

        for(int i=0; i < qtd; i++)
            cadeiras.add(null);
    }

    // boolean descer(String nome){
    //     return true;
    // }

    void subir(String nome, int idade){
        int i = 0;
        for(Passageiros passageiro : cadeiras){
            if(passageiro.idade >= 60 && qtdPreferencial != 0 && cadeiras.get(i) == null){
                cadeiras.set(i, new Passageiros(nome, idade));
                qtdPreferencial -= 1;
                i++;
            }
        }
    }

    public String toString(){
        String saida = "";
        int preferencial = qtdPreferencial;

        for(Passageiros cadeiras : cadeiras){
            if(preferencial != 0 && cadeiras == null){
                saida += " @ ";
                preferencial -= 1;
            }
            if(preferencial == 0 && cadeiras == null)
                saida += " = ";
        }
        return "[" + saida + "]";
    }
}

public class Topic{
    public static void main(String[] args){

        Carro carro = new Carro(5, 2);

        carro.subir("davi", 17);
        carro.subir("joão", 103);

        System.out.println(carro);
    }
}


// for(int i=0; i < qtdPreferencial; i++){
//     if(cadeiras == null)
//         saida += " @ ";
// }
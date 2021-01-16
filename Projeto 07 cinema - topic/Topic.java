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

    // boolean subir(Passageiros passageiro){
    //     return true;
    // }

    public String ToString(){
        String saida = "";
        for(Passageiros cadeiras : cadeiras)
        
            for(int i=0; i < qtdPreferencial; i++)
                if(cadeiras == null)
                    saida += " @ ";

            if(cadeiras == null)
                saida += " = ";

        return "'[" + saida + "]'";
    }
}

public class Topic{

    public static void main(String[] args){

        Carro carro = new Carro(5, 2);

        System.out.println(carro);
    }
}

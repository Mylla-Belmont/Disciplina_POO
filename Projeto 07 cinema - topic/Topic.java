import java.util.ArrayList;

class Passageiros{

    String nome;
    int idade;

    Passageiros(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String toString(){
        return nome + ":" + idade;
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

    void descer(String nome){
        for(int i=0; i < cadeiras.size(); i++)
            if(cadeiras.get(i) != null && cadeiras.get(i).nome.equals(nome)){
                cadeiras.set(i, null);
                return;
        }System.out.println("O passageiro não está na topic");
    }

    void subir(String nome, int idade){
        for(Passageiros cadeiras : cadeiras){
            if(cadeiras != null && cadeiras.nome.equals(nome)){
                System.out.println("O passageiro já está na topic");
                return;
            }
        }
        int cont = 0;
        for(int i=qtdPreferencial; i < cadeiras.size(); i++)
            if(cadeiras.get(i) != null)
                cont++;
                
        for(int i=0; i < cadeiras.size(); i++){
            if(idade >= 60 && (i < qtdPreferencial) && cadeiras.get(i) == null){
                cadeiras.set(i, new Passageiros(nome, idade));
                return;
            }
            if(idade >= 60 && (i >= qtdPreferencial) && cadeiras.get(i) == null){
                cadeiras.set(i, new Passageiros(nome, idade));
                return;
            }
            if(i >= qtdPreferencial && cadeiras.get(i) == null){
                cadeiras.set(i, new Passageiros(nome, idade));
                return;
            }
            if(idade < 60 && i < qtdPreferencial && (cont == cadeiras.size() - qtdPreferencial) && cadeiras.get(i) == null){
                cadeiras.set(i, new Passageiros(nome, idade));
                return;
            }
        }System.out.println("Todas as cadeiras estão ocupadas!");
    }

    public String toString(){
        String saida = "[";
        int i = 0;
        int preferencial = qtdPreferencial;

        for(Passageiros cadeiras : cadeiras){
            if(i < preferencial && cadeiras == null){
                saida += " @ ";
            }else if(i >= preferencial && cadeiras == null){
                saida += " = ";
            }else
                saida += " " + cadeiras + " ";
            i++;
        }
        return saida + "]";
    }
}

public class Topic{
    public static void main(String[] args){

        Carro carro = new Carro(5, 2);

        //Adicionar passageiro
        carro.subir("davi", 17);
        carro.subir("joão", 102);
        carro.subir("jorge", 64);
        carro.subir("michael", 20);
        carro.subir("enzo", 10);
        System.out.println(carro);

        //Descer passageiro
        carro.descer("davi");
        carro.descer("joão");
        carro.descer("maria");
        carro.descer("maria");
        System.out.println(carro);
    }
}
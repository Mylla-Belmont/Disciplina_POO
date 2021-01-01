import java.util.Scanner;
import java.util.ArrayList;

class Fone{

    String label;
    String number;

    Fone(String label, String number){
        this.label = label;
        this.number = number;
    }

    public static boolean validandoNumero(String number){      
        String validos = "0123456789()-";

        for(int i=0; i < number.length(); i++)              //Percorre o vetor de acordo com o seu tamanho /number.length()/
            if(validos.indexOf(number.charAt(i)) == -1)     // .indexOf - Retorna a posição da primeira ocorrencia de um caracter especifico
                return false;                               // .charAt() - retorna caracter especificado da posição i
        return true;
    }
}

class contato{

    String nome;
    ArrayList<Fone> fones; 

    contato(String nome){
        this.nome = nome;
        this.fones = new ArrayList<>();
    }

    public void adicionarFone(String label, String number){
        if(Fone.validandoNumero(number))
            fones.add(new Fone (label, number));       //Adicionar novo Fone
        System.out.println("Número inválido!");
    }

    public void removerFone(int index){
        fones.remove(index);
    }

    public String toString(){
        return nome + " [";
    }
    
    public static void main(String[] args) {
        contato contato = new contato("");

        System.out.println(contato);
    }
}


public class agenda {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        contato novoContato = new contato("");


        System.out.println("O que deseja fazer na agenda?");
        String line = input.nextLine();
        String[] type = line.split(" ");

        if(type[0].equals("adicionar")){
            novoContato.nome = type[1];
        }
        if(type[0].equals("add")){
            novoContato.adicionarFone(type[1], type[2]);
        }
        if(type[0].equals("rm")){
            int index = Integer.parseInt(type[1]);
            novoContato.removerFone(index);
        }
        input.close();
    }
}
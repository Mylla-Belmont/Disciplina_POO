import java.util.Scanner;
import java.util.ArrayList;

class fone{
    
    String label;
    String number;

    fone(String label, String number){
        this.label = label;
        this.number = number;
    }

    public boolean validandoNumero(String number){      
        String validos = "0123456789()-";

        for(int i=0; i < number.length(); i++)              //Percorre o vetor de acordo com o seu tamanho /number.length()/
            if(validos.indexOf(number.charAt(i)) == -1)     // .indexOf - Retorna a posição da primeira ocorrencia de um caracter especifico
                return false;                               // .charAt() - retorna caracter especificado da posição i
        return true;
    }

    public String toString(){
        return label + ":" + number;
    }
}

class contato{

    private String nome;
    ArrayList<Fone> fones; 

    contato(String nome){
        this.nome = nome;
        this.fones = new ArrayList();
    }

    private void setAdicionarFone(int label, int number){
        fones.add(label, number);    
    }

    private void getFones(){
        return fones;
    }

    public static void main(String[] args) {
        }
}


public class agenda {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
    }
}
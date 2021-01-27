import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

class Fone{
    String id;
    String number;

    public Fone(String id, String number){
        this.id = id;
        this.number = number;
    }

    public static boolean validate(String number){
        String validos = "0123456789()-";

        for(int i=0; i < number.length(); i++)
            if(validos.indexOf(number.charAt(i)) == -1)
                return false;
            return true;
    }

    public String toString(){
        return id + ":" + number;
    }
}

class Contato{
    String name;
    ArrayList<Fone> fones;

    public Contato(String name){
        this.name = name;
        this.fones = new ArrayList<>();
    }

    void addFone(String name, List<Fone> fone){
        String number = "";
        for(int i=0; i < fone.size(); i++)
            if(Fone.validate(fone.get(i).number))
                number += fone.get(i).id + ":" + fone.get(i).number;
            else
                System.out.println("O número" + fone.get(i).number + "é inválido");
       fones.add(new Fone(name, number));
    }

    public String toString(){
        String saida = this.name;
        int i=0;
        for(Fone fones : fones){
            saida += "[" + i + ":" + fones + "]"; 
            i++;
        }
        return saida;
    }
}

class Agenda{
    ArrayList<Contato> contato;

    public Agenda(){
        this.contato = new ArrayList<>();
    }

    boolean findContato(String name){
        for(int i=0; i < contato.size(); i++)
            if(contato.get(i).name.equals(name))
                return true;
        return false;
    }

    void addContato(String name, List<Fone> fone){
        if(findContato(name)){
            System.out.println("Esse contato já existe");
            return;
        }
        for(int i=0; i < fone.size(); i++)
            for(Contato contato : contato)
                this.contato.add(contato.addFone(name, fone));
    }

    public String toString(){
        String saida = "";
        for(Contato contato : contato)
            saida += contato;
        return saida + "";
    }
}

public class Agenda2{
    public static void main(String[] agrs){

        Agenda agenda = new Agenda();
        
        //Adicionando contato
        agenda.addContato("eva", Arrays.asList(new Fone("oio", "8585"), new Fone("cla", "9999")));
        System.out.println(agenda);

    //     //Removendo contato
    //     agenda.rmFone("ana", 0);
    //     System.out.println(agenda);
    }
}
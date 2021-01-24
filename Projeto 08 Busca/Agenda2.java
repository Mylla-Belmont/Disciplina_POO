import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

class Fone{
    String id;
    String number;

    Fone(String id, String number){
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

    Contato(String name){
        this.name = name;
        this.fones = new ArrayList<>();
    }

    void addFone(String id, String number){
        if(Fone.validate(number))
            fones.add(new Fone(id, number));
        System.out.println("Número inválido");
    }

    Fone getFone(int index){
        if(index < 0 && index > fones.size()){
            System.out.println("Número não encontrado");
            return null;
        }
        return fones.get(index);
    }

    Fone getName(String numero){
        for(Fone fone : fones)
            if(fone.number.equals(numero))
                return fone;
        return null;
    }

    // void rmFone(String name){
    //     for(Fone fone : fones)
    //         if(fone.id.equals(name))
    //             fones.remove();
    //     System.out.println("O seguinte número não existe");
    // }

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

    Agenda(){
        this.contato = new ArrayList<>();
    }

    void addContato(String name, List<Fone> fone){
        for(Contato contato : contato)
            if(contato.name.equals(name)){
                System.out.println("Esse contato já existe");
                return;
            }
        
    //     String number = "";    
    //     for(int i=0; i < fone.size(); i++)
    //         number += fone.get(i);

        // // for(Contato contato : contato)
        //     contato.addAll(con)
        //     this.contato.add(contato.addFone(name, number));
    }

    // void rmContato(String name){
    //     for(int i=0; i < contato.size(); i++)
    //         if(contato.get(i).name.equals(name))
    //             contato.remove(name);
    //     System.out.println("O contato não existe");
    // }
    
    void removerFone(String number, int index){

    }

    public String toString(){
        String saida = "";
        for(Contato contato : contato)
            saida += contato.fones;
        return saida + "";
    }
}

public class Agenda2{
    public static void main(String[] agrs){

        Agenda agenda = new Agenda();

        //Adicionando contato
        agenda.addContato("eva", Arrays.asList(new Fone("oio", "8585"), new Fone("cla", "9999")));
        System.out.println(agenda);

        // //Removendo contato
        // agenda.rmFone("ana", 0);
        // System.out.println(agenda);
    }
}
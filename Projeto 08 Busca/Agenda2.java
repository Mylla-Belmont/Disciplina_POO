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
        for(int i = 0; i < number.length(); i++)
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

    void addFone(String id, String number){
        if(Fone.validate(number)){
            fones.add(new Fone(id, number));
            return;
        }
        System.out.println("fail: número inválido");
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
        Contato contato = new Contato(name);
       // for(Fone fones : fone)
        for(int i=0; i < fone.size(); i++)
            contato.addFone(fone.get(i).id, fone.get(i).number);

        this.contato.add(contato);
    }

    public String toString(){
        String saida = "";
        for(Contato contato : contato)
            saida += contato + "\n";
        return saida + "";
    }
}

public class Agenda2{
    public static void main(String[] agrs){

        Agenda agenda = new Agenda();
        
        //Adicionando contato
        agenda.addContato("eva", Arrays.asList(new Fone("oio", "8585"), new Fone("cla", "9999")));
        agenda.addContato("ana", Arrays.asList(new Fone("Tim", "3434")));
        agenda.addContato("bia", Arrays.asList(new Fone("viv", "5454")));
       // agenda.addContato("ana", Arrays.asList(new Fone("cas", 4567), new Fone("oio", 8754)));  
        System.out.println(agenda);

    //     //Removendo contato
    //     agenda.rmFone("ana", 0);
    //     System.out.println(agenda);
    }
}
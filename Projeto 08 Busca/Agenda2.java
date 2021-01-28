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

    void rmFone(int index){
        if(fones.get(index) != null){
            fones.remove(index);
            return;
        }
        System.out.println("fail: esse número não existe");
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

    int findContato(String name){
        for(int i=0; i < this.contato.size(); i++)
            if(this.contato.get(i).name.equals(name))
                return i;
        return -1;
    }

    void addContato(String name, List<Fone> fone){
        for(int i=0; i < fone.size(); i++){
            if(findContato(name) != -1){
                this.contato.get(findContato(name)).addFone(fone.get(i).id, fone.get(i).number);
            }else{
                Contato contato = new Contato(name);
                contato.addFone(fone.get(i).id, fone.get(i).number);
                this.contato.add(contato);
            }
        }
    }

    void rmFone(String name, int index){
        if(findContato(name) != -1){
            this.contato.get(findContato(name)).rmFone(index);
            return;
        }
        System.out.println("fail: esse contato não existe");
    }

    void rmContato(String name){
        if(findContato(name) != -1){
            this.contato.remove(findContato(name));
            return;
        }
        System.out.println("fail: esse contato não existe");
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
        agenda.addContato("ana", Arrays.asList(new Fone("cas", "4567"), new Fone("oio", "8754")));  
        System.out.println(agenda);

        //Removendo telefone
        agenda.rmFone("eva", 1);
        System.out.println(agenda);

        //case removendo contato
        agenda.rmContato("bia");
        System.out.println(agenda);
    }
}
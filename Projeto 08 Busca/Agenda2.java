import java.util.ArrayList;

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

    // Fone getFone(int index){
    //     if(index < 0 && index > fones.size()){
    //         System.out.println("Número não encontrado");
    //         return null;
    //     }
    //     return fones.get(index);
    // }

    // Fone getName(String numero){
    //     for(Fone fone : fones)
    //         if(fone.number.equals(numero))
    //             return fone;
    //     return null;
    // }

    void rmFone(int index){
        if(fones.get(index) != null)
            fones.set(index, new Fone(null, null));
        System.out.println("O seguinte número não existe");
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

    Agenda(){
        this.contato = new ArrayList<>();
    }

    void addContato(String name, String fone){
        for(Contato contato : contato){
            if(contato.name.equals(name)){
                System.out.println("Esse contato já existe");
                return;
            }
            contato.addFone(name, fone);
        }
    }

    public String toString(){
        String saida = "[";
        for(Contato contato : contato)
            saida += contato.fones;
        return saida + "]";
    }
}

public class Agenda2{
    public static void main(String[] agrs){

        Agenda agenda = new Agenda();

        agenda.addContato("Ana", "oi:8596");
        System.out.println(agenda);
    }
}
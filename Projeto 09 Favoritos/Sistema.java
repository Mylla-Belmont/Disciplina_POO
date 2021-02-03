import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;
//import java.util.Scanner;

class Fone{
    String label;
    String number;

    Fone(String label, String number){
        this.label = label;
        this.number = number;
    }

    public static boolean validate(String number){
        String validos = "123456789-()";
        for(int i=0; i < number.length(); i++)
            if(validos.indexOf(number.charAt(i)) == -1)
                return true;
        return false;
    }

    public String toString(){
        return label + ":" + number;
    }
}

class Contato{
    String name;
    boolean starred;
    ArrayList<Fone> fones;

    Contato(String name){
        this.name = name;
        this.fones = new ArrayList<>();
    }

    void addFone(String label, String number){
        if(Fone.validate(number)){
            fones.add(new Fone(label, number));
        }
        //Fazer uma excessão aqui
    }

    void rmFone(int index){
        if(fones.get(index) != null){
            fones.remove(index);
        }
        //Fazer uma excessão aqui
    }

    public String toString(){
        StringBuilder saida = new StringBuilder();
        int i=0;
        for (Fone fones : fones) {
            saida.append("[" + i + ":" + fones + "]");
            i++;
        }
        return saida.toString();
    }
}

class Agenda{
    TreeMap<String, Contato> contatos;
    TreeMap<String, Contato> bookMarks;

    Agenda(){
        this.contatos = new TreeMap<>();
        this.bookMarks = new TreeMap<>();
    }

    void addContato(String name, List<Fone> fones){
        if(!this.contatos.containsKey(name))
            contatos.put(name, new Contato(name));
        //Add fone aqui
    }

    boolean rmContato(String name){
        if(this.contatos.containsKey(name))
            contatos.remove(name);
            //UnBookMars aqui
        return false;
    }

    ArrayList<Contato> search(String patter){
        ArrayList<Contato> busca = new ArrayList<>();
        if(this.contatos.containsKey(patter))
            busca.add(contatos.get(patter));
        return busca;
    }

    public String toString(){
        StringBuilder saida = new StringBuilder();
        for (Contato contato : this.contatos.values())
            saida.append(contato);
        return saida.toString();
    }
}

public class Sistema{
    public static void main(String[] agrs){

        Agenda agenda = new Agenda();
        agenda.addContato("eva", Arrays.asList(new Fone("oio", "8585"), new Fone("cla", "9999")));
        agenda.addContato("ana", Arrays.asList(new Fone("Tim", "3434")));
        agenda.addContato("bia", Arrays.asList(new Fone("viv", "5454")));
        agenda.addContato("ana", Arrays.asList(new Fone("cas", "4567"), new Fone("oio", "8754")));
        System.out.println(agenda);

        // Agenda agenda = new Agenda();
        // Scanner scanner = new Scanner(System.in);

        // while(true){
        //     try{
        //         System.out.println("Digite o que deseja fazer:");
        //         String input = scanner.nextLine();
        //         String[] Ui = input.split(" ");

        //         if(Ui[0].equals("end")){
        //             break;
        //         }else if(Ui[0].equals("add")){
        //             for(int i=2; i < Ui.length; i++)
        //                 agenda.addContato(Ui[1], Ui[i]);
        //         }


        //     }catch(IndexOutOfBoundsException e){
        //         System.out.println("Alguma coisa teste");
        //     }
        // }

        // scanner.close();
    }
}
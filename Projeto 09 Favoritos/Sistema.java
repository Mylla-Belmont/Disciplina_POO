import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.Scanner;

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

    Contato(String name, boolean starred){
        this.name = name;
        this.starred = starred;
        this.fones = new ArrayList<>();
    }

    void addFone(String label, String number){
        if(Fone.validate(number)){
            fones.add(new Fone(label, number));
            return;
        }
        //Fazer uma excessão aqui
    }

    void rmFone(int index){
        if(fones.get(index) != null){
            fones.remove(index);
            return;
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
            this.contatos.put(name, new Contato(name, fones));
    }
}

public class Sistema{
    public static void main(String[] agrs){

        Agenda agenda = new Agenda();
        Scanner scanner = new Scanner(System.in);

        while(true){
            try{
                System.out.println("Digite o que deseja fazer:");
                String input = scanner.nextLine();
                String[] Ui = input.split(" ");

                if(Ui[0].equals("end")){
                    break;
                }
            }catch(IndexOutOfBoundsException e){
                System.out.println("Alguma coisa teste");
            }
        }

        scanner.close();
    }
}
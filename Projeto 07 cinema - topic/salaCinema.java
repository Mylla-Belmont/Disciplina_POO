import java.util.ArrayList;

class Cliente{

    String nome;
    String fone;

    public Cliente(String nome, String fone){
        this.nome = nome;
        this.fone = fone;
    }

    public void cliente(String nome, String fone){
        this.nome = nome;
        this.fone = fone;
    }

    public String toString(){
        return nome + ":" + fone;
    }
}

class Cinema{

    ArrayList<Cliente> cliente;

    Cinema(int lugares){
        this.cliente = new ArrayList<>();
        for(int i=0; i < lugares; i++)
            cliente.add(null);
    }

    void reservar(String nome, String fone, int index){
        if(index < 0 && index >= cliente.size()){
            System.out.println("Indice inválido");
            return;
        }
        if(cliente.get(index) != null){
            System.out.println("A cadeira já está ocupada");
            return; 
        }
        for(Cliente cliente : cliente){
            if(cliente != null && cliente.nome.equals(nome)){
                System.out.println("O cliente ja esta no cinema!");
                return;
            }
        }
        cliente.set(index, new Cliente(nome, fone));
    }  
    
    void cancelar(String nome){
        for(int i=0; i < cliente.size(); i++){
            if(cliente.get(i) != null && cliente.get(i).nome.equals(nome)){
                cliente.set(i, null);
                System.out.println("Reserva cancelada");
                return;
            }
        }
        System.out.println("O cliente não foi encontrado");
    }
    
    public String toString(){
        String saida = "";
        for(Cliente cliente : cliente)
            if(cliente == null)
                saida += "- ";
            else
                saida += " " + cliente + " ";
        return "[" + saida + "]";
    }
}

public class salaCinema{
    public static void main(String[] args){

    Cinema cinema = new Cinema(5);
    
    cinema.reservar("davi", "3232", 0);
    cinema.reservar("joao", "3131", 3);
    cinema.reservar("joao", "3131", 4);
    cinema.reservar("kleber", "9673", 3);
    System.out.println(cinema);

    cinema.reservar("rute", "3030", 0);
    cinema.reservar("davi", "3234", 2);
    cinema.cancelar("davi");
    System.out.println(cinema);

    cinema.cancelar("rita");
    System.out.println(cinema);
    
    }
}

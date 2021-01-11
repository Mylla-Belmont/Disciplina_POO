import java.util.ArrayList;

class Cliente{

    String nome;
    String fone;

    Cliente(String nome, String fone){
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
            this.cliente.add(new Cliente(null, null));
    }

    void reservar(String nome, String fone, int index){
        if(index >= 0 && index < cliente.size()){
            if(cliente.get(index) != null){
                cliente.set(index, new Cliente(nome, fone));
            }else 
                System.out.println("A cadeira já está ocupada");
        }else
            System.out.println("Cadeira não existe");
    }  
    
    // void cancelar(String elemento){
    //     if(cliente.indexOf(elemento) != -1) {
    //         int index = cliente.indexOf(elemento);
    //         cliente.set(index, new Cliente(" - ", " "));
    //     }
    // }
    
    public String toString(){
        String saida = "";
        for(Cliente cliente : cliente)
            if(cliente.nome == null)
                saida += " - ";
            else
                saida += cliente;
        return "[" + saida + "]";
    }
}

public class salaCinema{
    public static void main(String[] args){

    Cinema cinema = new Cinema(5);
    
    cinema.reservar("davi", "3232", 0);
    cinema.reservar("joao", "3131", 3);
    cinema.reservar("kleber", "9673", 3);

    System.out.println(cinema);

    // // [ davi:3232 - - joao:3131 ]
    // cinema.reservar("rute", "3030", 0);
    // // fail: cadeira ja esta ocupada
    // cinema.reservar("davi", "3234", 2);
    // // fail: cliente ja esta no cinema
    // cinema.cancelar("davi");
    // System.out.println(cinema);
    // // [ - - - joao:3131 ]
    // cinema.cancelar("rita");
    // // fail: cliente nao esta no cinema
    // System.out.println(cinema);
    // // [ - - - joao:3131 ]

    }
}

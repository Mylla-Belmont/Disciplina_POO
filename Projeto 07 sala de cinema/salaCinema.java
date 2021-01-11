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
        if(nome.equals("-"))
            return "-";
        else
            return nome + " : " + fone;
    }
}

class Cinema{

    ArrayList<Cliente> cliente;

    Cinema(int lugares){
        this.cliente = new ArrayList<>();
        for(int i=0; i < lugares; i++)
            this.cliente.add(new Cliente("-", " "));
    }

    void reservar(String nome, String fone, int index){
        cliente.set(index, new Cliente(nome, fone));
    }  
    
    // void cancelar(String elemento){
    //     if(cliente.indexOf(elemento) != -1) {
    //         int index = cliente.indexOf(elemento);
    //         cliente.set(index, new Cliente(" - ", " "));
    //     }
    // }
    
    public String toString(){
        return "" + cliente;
    }
}

public class salaCinema{
    public static void main(String[] args){

    Cinema cinema = new Cinema(10);
    System.out.println(cinema);

    // cinema.reservar("davi", "3232", 0);
    // cinema.reservar("joao", "3131", 3);
    // System.out.println(cinema);
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

import java.util.ArrayList;


class Cliente{

    String identificador;
    String fone;

    Cliente(String identificador, String fone){
        this.identificador = identificador;
        this.fone = fone;
    }

    public void cliente(String identificador, String fone){
        this.identificador = identificador;
        this.fone = fone;
    }
}

class cinema{

    ArrayList<Cliente> cliente;

    cinema(int lugares){
        this.cliente = new ArrayList<>();
        for(int i=0; i < lugares; i++)
            this.cliente.add(new Cliente("-", " "));
    }

    void reservar(String identificador, String fone, int index){
        cliente.set(index, new Cliente(identificador, fone));
    }  
    
    void cancelar(int index){
        cliente.set(index, new Cliente("-", " "));
    }
    
    public String toString(){
        for(Cliente cliente : cliente){
            return  " [" + cliente.identificador + " : " + cliente.fone;
        }
        return " ";
    }
}

public class salaCinema{
    public static void main(String[] args){

    }
}

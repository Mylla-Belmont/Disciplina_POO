import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        Agencia agencia = new Agencia();
        System.out.println("O que deseja?");

        while(true){
            String input = scanner.nextLine();
            String[] entry = input.split("");
            System.out.println("$" + input);

            if(entry[0].equals("break;")){
                break;
            }else if(entry[0].equals("addCliente")){
                agencia.adicionarCliente(entry[1]);
            }else if(entry[0].equals("show")){
                System.out.println(agencia);
            }
        }
        scanner.close();
    }
}   
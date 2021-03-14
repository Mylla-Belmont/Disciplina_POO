import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        Cliente cliente = new Cliente();
        System.out.println("O que deseja?");

        while(true){
            String input = scanner.nextLine();
            String[] entry = input.split("");

            if(entry[0].equals("break;")){
                break;
            }else if(entry[0].equals("add")){
                cliente.cliente(entry[1]);
            }else if(entry[0].equals("show")){
                System.out.println(cliente);
            }
        }
        scanner.close();
    }
}

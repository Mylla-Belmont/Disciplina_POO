import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("O que deseja?");

        while(true){
            String input = scanner.nextLine();
            String[] entry = input.split("");

            if(entry[0].equals("break;")){
                break;
            }else if(entry[0].equals("add")){
                Cliente cliente = new Cliente(entry[1]);
                cliente.cliente(entry[1]);
            }
        }
        scanner.close();
    }
}

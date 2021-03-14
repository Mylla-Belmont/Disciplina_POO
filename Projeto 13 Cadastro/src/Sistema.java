import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("O que deseja?");

        while(true){
            String input = scanner.nextLine();
            String[] entry = input.split("");
            System.out.println("$" + input);

            if(entry[0].equals("break;")){
                break;
            }else if(entry[0].equals("add")){
                
            }else if(entry[0].equals("show")){
                
            }
        }
        scanner.close();
    }
}

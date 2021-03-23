import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        Agencia agencia = new Agencia();

        while(true){
            try{
                String line = scanner.nextLine();
                System.out.println("$" + line);
                String[] ui = line.split(" ");

                if(ui[0].equals("end")){
                    break;
                }else if(ui[0].equals("add")){
                    agencia.adicionarCliente(ui[1]);
                }else if(ui[0].equals("show")){
                    System.out.println(agencia);
                }else if(ui[0].equals("saque")){
                    agencia.contas.get(Integer.parseInt(ui[1])).sacar(Integer.parseInt(ui[2]));
                }else if(ui[0].equals("depositar")){
                    agencia.contas.get(Integer.parseInt(ui[1])).depositar(Integer.parseInt(ui[2]));
                }else if(ui[0].equals("transferir")){
                    agencia.contas.get(Integer.parseInt(ui[1])).transferir(agencia.contas.get(Integer.parseInt(ui[2])), Integer.parseInt(ui[3]));;
                }else{
                    System.out.println("fail: comando invalido");
                }
            }catch(RuntimeException e){
                System.out.println(e.getMessage());
            }
        }
        scanner.close();
    }
}   
import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        Hospital hospital = new Hospital();

        while(true){
            try{
                String line = scanner.nextLine();
                System.out.println("$" + line);
                String[] ui = line.split(" ");

                if(ui[0].equals("end")){
                    break;
                }else if(ui[0].equals("addPacs")){
                    for(int i=0; i < ui[i].length(); i++){
                        String[] info = ui[i].split("-");
                        hospital.addPaciente(new Paciente(info[0], info[1]));
                    }
                }else if(ui[0].equals("addMeds")){
                    for(int i=0; i < ui[i].length(); i++){
                        String[] info = ui[i].split("-");
                        hospital.addMedico(new Medico(info[0], info[1]));;
                    }
                }else
                    System.out.println("fail: comando invalido");
            }catch(RuntimeException e){
                System.out.println(e.getMessage());
            }
        }
        scanner.close();
    }
}
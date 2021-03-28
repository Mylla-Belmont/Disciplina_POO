import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        Hospital hospital = new Hospital();
        BatePapo batePapo = new BatePapo();

        while(true){
            try{
                String line = scanner.nextLine();
                System.out.println("$" + line);
                String ui[] = line.split(" ");

                if(ui[0].equals("end")){
                    break;
                }else if(ui[0].equals("addPacs")){
                    for(int i=1; i < ui.length; i++){
                        String[] info = ui[i].split("-");
                        hospital.addPaciente(new Paciente(info[0], info[1]));
                    }
                }else if(ui[0].equals("addMeds")){
                    for(int i=1; i < ui.length; i++){
                        String[] info = ui[i].split("-");
                        hospital.addMedico(new Medico(info[0], info[1]));;
                    }
                }else if(ui[0].equals("seeAll")){
                    System.out.println(hospital.showAll());
                }else if(ui[0].equals("tie")){
                    for(int i=2; i < ui.length; i++)
                        hospital.vincular(ui[1], ui[i]);
                }else if(ui[0].equals("msg")){
                    for(int i=3; i < ui.length; i++)
                        batePapo.addMessage(new Mensagem(id, msg));
                }else
                    System.out.println("fail: comando invalido");
            }catch(RuntimeException e){
                System.out.println(e.getMessage());
            }
        }
        scanner.close();
    }
}
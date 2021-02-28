import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        
        Agenda agenda = new AgendaPlus();
        agenda.addContato(new ContatoPlus("eva", Arrays.asList(new Fone("oio", "8585"), new Fone("cla", "9999"))));
        agenda.addContato(new ContatoPlus("ana", Arrays.asList(new Fone("Tim", "3434"))));
        agenda.addContato(new ContatoPlus("bia", Arrays.asList(new Fone("viv", "5454"))));
        agenda.addContato(new ContatoPlus("ana", Arrays.asList(new Fone("cas", "4567"), new Fone("oio"," 8754"))));
        System.out.println(agenda);
    }
}

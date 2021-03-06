import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        
        Agenda agenda = new AgendaPlus();
        agenda.addContato(new ContatoPlus("eva", Arrays.asList(new Fone("oio", "8585"), new Fone("cla", "9999"))));
        agenda.addContato(new ContatoPlus("ana", Arrays.asList(new Fone("Tim", "3434"))));
        agenda.addContato(new ContatoPlus("bia", Arrays.asList(new Fone("viv", "5454"))));
        agenda.addContato(new ContatoPlus("ana", Arrays.asList(new Fone("cas", "4567"), new Fone("oio","8754"))));
        System.out.println(agenda);

        agenda.addFavorito("eva");
        agenda.addFavorito("ana");
        agenda.addFavorito("bia");  
        System.out.println(agenda);

        agenda.rmContato("bia");  
        System.out.println(agenda);

        for(Contato favoritos : agenda.getStarred())
            System.out.println(favoritos);
        
        System.out.println("\n");

        agenda.removerFavorito("ana");  
        System.out.println(agenda);
    }
}

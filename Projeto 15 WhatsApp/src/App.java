public class App {
    public static void main(String[] args) throws Exception {
        
        WhatsappService whatsapp = new WhatsappService();

        whatsapp.createUser("goku");
        whatsapp.createUser("sara");
        whatsapp.createUser("tina");
        System.out.println(whatsapp.allUsers());    //ok
        System.out.println("\n");
        
        whatsapp.createChat("goku", "guerreiros");
        whatsapp.createChat("goku", "homens");
        whatsapp.createChat("sara", "familia");
        whatsapp.createChat("sara", "guerreiros");  //ok

        System.out.println(whatsapp.getChatsUser("goku"));
        System.out.println(whatsapp.getChatsUser("sara"));
        System.out.println(whatsapp.getChatsUser("tina"));  //ok
        System.out.println("\n");

        whatsapp.addByInvite("goku", "sara", "guerreiros");
        whatsapp.addByInvite("sara", "tina", "guerreiros");
        whatsapp.addByInvite("tina", "goku", "familia");    //ok

        System.out.println(whatsapp.getChatsUser("sara"));
        System.out.println(whatsapp.getChatsUser("tina"));
        System.out.println(whatsapp.getChatsUser("goku"));
        System.out.println(whatsapp.getUsersChat("guerreiros"));
        System.out.println(whatsapp.getUsersChat("familia"));  //ok
        System.out.println("\n");

        whatsapp.removerUserChat("sara", "guerreiros");
        System.out.println(whatsapp.getUsersChat("guerreiros"));
        System.out.println(whatsapp.getChatsUser("sara"));     //ok
        System.out.println("\n");

        whatsapp.sendMessage("goku", "guerreiros", "oi, eu sou o goku");
        whatsapp.sendMessage("tina", "guerreiros", "oi goku");  //ok

        System.out.println(whatsapp.getNotifyUser("goku"));
        System.out.println(whatsapp.getNotifyUser("tina"));   //ok
        System.out.println("\n");

        System.out.println(whatsapp.readMessageUserChat("goku", "guerreiros"));
        System.out.println(whatsapp.readMessageUserChat("tina", "guerreiros"));
        System.out.println(whatsapp.readMessageUserChat("sara", "guerreiros"));  //ok

        whatsapp.sendMessage("goku", "guerreiros", "vamos sair tina?");
        whatsapp.sendMessage("tina", "guerreiros", "voce ta com fome goku?");
        whatsapp.sendMessage("goku", "guerreiros", "to com saudade de voce.");  //ok

        System.out.println(whatsapp.getNotifyUser("tina"));
        System.out.println(whatsapp.getNotifyUser("goku"));  //ok
        System.out.println("\n");

        System.out.println(whatsapp.readMessageUserChat("goku", "guerreiros"));
        //[tina: voce ta com fome goku?]
        System.out.println(whatsapp.readMessageUserChat("tina", "guerreiros"));
        //[goku: vamos sair tina?]
        //[goku: to com saudade de voce.]
    }
}

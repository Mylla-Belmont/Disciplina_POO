import java.util.ArrayList;

abstract class Contato{
    String name;
    ArrayList<Fone> fones;

    Contato(String name){
        this.name = name;
        this.fones = new ArrayList<>();
    }

    void addFone(String label, String number){
        if(Fone.validate(number)){
            fones.add(new Fone(label, number));
            return;
        } System.out.println("fail: número inválido");
    }

    void rmFone(int index){
        if(fones.get(index) == null){
            fones.remove(index);
            return;
        } System.out.println("fail: contato não existe!");
    }

    abstract boolean setBookmMarks(String name, Contato contato);

    public String toString(){
        StringBuilder saida = new StringBuilder();
        int i=0;
        for (Fone fones : fones) {
            saida.append("[" + i + ":" + fones + "]");
            i++;    
        }
        return saida.toString();
    }
}
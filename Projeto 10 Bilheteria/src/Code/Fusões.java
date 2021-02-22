package Code;

public class Fusões {
    String nomeThis;
    String nomeOther;
    String nomeFusão;

    public Fusões(String nomeThis, String nomeOther){
        this.nomeThis = nomeThis;
        this.nomeOther = nomeOther;
    }

    public void tipoFusão(){
        if(nomeThis.equals("Perola") && nomeOther.equals("Ametista") || nomeThis.equals("Ametista") && nomeOther.equals("Perola")){
            System.out.println("As Gems se fundiram e formarm a Opal!");
        
        }
    }
}

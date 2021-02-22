package Code;

public class Fusões {
    String nomeThis;
    String nomeOther;
    String nomeFusão;

    public Fusões(String nomeThis, String nomeOther){
        this.nomeThis = nomeThis;
        this.nomeOther = nomeOther;
    }

    public int tipoFusão(){
        if(nomeThis.equals("perola") && nomeOther.equals("ametista") || nomeThis.equals("ametista") && nomeOther.equals("perola")){
            System.out.println("As Gems se fundiram e formarm a Opal!");
            return 70;
        }
        if(nomeThis.equals("rubi") && nomeOther.equals("safira") || nomeThis.equals("safira") && nomeOther.equals("rubi")){
            System.out.println("As Gems se fundiram e formarm a Garnet!");
            return 50;
        }
        throw new RuntimeException("As Gemns não podem fundir-se.");
    }
}

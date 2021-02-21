package Code;

public class Fusões {
    String nomeThis;
    String nomeOther;
    String nomeFusão;
    int durabilidade;
    int poderFusão;

    public Fusões(String nomeThis, String nomeOther){
        this.nomeThis = nomeThis;
        this.nomeOther = nomeOther;
    }

    public void tipoFusão(){
        if(nomeThis.equals("Perola") && nomeOther.equals("Ametista") || nomeThis.equals("Ametista") && nomeOther.equals("Perola")){
            nomeFusão = "Opal";
            durabilidade = 20;
            poderFusão = 20;
        }
    }
}

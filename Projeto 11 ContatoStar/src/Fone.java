class Fone{
    String label;
    String number;

    Fone(String label, String number){
        this.label = label;
        this.number = number;
    }

    public static boolean validate(String number){
        String validos = "123456789-()";
        for(int i=0; i < number.length(); i++)
            if(validos.indexOf(number.charAt(i)) == -1)
                return false;
        return true;
    }

    public String toString(){
        return label + ":" + number;
    }
}
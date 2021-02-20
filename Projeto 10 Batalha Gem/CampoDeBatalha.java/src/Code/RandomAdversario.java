package Code;

import java.util.Random;

public class RandomAdversario {
    
    public static void AmetistaAdversario(Ametistas ametista){
        Random random = new Random();
        int movimento = random.nextInt(3);

        switch(movimento){
            case 0:
                ametista.atacar();
                break;
            case 1:
                ametista.usarPoder();
                break;
            case 2:
                ametista.recuperar();
                break;
            //Case 3: fundir
        }
    }
}

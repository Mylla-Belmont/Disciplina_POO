package Code;

import java.util.Random;

public class RandomAdversario {

    public static void PerolaAdversario(Perolas perola){
        Random random = new Random();
        int movimento = random.nextInt(3);

        switch(movimento){
            case 0:
                perola.atacar();
                break;
            case 1:
                perola.usarPoder();
                break;
            case 2:
                perola.recuperar();
                break;
            //Case 3: fundir
        }
    }
    
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

    public static void RubiAdversario(Rubis rubi){
        Random random = new Random();
        int movimento = random.nextInt(3);

        switch(movimento){
            case 0:
                rubi.atacar();
                break;
            case 1:
                rubi.usarPoder();
                break;
            case 2:
                rubi.recuperar();
                break;
            //Case 3: fundir
        }
    }

    public static void SafiraAdversario(Safiras safira){
        Random random = new Random();
        int movimento = random.nextInt(3);

        switch(movimento){
            case 0:
                safira.atacar();
                break;
            case 1:
                safira.usarPoder();
                break;
            case 2:
                safira.recuperar();
                break;
            //Case 3: fundir
        }
    }

    public static void LapisAdversario(Lapis lapis){
        Random random = new Random();
        int movimento = random.nextInt(3);

        switch(movimento){
            case 0:
                lapis.atacar();
                break;
            case 1:
                lapis.usarPoder();
                break;
            case 2:
                lapis.recuperar();
                break;
            //Case 3: fundir
        }
    }

    public static void JasperAdversario(Japers jasper){
        Random random = new Random();
        int movimento = random.nextInt(3);

        switch(movimento){
            case 0:
                jasper.atacar();
                break;
            case 1:
                jasper.usarPoder();
                break;
            case 2:
                jasper.recuperar();
                break;
            //Case 3: fundir
        }
    }
}

//Fazer random para outras

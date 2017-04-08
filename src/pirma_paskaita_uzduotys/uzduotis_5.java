package pirma_paskaita_uzduotys;

import java.util.Scanner;

/**
 * Created by rimvy on 4/8/2017.
 */
/*1.5.  Papildykite 1.4. programą ir realizuokite overload funkcionalumą sumai ir skirtumui.
Vienas sumos metodas turi priimti ir grąžinti int tipo reikšmę, o kitas float. Taip pat ir su skirtumu.
*/
public class uzduotis_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite du skaicius");
        System.out.println("Pirmas skaicius:");
        int pirmasSk = scanner.nextInt();
        float pirmasSkF = scanner.nextFloat();
        System.out.println("Antras skaicius:");
        int antrasSk = scanner.nextInt();
        float antrasSkF = scanner.nextFloat();

        int sumaInt = sumMet(pirmasSk, antrasSk);
        float sumaFloat = sumMetF(pirmasSkF, antrasSkF);

        int skirtumasInt = skirtumMet(pirmasSk, antrasSk);
        float skirtumasFloat = skirtumMetF(pirmasSkF, antrasSkF);

        System.out.println("Ivestu skaiciu suma: " + sumaInt);
        System.out.println("Ivestu skaiciu suma: " + sumaFloat);
        System.out.println("Ivestu skaiciu skirtumas: " + skirtumasInt);
        System.out.println("Ivestu skaiciu skirtumas " + skirtumasFloat);


    }


    public static int sumMet (int pirmasSk, int antrasSk) {
        return pirmasSk + antrasSk;
    }
    public static int skirtumMet (int pirmasSk, int antrasSk){
        return pirmasSk - antrasSk;
    }

    public static float sumMetF (float pirmasSkF, float antrasSkF) {
        return pirmasSkF + antrasSkF;
    }
    public static float skirtumMetF (float pirmasSkF, float antrasSkF){
        return pirmasSkF - antrasSkF;
    }
}

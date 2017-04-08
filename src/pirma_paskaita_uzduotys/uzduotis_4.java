package pirma_paskaita_uzduotys;

import java.util.Scanner;

/**
 * Created by rimvy on 4/8/2017.
 */
/*1.4.  Papildyti 1.3. programą sumos ir skirtumo skaičiavimai turi būti skirtinguose metoduose.
*/
public class uzduotis_4 {

    public static void main(String[] args) {
        System.out.println("Iveskite du skaicius");
        System.out.println("Pirmas skaicius:");
        Scanner scanner = new Scanner(System.in);
        int pirmasSk = scanner.nextInt();
        System.out.println("Antras skaicius:");
        int antrasSk = scanner.nextInt();

        int suma = sumMet(pirmasSk, antrasSk);


        System.out.println("Skaiciu suma: " + suma);
        System.out.println("Skaiciu skirtumas: " + skirtumMet(pirmasSk, antrasSk));
    }

    public static int sumMet (int pirmasSk, int antrasSk) {
        return pirmasSk + antrasSk;
    }
    public static int skirtumMet (int pirmasSk, int antrasSk){
        return pirmasSk - antrasSk;
    }

}

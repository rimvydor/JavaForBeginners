package pirma_paskaita_uzduotys;

import java.util.Scanner;

/**
 * Created by rimvy on 4/8/2017.
 */
/*1.3.  Parašykite programą, kuri paprašytų įvesti vartotojo du skaičius ir atspausdinti jų skirtumą bei sumą
*/
public class uzduotis_3 {
    public static void main(String[] args) {
        System.out.println("Iveskite du skaicius:");
        System.out.println("Pirmas skaicius:");
        Scanner scanner = new Scanner(System.in);
        int pirmasSk = scanner.nextInt();
        System.out.println("Antras skaicius:");
        int antrasSk = scanner.nextInt();

        //int skirtumas = pirmasSk - antrasSk;
        int suma = pirmasSk + antrasSk;

        System.out.println("Ivestu skaiciu skirtumas: " + (pirmasSk - antrasSk));
        System.out.println("Ivestu skaiciu suma: " + suma);
    }
}

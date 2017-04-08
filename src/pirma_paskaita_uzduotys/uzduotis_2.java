package pirma_paskaita_uzduotys;

import java.util.Scanner;

/**
 * Created by rimvy on 4/8/2017.
 */
/*1.2.  Parašyti programą, kuri paprašytų vartotojo įvesti žodį ir atspausdintų kiek simbolių yra tame žodyje.*/
public class uzduotis_2 {
    public static void main(String[] args) {
        System.out.println("Iveskite zodi");
        Scanner scanner = new Scanner(System.in);
        String zodis = scanner.nextLine();
        int simboliaiZodyje = zodis.length();

        System.out.println("Jusu ivestas zodis turi: " + simboliaiZodyje + " " + "simbolius.");
    }
}

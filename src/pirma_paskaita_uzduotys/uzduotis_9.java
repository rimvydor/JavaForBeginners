package pirma_paskaita_uzduotys;

import java.util.Scanner;

/**
 * Created by rimvy on 4/8/2017.
 */
/*1.9.  Papildyti 1.8. programą, parašykite du atskirus metodus,
vienas turi nuskaityti įvestus vartotojo parametrus, kitas paskaičiuotų ir grąžintų vidurkį.
 Rezultatus spausdinti ekrane.
*/
public class uzduotis_9 {
    public static void main(String[] args) {
        System.out.println(ivestiParametrai());

    }

    public  static double ivestiParametrai() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite nuvaziuotus kilometrus:");
        double km = scanner.nextDouble();
        System.out.println("Iveskite kuro sanaudas:");
        double litr = scanner.nextDouble();

        return vks(km, litr);

    }

    public  static double vks (double km, double litr) {
        return (litr * 100) / km;
    }

}

package pirma_paskaita_uzduotys;

import java.util.Scanner;

/**
 * Created by rimvy on 4/8/2017.
 */
/*1.8.  Realizuoti programą, kuri apskaičiuotų kiek automobilis vidutiniškai sunaudoja kuro 100 km.
Programa turi paprašyti vartotojo įvesti nuvažiuotus km ir kuro sąnaudas.
vidurkis = (kuro sąnaudos *100)/ nuvažiuoto atstumo*/
public class uzduotis_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite nuvaziuotus kilometrus:");
        double km = scanner.nextDouble();
        System.out.println("Iveskite kuro sanaudas:");
        double litr = scanner.nextDouble();

        double vidkursan = (litr * 100) / km;

        System.out.println("Vidutines kuro sanaudos: " + vidkursan);
    }
}

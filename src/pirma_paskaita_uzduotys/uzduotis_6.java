package pirma_paskaita_uzduotys;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by rimvy on 4/8/2017.
 */
/*1.6.  Parašyti programą, kuri leistų vartotojui įvesti savo masę ir ūgį,
pagal gautus duomenis paskaičiuotų ir atvaizduotų jo kūno masės indeksą.
KMI = masė (kg) / (ūgis(m))^2
*/
/*1.7.  Realizuoti 1.6. užduotį panaudojant metodą, kurio parametrai būtų masė ir svoris, o grąžinama reikšmė, kūno masės indeksas.
*/
public class uzduotis_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Iveskite savo svori (kg)");
        double svoris = scanner.nextInt();

        System.out.println("Iveskite savo ugi (cm)");
        double ugis = scanner.nextInt();

        double kmi = kmi(svoris, ugis);

        System.out.println("Jusu KMI yra: " + kmi);

    }

    public static double kmi(double svoris, double ugis) {

        return svoris / (ugis * ugis);
    }
}

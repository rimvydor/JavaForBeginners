package pirma_paskaita_uzduotys;

import java.util.Scanner;

/**
 * Created by rimvy on 4/8/2017.
 */
/*1.12. Pakeiskite 1.6. programos kodą, KMI skaičiavimo metodą perkelkite į naujai sukurtą klasę.
 Įvesti parametrai turi būti perduoti per konstruktorių ir sukurtas metodas turi apskaičiuto KMI,
  bet pačiam metodui perduoti parametrų nebereikia.
*/
public class uzduotis_12 {
    public static void main(String[] args) {
        kmiSkaiciavimas kmiSkaiciavimas = new kmiSkaiciavimas();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Iveskite savo svori (kg)");
        double svoris = scanner.nextInt();

        System.out.println("Iveskite savo ugi (cm)");
        double ugis = scanner.nextInt();

        kmiSkaiciavimas.kmi(svoris,ugis);

        //double kmi = kmi(svoris, ugis);

        //System.out.println("Jusu KMI yra: " + kmi);
    }

}

class kmiSkaiciavimas {

    public void kmi(double svoris, double ugis) {
        System.out.println("Jusu KMI yra: " + svoris / (ugis * ugis));
    }
}

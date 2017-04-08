package pirma_paskaita_uzduotys;

import java.util.Scanner;

/**
 * Created by rimvy on 4/8/2017.
 */
/*1.10. Sukurti skaičiuotuvo klasę, kurioje realizuoti statinius metodus sumai, skirtumui, sandaugai.
Per parametrus bus naudojami sveiko tipo skaičiai.*/
/*1.11. Papildyti 1.10. programą, panaudojant metodų perkrovimą (overloading),
sukurti papildomus metodus, kad operacijos veiktų tiek su sveiko tipo skaičiais, tiek su skaičiais po kablelio.
*/
public class uzduotis_10 {
    public static void main(String[] args) {
        Skaiciuotuvas skaiciuotuvas = new Skaiciuotuvas();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pirmas gyvenimo skaiciuotuvas.Demo");
        System.out.println("Iveskite skaiciu:");
        int sk1 = scanner.nextInt();

        System.out.println("Iveskite dar viena skaiciu:");
        int sk2 = scanner.nextInt();

        System.out.println("Iveskite operacijos kuria norite atlikti numeri: sudetis = 1; atimtis = 2; sanduaga = 3.");
        int operacija = scanner.nextInt();

        if(operacija == 1){
            int sum = skaiciuotuvas.sumMet(sk1,sk2);
            System.out.println("Skaiciu suma = " + sum);
        } else if (operacija == 2) {
            int skirt = skaiciuotuvas.skirtMet(sk1, sk2);
            System.out.println("Skaiciu skirtumas = " + skirt);
        } else if (operacija == 3){
            int sand = skaiciuotuvas.sandMet(sk1, sk2);
            System.out.println("Skaiciu sandauga = " + sand);
        }else {
            System.out.println("Pasirinkite tinkama operacijos numeri");
        }
    }



}

class Skaiciuotuvas {

    public int sumMet(int sk1, int sk2){
        return sk1 + sk2;
    }
    public  int skirtMet (int sk1, int sk2){
        return sk1 - sk2;
    }
    public int sandMet (int sk1, int sk2){
        return sk1 * sk2;
    }

    public  float sumMet (float sk1, float sk2){
        return sk1 + sk2;
    }
    public  float skirtMet (float sk1, float sk2){
        return sk1 - sk2;
    }
    public  float sandMet (float sk1, float sk2){
        return sk1 * sk2;
    }
}



package pirma_paskaita_uzduotys;

import java.util.Scanner;

/**
 * Created by rimvy on 4/8/2017.
 */
/*1.13. Parašykite programą kuri paprašytų vartotojo įvesti skaičių kvadrato skaičiavimui.
Skaičiavimams sukurkite naują klasę. Skaičiavimas turi būti atliekas kitame metode ir grąžintu rezultatą.
 Jį spausdinti ekrane. Naudokite formulę rezultatas = a^2
*/
/*1.14. Papildykite 1.13. Programą nauju metodu kuris apskaičiuotu stačiakampio plotą.
Rezultatą spausdinti ekrane. Formulė rezultatas =a*b.*/
  /*1.15. Papildykite 1.13. Programą kuri apskaičiuotu stačiojo trikampio plotą.
    Vartotojo turi būti paprašyta įvesti abi kraštines. Plotas skaičiuojamas kitame metode ir grąžinamas į main metodą.
     Rezultatą spausdinti ekrane. Formulė rezultatas = (a*b)/2;*/

public class uzduotis_13 {
    public static void main(String[] args) {
        Skaiciavimai skaiciavimai = new Skaiciavimai();

        //1.13
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite skaiciu kuri norite pakelti kvadratu");
        int skaicius = scanner.nextInt();
        int kvadratu = Skaiciavimai.skaiciusKvadratu(skaicius);
        System.out.println("Ivestas skaicius kvadratu: " + kvadratu);

        //1.14
        System.out.println("Staciakampio ploto skaiciavimas:");
        System.out.println("Iveskite krastines ilgi: ");
        int krastineA = scanner.nextInt();
        System.out.println("Iveskite kitos krastines ilgi ");
        int krastineB = scanner.nextInt();
        int plotas = Skaiciavimai.staciakampioPlotas(krastineA, krastineB);
        System.out.println("Staciakampio plotas = " + plotas);
        //1.15
        System.out.println("Staciojo trikampio ploto skaiciavimas:");
        System.out.println("Iveskite krastines ilgi");
        int krastinesIlgisA = scanner.nextInt();
        System.out.println("Iveskite krastines ilgi");
        int krastinesIlgisB = scanner.nextInt();
        int trikampioPlotas = Skaiciavimai.trikampioPlotas(krastinesIlgisA, krastinesIlgisB);
        System.out.println("Staciojo trikampio plotas = " + trikampioPlotas);
        //1.16
        System.out.println("Apskritimo ploto skaiciavimas");
        System.out.println("Iveskite apskritimo spinduli:");
        double spindulys = scanner.nextDouble();
        double apsPlotas = Skaiciavimai.apskritimoPlotas(spindulys);
        System.out.println("Apskritimo plotas = " + apsPlotas);
    }
}

class Skaiciavimai {
    //1.13
    public static int skaiciusKvadratu (int skaicius) {
        return skaicius * skaicius;
    }
    //1.14
    public static int staciakampioPlotas (int skaicius1, int skaicius2){
        return skaicius1 * skaicius2;
    }
    //1.15
    public static int trikampioPlotas (int skaicius1, int skaicius2) {
        return (skaicius1*skaicius1) / 2;
    }
    //1.16
    /*1.16. Papildykite 1.13. Programą metodu kuris apskaičiuotu apskritimo plotą.
    Sukurkite naują metodą kuris grąžins rezultatą. Vartotojo turi būti paprašyta įvesti apskritimo spindulį.
     Formulė rezultatas = pi*(a^2). Pi = 3.1415 */
    public  static double apskritimoPlotas (double skaicius3) {
        return 3.1415 * (skaicius3 * skaicius3);
    }


}

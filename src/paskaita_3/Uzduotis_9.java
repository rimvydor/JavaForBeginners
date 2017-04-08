package paskaita_3;

import java.util.Scanner;

/**
 * Created by rimvy on 4/7/2017.
 */
/*1.9.  Sukurti supaprastintą skaičiuoklės programą kuri paprašytų įvesti du skaičius ir operacijos tarp jų
 skaičių (1 – suma, 2 – skirtumas, 3 – sandauga). Gautą rezultatą programa pavaizduotų ekrane ir paklaustų
  ar norėsime kartoti. Įvedus skaičių 5, programa turėtų kartoti darbą iš naujo,
   priešingu atveju programa baigtų darbą.
*/
public class Uzduotis_9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double firstNumb = getCorrectNumber(sc);


        double secondNumb = getCorrectNumber(sc);


        System.out.println("iveskite komanda pvz:(+; -; *; /):");
        String action = sc.next();

        calculator(firstNumb, secondNumb, action);

    }

    private  static  double getCorrectNumber(Scanner scanner){
        while (true){
            System.out.println("iveskite skaiciu");
            try {
                double numb = scanner.nextDouble();
                return numb;
            }catch (Exception e) {
                System.out.println("Ka tu darai?");
                scanner.nextLine();
            }
        }
    }

    private  static void calculator(double firstNumb, double secondNumb, String action) {

        switch (action){
            case "+":
                sumMet(firstNumb, secondNumb);
                break;
            case "-":
                minusMet(firstNumb,secondNumb);
                break;
            case "*":
                multMet(firstNumb, secondNumb);
                break;
            case "/":
                divMet(firstNumb, secondNumb);
                break;
            default:
                System.out.println("komanda nerasta");
                break;
        }

    }

    private  static void sumMet(double firstNumb, double secondNumb) {
        System.out.println("suma yra: " + (firstNumb + secondNumb));
    }
    private  static void minusMet(double firstNumb, double secondNumb) {
        System.out.println("skirtumas yra: " + (firstNumb - secondNumb));
    }
    private  static void multMet(double firstNumb, double secondNumb) {
        System.out.println("daugyba yra: " + (firstNumb * secondNumb));
    }
    private  static void divMet(double firstNumb, double secondNumb) {
        if (secondNumb != 0) {
            System.out.println("dalyba yra: " + (firstNumb / secondNumb));
        }else {
            System.out.println("dalyba is 0 negalima");
        }
    }

}

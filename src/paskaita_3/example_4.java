package paskaita_3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by rimvy on 4/6/2017.
 */
public class example_4 {
    // Papildykite 1.3. programą kuri neleistu įvesti ne skaičius,
    // jei vartotojas įveda ne skaičių programa prašo pakartoti tol kol bus įvestas skaičius.


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite skaiciu");

        int sum = 0;
        int numb = 0;

        while (true)   {
            try {
                numb = sc.nextInt();
                if (numb == 0) {
                    System.out.println("ivestu skaiciu suma: " + sum);
                    break;
                }
                sum += numb;
                System.out.println("Iveskite kita skaiciu");
            } catch (InputMismatchException e) {
                System.out.println("Reikia ivesti skaiciu");
                sc.nextLine();
            }
        }

    }

}
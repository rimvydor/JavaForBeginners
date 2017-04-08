package paskaita_3;

import java.util.Scanner;

/**
 * Created by rimvy on 4/7/2017.
 */
//1.5.  Parašyti programą, kuri paprašytų įvesti 5 skaičius.
// Baigus skaičių įvedimą, turi būti atvaizduojama įvestų skaičių suma ir visi įvesti skaičiai.

public class Example_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite 5 skaicius");


        int[] masyvas = new int[5];
        int sum = 0;

        for (int i=0; i<masyvas.length; i++){
            masyvas[i]=scanner.nextInt();
          /*  System.out.println("ivestas skaicius " + masyvas[i]);*/

            sum = sum + masyvas[i];

        }
        System.out.println("skaiciu suma " + sum);

        for (int i=0; i<masyvas.length; i++){
            System.out.println("masyvas["+i+"] yra: " + masyvas[i]);
        }




    }

}


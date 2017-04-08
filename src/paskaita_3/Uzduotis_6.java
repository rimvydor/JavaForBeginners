package paskaita_3;

import java.util.Scanner;

/**
 * Created by rimvy on 4/7/2017.
 */
 /* 1.6.  Parašyti programą kuri paprašytų vartotojo įvesti  5 žodžius.
 Po to kai bus įvesti visi žodžiai, jie turi būti atvaizduojami.*/
public class Uzduotis_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String [] array = new String[5];


        for (int i=1; i<array.length; i++){
            System.out.println("Iveskite zodi nr " + i);
            String zodis = scanner.nextLine();
            array[i-1] = zodis;

        }
        for (int i=0; i<array.length; i++){
            System.out.println("Ivesti zodziai yra: " + array[i]);
        }


    }


}

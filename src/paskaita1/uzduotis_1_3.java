package paskaita1;

import java.util.Scanner;

/**
 * Created by rimvy on 4/5/2017.
 */
public class uzduotis_1_3 {

    public static void main(String[] args){

        FirstClass skaiciai = new FirstClass();

        Scanner scanner = new Scanner(System.in);

        skaiciai.twoNumbers(scanner);
    }
}

class FirstClass {

    public void twoNumbers (Scanner numbers){
        System.out.println("Please enter first number");
        int number1 = numbers.nextInt();
        System.out.println("Please enter second number");
        int number2 = numbers.nextInt();
        int suma = number1 + number2;
        int skirtumas = number1 - number2;
        System.out.println("suma: " + suma);
        System.out.println("skirtumas: " + skirtumas);
    }
}
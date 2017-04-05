package paskaita1;

import java.util.Scanner;

/**
 * Created by rimvy on 4/5/2017.
 */
public class uzduotis_1_4 {
    public static void main(String[]args) {
        
        SumosSkaiciavimas suma = new SumosSkaiciavimas();
        SkirtumoSkaiciavimas skirtumas = new SkirtumoSkaiciavimas();

        Scanner scanner = new Scanner(System.in);

        suma.twoNumbers(scanner);
        skirtumas.twoNumber(scanner);
    }
}

class SumosSkaiciavimas {
    public void twoNumbers(Scanner numbers) {
        System.out.println("Please enter first number");
        int number1 = numbers.nextInt();
        System.out.println("Please enter second number");
        int number2 = numbers.nextInt();
        int sum = number1 + number2;
        System.out.println("Suma: " + sum);
    }
}
class SkirtumoSkaiciavimas {
    public void twoNumber(Scanner numbers) {
        System.out.println("Please enter first number");
        int number1 = numbers.nextInt();
        System.out.println("Please enter second number");
        int number2 = numbers.nextInt();
        int skirtum = number1 - number2;
        System.out.println("Skirtumas: " + skirtum);
    }
}

package paskaita_3;

import java.util.Scanner;

/**
 * Created by rimvy on 4/6/2017.
 */
public class example_3 {
    // Parašyti programą, kuri paprašytų vesti skaičius tol, kol bus įvestas skaičius 0.
    // Pabaigoje turi būti atvaizduojama įvestų skaičių suma.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        while (true){
            System.out.println("Iveskite skaiciu");
            int numb = sc.nextInt();
            sum += numb;
            if (numb==0){
                System.out.println("ivestu skaiciu suma: " + sum);
                break;
            }
        }
    }



}

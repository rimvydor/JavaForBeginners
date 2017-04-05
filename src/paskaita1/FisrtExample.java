package paskaita1;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by rimvy on 4/4/2017.
 */
public class FisrtExample {

    public static void main(String[] args) {
        System.out.println("Hi Rimvydas");
        FirstExampleSupportClass example = new FirstExampleSupportClass();
        /*example.sayHi();
        int sum = example.sum(10, 20);
        //System.out.println(example.sum(10 + 20));
        System.out.println(sum);*/

        Scanner scanner = new Scanner(System.in);
        /*System.out.println("Please insert a number");
        int insertedNumb = scanner.nextInt();
        System.out.println("Vardas >> " + insertedNumb);*/

       /* example.userName(scanner);*/
        /*example.enterWord(scanner);*/
      /*  example.enterNumb(scanner);*/
    }

}

class FirstExampleSupportClass {

    public void enterNumb (Scanner numb) {
        System.out.println("Enter first number");
        int number1 = numb.nextInt();
        System.out.println("Enter second number");
        int number2 = numb.nextInt();
        int suma = number1 + number2;
        int skirtumas = number1 - number2;
        System.out.println("suma " + suma);
        System.out.println("skirtumas " + skirtumas);

    }



    public void enterWord (Scanner word) {
        System.out.println("Enter a word");
        String petras = word.nextLine();
        System.out.println("Ilgis yra " + petras.length());
    }

    public void userName (Scanner sc) {
        System.out.println("Please insert your name");
        String name = sc.nextLine();
        System.out.println("Hi " + name);
    }

    public void sayHi() {
        System.out.println("Labas");
    }

    public int sum(int firstNumb, int secondNumb) {
        return firstNumb + secondNumb;

    }
}

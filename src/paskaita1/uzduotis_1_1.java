package paskaita1;

import java.util.Scanner;

/**
 * Created by rimvy on 4/5/2017.
 */
public class uzduotis_1_1 {

    public static void main(String[] args){

        FirstExampleClass exampleClass = new FirstExampleClass();
        Scanner scanner = new Scanner(System.in);

        exampleClass.userName(scanner);
    }
}

class FirstExampleClass {

    public void userName (Scanner uname){
        System.out.println("Please enter your name");
        String name = uname.nextLine();
        System.out.println("Hello " + name);
    }
}
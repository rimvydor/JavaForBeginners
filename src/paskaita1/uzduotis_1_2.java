package paskaita1;

import java.util.Scanner;

/**
 * Created by rimvy on 4/5/2017.
 */
public class uzduotis_1_2 {

    public static void main(String[] args){

        FirstClassExample classExample = new FirstClassExample();

        Scanner scanner = new Scanner(System.in);

        classExample.enterWord(scanner);

    }
}

class FirstClassExample {

    public void enterWord (Scanner word){
        System.out.println("Please enter a word");
        String zodis = word.nextLine();
        System.out.println("Word lenght is " + zodis.length());
    }
}
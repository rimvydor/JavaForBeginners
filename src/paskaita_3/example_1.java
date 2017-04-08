package paskaita_3;

import java.util.Scanner;

/**
 * Created by rimvy on 4/6/2017.
 */
public class example_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Irasykite norima skaiciu");
        int numb = sc.nextInt();

        if(numb%2==0){
            System.out.println("Skaicius yra lyginis");
        }else{
            System.out.println("Skaicius yra nelyginis");
        }

    }


}

package paskaita_3;

import java.util.Scanner;

/**
 * Created by rimvy on 4/6/2017.
 */
public class example_2 {
    //1.2.  Parašyti programą kuri paprašytų vartotojo įvesti žodį ir jį iš karto atvaizduotų,
    // tada vėl paprašytų įvesti kitą žodį, jį atvaizduotų,
    // ir procesą kartotų tol, kol nebus įvestas žodis „pabaiga“.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //do while

        String word = "";
        do {
            System.out.println("Iveskite zodi: ");
            word = sc.nextLine();
            System.out.println("zodis " + word);
        } while (!word.equals("pabaiga"));
    }
}

       /* *//*while (true){
            System.out.println("Iveskite zodi: ");
            String zodis = sc.nextLine();
            System.out.println("zodis " + zodis);
            if ("pabaiga".equals(zodis)){
                break;
            }
        }*//*
    }
}*/



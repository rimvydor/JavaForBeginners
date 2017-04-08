package pirma_paskaita_uzduotys;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

/**
 * Created by rimvy on 4/8/2017.
 */
/*1.1.  Parašyti programą, kuri paprašytų vartotojo įvesti savo vardą ir jį atspausdintų penkis kartus.
*/
public class uzduotis_1 {

    public static void main(String[] args) {
        System.out.println("Iveskite savo varda: ");
        Scanner scanner = new Scanner(System.in);
        String  ivestasVardas = scanner.nextLine();

        System.out.println("Jusu ivestas vardas atspausdintas 5 kartus: " + ivestasVardas + " " + ivestasVardas + " " + ivestasVardas + " " + ivestasVardas + " " + ivestasVardas);
    }
}

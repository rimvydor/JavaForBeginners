package paskaita_3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by rimvy on 4/6/2017.
 */
public class FistExample {
    public static void main(String[] args) {


        int a = 30;
        int b = 40;

        if (a >= b) {
            System.out.println("Taip tai tiesa");
        } else {
            System.out.println("Ne ne");
        }
        System.out.println("Value is >> " + (a < b ? 120 : 100)); //120 spausdins jei if 100 jei else

        // jei pirma salyga tenkina, toliau neziuri. jei pirma netenkina ziuri i antra jei ji netenkita lieka else
        if (a < b) {
            System.out.println("Tiesa");
        } else if (a != b) {
            System.out.println("Tiesa2");
        } else {
            System.out.println("Ne");
        }

        //switch

        int val = 6;

        switch (val) {
            case 1:
                System.out.println("radome 1");
                break;
            case 2:
                System.out.println("radome 2");
                break;
            case 3:
                System.out.println("radome 3");
                break;
            default:
                System.out.println("nieko neradome");
                break;
        }

        // try catch metodo iskvietimas
        exeptionExample();

        //masyvo metodo iskvietimas
        masExample();
    }


    // masyvo metodas
    private static void masExample() {
        int[] mas = new int[3];

        // reiksmes idejimas i masyva
        mas[0] = 12;
        mas[1] = 1;
        mas[2] = 5;

        //reiksmes paemimas is masyvo

        System.out.println("1 reiksme yra: " + mas[0]);
        printMas(mas);
    }

    //naujas metodas kuris atspausdins per parametrus paduota integer masyva
    private static void printMas(int[] mas){
        for(int i = 0; i < mas.length; i++){
            System.out.println("mas["+i+"] yra >>" + mas[i]);
        }

    }

    // try catch metodas
    private static void exeptionExample() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Irasykite skaiciu");

        try {
            int numb = sc.nextInt();
            System.out.println("Jusu skaicius yra >>" + numb);
        } catch (InputMismatchException e) {
            System.out.println("Juk prasiau skaiciu rasyt");
        }
    }

}


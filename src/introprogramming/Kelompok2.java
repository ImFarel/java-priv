package introprogramming;

import java.util.Scanner;

/**
 *
 * @author KILLFAREWELL
 */
public class Kelompok2 {

    /**
     * Double Or Float Its produce same result But both have different Memory
     * Capacity yeah thats as long as i know guys.
     *
     * @param args
     */
    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        System.out.println("Hello");
        System.out.println("1 Kilogram = 2 pon ");
        System.out.println("1 pon = 5 ons ");
        System.out.println("1 ons = 100 gram ");
        System.out.println("Input Angka");
        Double input_double = new Double(sn.nextLine());

        Double pound_double = input_double * 2;
        Double ons_double = pound_double * 5;
        Double gram_double = ons_double * 100;

        int input = pound_double.intValue();
        int pound = pound_double.intValue();
        int ons = ons_double.intValue();
        int gram = gram_double.intValue();

        System.out.println(input + " Kilogram sama dengan = " + pound + " pound atau " + ons + " ons atau " + gram + " gram ");
    }
}

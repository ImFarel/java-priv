package introprogramming;

import java.util.Scanner;

/**
 *
 * @author KILLFAREWELL
 */
public class TestKasus {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("input 3 angka : ");
        String angka = sn.nextLine();
        String[] kumpul = angka.split("(?<=\\G.{1})");// Delimiter All after character after 1 pass
        int a = Integer.parseInt(kumpul[0]);
        int b = Integer.parseInt(kumpul[1]);
        int c = Integer.parseInt(kumpul[2]);
        int d = a + b + c;
        System.out.println(d);

    }

}

package introprogramming;

import java.util.Random;
import java.util.Scanner;

public class IntroProgramming {

    public static void main(String[] args) throws Exception {
        Scanner sn = new Scanner(System.in);
        int acak;
        System.out.print("Masukkan bilangan a: ");
        int a = Integer.parseInt(sn.nextLine());
        System.out.print("Masukkan bilangan b: ");
        int b = Integer.parseInt(sn.nextLine());
        Random rand = new Random();
        if (a >= b) {
            acak = rand.nextInt(a - b + 1) + b;
        } else {
            acak = rand.nextInt(b - a + 1) + a;
        }
        if ((acak % 2) == 0) {//mengecek angka genap
            System.out.print("Hasil Random bilangan genap: " + acak);
        } else {
            System.out.print("Hasil Random bilangan genap: " + (acak + 1));
            sn.close();
        }
    }
}

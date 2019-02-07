package introprogramming;

import java.util.Scanner;

public class Pangkat {
    public static void main(String[] args) {
        int a, b, c;
        a = 1;
        b = a * a;
        Scanner reader = new Scanner(System.in);
        System.out.print("input: ");
        c = reader.nextInt();

        while (b <= c) {
            System.out.print(b + ", ");
            a++;
            b = a * a;
        }

    }
}

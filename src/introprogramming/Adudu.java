package introprogramming;

import java.util.Scanner;

public class Adudu {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.print("input: ");
        int in;
        in = r.nextInt();

        for (int i = 0; i < in; i++) {
            for (int j = 0; j < in; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}

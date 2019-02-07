/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introprogramming;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class dwa {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int nominal = 0;

        do {
            System.out.print("Msukan nlai: ");
            try {
                nominal = sn.nextInt();
            } catch (Exception e) {
                System.out.println("Hanya Boleh angka");
                sn.nextLine();
            }
        } while (nominal < 1000);

    }
}

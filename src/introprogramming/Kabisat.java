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
public class Kabisat {
    public static void main(String[] args) {
        int th;
        Scanner sn = new Scanner(System.in);
        System.out.println("Input tahun maka saya trawang tipe tahun ini:");
        th = sn.nextInt();
        if (th % 400 == 0) {
            if (th % 100 == 0) {
                if (th % 4 == 0) {
                    System.out.println("ITS KABISATT");
                }
            }
        } else {
            System.out.println("ITS BIASA");
        }
    }
}

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
public class Besarkecil {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Angka untuk Variabel A");
        int a = Integer.parseInt(sn.nextLine());
        System.out.println("Angka untuk Variabel B");
        int b = Integer.parseInt(sn.nextLine());
        if (a > b) {
            System.out.println(a + " Lebih besar");
        } else {
            System.out.println(b + " Lebih besar");
        }
    }
}

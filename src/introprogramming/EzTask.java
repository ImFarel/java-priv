/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introprogramming;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class EzTask {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int menu = 0;
        int n1, n2;

        EzTask kelas = new EzTask();
        System.out.println("Welc to SimsApps");
        System.out.println("Menus");
        System.out.println("1. Random Data");
        System.out.println("2. Sims of Bubble Sort - Asc");
        System.out.println("3. Sims of Selection Sort - Asc");
        System.out.println("4. Sims of Bubble Sort - Desc");
        System.out.println("5. Sims of Selection Sort - Desc");
        System.out.println("6. Exit  ");
        System.out.print("Masukkan Pilihan Anda: ");

        try {
            menu = sn.nextInt();

        } catch (Exception e) {
            System.out.println("!Harus yang ada di menu!");
            System.out.print("Masukkan Pilihan Anda: ");
            sn.nextLine();

        }
        switch (menu) {
            //Random Data
            case 1: {
                System.out.print("Batas atas :");
                n1 = sn.nextInt();
                System.out.print("Batas bawah :");
                n2 = sn.nextInt();
                kelas.getRanNum(n1, n2);
            }
            // bubble asc
            case 2: {


            }
            //selc asc
            case 3: {

            }
            //buuble dsc
            case 4: {

            }
            //selc dsc
            case 5: {

            }
        }
    }

    /*
    t(n) = (n - 1 ) (n - 1) c
         = cn^2 - 2cn + 1
         = 0(n^2)
     */
    public void bubbleAsc(int[] arr) {
        int n = arr.length;
        int tmp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - 1); j++) {
                if (arr[j - 1] > arr[j]) {
                    tmp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = tmp;
                }
                System.out.printf(" ", i + 1, Arrays.toString(arr));

            }
        }
    }
    public void getRanNum(int below, int up) {
        if (below >= up) {
            throw new IllegalArgumentException("Batas atas harus lebih besar dari bawah");
        }
        String number = "";
        Random ran = new Random();
        for (int i = 0; i < 4; i++) {
            int thut = ran.nextInt((up - below) + 1) + below;
            System.out.print(thut + " ");
        }
    }
}

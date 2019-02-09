/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author FarewellBattleStation
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
        System.out.println("2. Sim's of Bubble Sort - Asc");
        System.out.println("3. Sim's of Selection Sort - Asc");
        System.out.println("4. Sim's of Bubble Sort - Desc");
        System.out.println("5. Sim's of Selection Sort - Desc");
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
                System.out.println(kelas.getRanNum(n1, n2));
                break;
            }
            // bubble asc
            case 2: {
                System.out.print("Batas atas :");
                n1 = sn.nextInt();
                System.out.print("Batas bawah :");
                n2 = sn.nextInt();
                int[] arr = convertIntegers(kelas.getRanNum(n1, n2));
                System.out.print("Deret : ");
                //Before
                kelas.printArray(arr);
                kelas.bubbleSort(arr, true);
                //After
                kelas.printArray(arr);
                break;
            }
            //selc asc
            case 3: {
                System.out.print("Batas atas :");
                n1 = sn.nextInt();
                System.out.print("Batas bawah :");
                n2 = sn.nextInt();
                int[] arr = convertIntegers(kelas.getRanNum(n1, n2));
                System.out.print("Deret : ");
                //Before
                kelas.printArray(arr);
                kelas.selectionSort(arr, true);
                break;
            }
            //buuble dsc
            case 4: {
                System.out.print("Batas atas :");
                n1 = sn.nextInt();
                System.out.print("Batas bawah :");
                n2 = sn.nextInt();
                int[] arr = convertIntegers(kelas.getRanNum(n1, n2));
                System.out.print("Deret : ");
                //Before
                kelas.printArray(arr);
                kelas.bubbleSort(arr, false);
                //After
                kelas.printArray(arr);
                break;
            }
            //selc dsc
            case 5: {
                System.out.print("Batas atas :");
                n1 = sn.nextInt();
                System.out.print("Batas bawah :");
                n2 = sn.nextInt();
                int[] arr = convertIntegers(kelas.getRanNum(n1, n2));
                System.out.print("Deret : ");
                //Before
                kelas.printArray(arr);

            }
            break;
        }
    }

    /*
     * t(n) = (n - 1 ) (n - 1) c
     *      = cn^2 - 2cn + 1
     *      = 0(n^2)
     */
    private static void bubbleSort(int[] input, boolean ascending) {
//        int n = arr.length;
//        boolean is_sorted;
//        int tmp = 0;
//        for (int i = 0; i < n; i++) {
//            is_sorted = true;
//
//            for (int j = 1; j < (n - 1); j++) {
//                if (ascending) {
//                    if (arr[j - 1] > arr[j]) {
//                        tmp = arr[j - 1];
//                        arr[j - 1] = arr[j];
//                        arr[j] = tmp;
//                        is_sorted = false;
//
//                    }
//                } else {
//                    if (arr[j - 1] < arr[j]) {
//                        tmp = arr[j - 1];
//                        arr[j - 1] = arr[j];
//                        arr[j] = tmp;
//                        is_sorted = false;
//
//                    }
//                }
//
//                System.out.println(Arrays.toString(arr));
//                if (is_sorted) {
//                    break;
//                }
//            }
//        }
        int inputLength = input.length;
        int temp;
        boolean is_sorted;
        EzTask kelas = new EzTask();

        for (int i = 0; i < inputLength; i++) {

            is_sorted = true;

            for (int j = 1; j < (inputLength - i); j++) {

                if (ascending) {
                    if (input[j - 1] > input[j]) {
                        temp = input[j - 1];
                        input[j - 1] = input[j];
                        input[j] = temp;
                        is_sorted = false;
                    }
                    kelas.printArray(input);

                } else {
                    if (input[j - 1] < input[j]) {
                        temp = input[j - 1];
                        input[j - 1] = input[j];
                        input[j] = temp;
                        is_sorted = false;
                    }

                }

            }

            if (is_sorted) {
                break;
            }

        }


    }

    private void selectionSort(int[] arr, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public ArrayList<Integer> getRanNum(int below, int up) {
        if (below >= up) {
            throw new IllegalArgumentException("Batas atas harus lebih besar dari bawah");
        }
        String number = "";
        Random ran = new Random();
        ArrayList<Integer> num = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int thut = ran.nextInt((up - below) + 1) + below;
            num.add(thut);
        }
        return num;
    }

    //Helpers
    public static int[] convertIntegers(List<Integer> integers) {
        int[] ret = new int[integers.size()];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = integers.get(i).intValue();
        }
        return ret;
    }

    private void printArray(int[] array) {
        String result = Arrays.stream(array)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining("    "));
        System.out.println(result);

    }
}

package introprogramming;

import java.util.ArrayList;
import java.util.Scanner;

public class tugas2 {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int menu = 0;
        int n1 = 0;
        int n2 = 0;
        tugas2 kelas = new tugas2();
        System.out.println("Menu Hari ini");
        System.out.println("1. Penjumlahan Bilangan Prima ");
        System.out.println("2. Jumlah Bilangan Prima  ");
        System.out.println("3. Exit  ");
        System.out.print("Masukkan Pilihan Anda: ");
        try {
            menu = sn.nextInt();
        } catch (Exception e) {
            System.out.println("Hanya boleh angka");
            sn.nextLine();

        }
        switch (menu) {
            case 1: {
                System.out.print("NIlai pertama: ");

                try {
                    n1 = sn.nextInt();
                } catch (Exception e) {
                    System.out.println("Hanya boleh angka");
                    sn.nextLine();

                }
                System.out.print("NIlai kedua: ");
                try {
                    n2 = sn.nextInt();
                } catch (Exception e) {
                    System.out.println("Hanya boleh angka");
                    sn.nextLine();
                }
                kelas.opt1(n1, n2);
                break;
            }
            case 2: {
                System.out.print("NIlai pertama: ");

                try {
                    n1 = sn.nextInt();
                } catch (Exception e) {
                    System.out.println("Hanya boleh angka");
                    sn.nextLine();

                }
                System.out.print("NIlai kedua: ");
                try {
                    n2 = sn.nextInt();
                } catch (Exception e) {
                    System.out.println("Hanya boleh angka");
                    sn.nextLine();
                }
                kelas.opt2(n1, n2);
                break;
            }
            case 3: {
                System.exit(0);
            }
            break;
        }
    }

    public void opt1(int n1, int n2) {
        int i, j;
        ArrayList<Integer> num = new ArrayList<>();
        boolean flag;
        for (i = n1; i <= n2; i++) {
            flag = false;
            if (i == 2) {
                flag = true;
            } else {
                for (j = 2; j < i; j++) {
                    if (i % j == 0) {
                        flag = false;
                        break;
                    } else {
                        flag = true;
                        }
                }
            }
            if (flag) {
                num.add(i);
            }
        }
        int hasil = 0;
        for (int x : num) {
            hasil += x;
        }
        System.out.println(num);
        System.out.println("penjumlahan bil prima: " + hasil);
    }

    public void opt2(int n1, int n2) {
        int i, j;
        ArrayList<Integer> num = new ArrayList<>();
        boolean flag;
        for (i = n1; i <= n2; i++) {
            flag = false;
            if (i == 2) {
                flag = true;
            } else {
                for (j = 2; j < i; j++) {
                    if (i % j == 0) {
                        flag = false;
                        break;
                    } else {
                        flag = true;
                    }
                }
            }
            if (flag) {
                num.add(i);
            }
        }
        int hasil = num.size();
        System.out.println(num);
        System.out.println("jumlah bil prima: " + hasil);
    }
}

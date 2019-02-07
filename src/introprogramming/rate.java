package introprogramming;

import java.util.Calendar;
import java.util.Scanner;

public class rate {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int year = Calendar.getInstance().get(Calendar.YEAR);
        String nama;
        int tahun;
        System.out.print("Nama: ");
        nama = sn.nextLine();
        System.out.print("Tahun Lahir: ");
        tahun = sn.nextInt();

        int categories = year - tahun;

        if (categories > 21) {
            System.out.println(nama + ", Anda Berumur " + categories + " dapat menonton dengan klasifikasi SU, 13+,17+, dan 21+");
        } else if (categories > 17) {
            System.out.println(nama + ", Anda Berumur " + categories + " dapat menonton dengan klasifikasi SU, 13+ dan 17+");
        } else if (categories > 13) {
            System.out.println(nama + ", Anda Berumur " + categories + " dapat menonton dengan klasifikasi SU dan 13+");
        } else {
            System.out.println("Adik " + nama + ",Berumur " + categories + " hanya dapat menonton dengan klasifikasi SU");
        }
    }
}

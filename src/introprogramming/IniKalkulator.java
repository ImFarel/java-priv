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
public class IniKalkulator {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int angka1 = 0;
        int angka2 = 0;

        System.out.println("========KALKULATHOR========");
        System.out.println("KALKULATHOR");
        System.out.print("INPUT ANGKA pertama : ");
        angka1 = sn.nextInt();
        System.out.print("INPUT ANGKA perdua : ");
        angka2 = sn.nextInt();
        System.out.print("INPUT OPERATOR( +(tambah) , -(kurang) , *(kali) , /(bagi)) : ");
        String op = sn.next();
        IniKalkulator kelas = new IniKalkulator();
        if (kelas.filterOperator(angka1, angka2, op) != 0) {
            System.out.println("HASIL DARI " + angka1 + op + angka2 + " ADALAH " + kelas.filterOperator(angka1, angka2, op));
        } else {
            System.out.println(kelas.filterOperator(angka1, angka2, op));
//            System.out.println("OPERATOR TIDAK SESUAIII");
        }

    }

    int filterOperator(int nilai1, int nilai2, String operator) {
//        String operators = String.valueOf(operator);
        String tambah = "+";
        String kurang = "-";
        String kali = "*";
        String bagi = "/";

        if (operator == tambah) {
            return Integer.sum(nilai2, nilai1);
        } else if (kurang == operator) {
            return nilai1 - nilai2;
        } else if (operator == kali) {
            return nilai1 * nilai2;
        } else if (operator == bagi) {
            return nilai1 / nilai2;
        }
            return 0;
//        return operator == String.valueOf("")? 1 : 0;
//            return "/" == "/" ? 1 : 0;

    }
}

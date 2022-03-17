/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mang_vonglap;

import java.util.Scanner;

public class mang {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tong = 0, dem = 0;
        for (int i = 27; i < 250; i++) {
            if (i % 3 == 0) {
                tong += i;
                dem++;
            }
        }
        System.out.println("trung binh cong các so chia het cho 3 la  " + tong / dem);

    }
}

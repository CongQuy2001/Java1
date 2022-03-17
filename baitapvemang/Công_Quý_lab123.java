/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapvemang;

import java.util.Scanner;

/**
 *
 * @author JosCongQuy
 */
public class Công_Quý_lab123 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("mơi bạn nhập số lượng tên bồ ");
        int size = Integer.parseInt(sc.nextLine());
        String ten[] = new String[size];
        int tuoiBo[] = new int[size];
        int vongBo[] = new int[size];
        int tongTuoi = 0;
        int tongVong = 0;
        for (int i = 0; i < size; i++) {
            System.out.println("mời bạn nhập tên bồ" + (i + 1));
            ten[i] = sc.nextLine();
            System.out.println("mời bạn nhập tuổi bồ" + (i + 1));
            tuoiBo[i] = Integer.parseInt(sc.nextLine());
            System.out.println("mời bạn nhập số vòng" + (i + 1));
            vongBo[i] = Integer.parseInt(sc.nextLine());
            tongTuoi += tuoiBo[i];
            tongVong += vongBo[i];
        }
        int i;
        System.out.println("tuoi cua tat ca cac bo " + (tongTuoi / size));
        System.out.println(" tb số đo vòng 1 của tất cả các bồ:   " + (tongVong / size));
        for (i = 0; i < size; i++) {
            if (tuoiBo[i] % 2 == 0) {
                System.out.println("số tuổi chia hết cho 2 là " + ten[i]);
            }
        }
        int max = 0;
        int c = 0;
        for (i = 0; i < size; i++) {
            if (max < vongBo[i]) {
                max = vongBo[i];
                c = i;
            }
        }
        System.out.println("tuoi " + tuoiBo[c]);

    }
}

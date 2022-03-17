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
public class bai2 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("mời bạn nhập số thành viên");
        int size = sc.nextInt();
        sc.nextLine();
        String name[] = new String[size];
        int age[] = new int[size];
        int max = age[0];
        for (int i = 0; i < size; i++) {
            System.out.println("mời bạn nhập tên thành viên " + (i + 1));
            name[i] = sc.nextLine();
            System.out.println("mời bạn nhập tuổi thành viên " + (i + 1));
            age[i] = sc.nextInt();
            sc.nextLine();
                    

            if (max < age[i]) {
                max = age[i];
            }
        }
        System.out.println("thông tin tên tuổi của các thành viên");

        for (int i = 0; i < size; i++) {
            System.out.println(name[i] + "  có số tuổi là " + age[i]);

        }
        System.out.print("tuổi lớn nhất là:  "+max);
     
    }
}

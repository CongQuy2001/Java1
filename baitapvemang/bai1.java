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
public class bai1 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("mời bạn nhập  số phần tử");
        int size = sc.nextInt();

        System.out.println("mời bạn nhập phần tử mảng");
        double a[] = new double[size];
        double max = a[0];
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextDouble();
            if (max < a[i]) {
                max = a[i];
            }
        }

        System.out.print("những cân nặng lớn hơn 50: ");
        int count2 = 0;
        int count50 = 0;
//        tim so luong lon hon 50
        for (int i = 0; i < size; i++) {
            if (a[i] > 50) {
                count50++;
            }
           if(a[i] % 2 == 0) {
                count2++;
           }
        }
        int countt50 = 0;
        for (int i = 0; i < size; i++) {
            if (a[i] > 50) {
                System.out.print(a[i]);
                if (countt50 < count50 - 1) {
                    System.out.print(" ;");
                }
                countt50++;
                
            }
        }
          System.out.println("");
        int coutn = 0;
        System.out.print(" số cân nặng chia hết cho 2 là:  ");
        for (int i = 0; i < size; i++) {
            if (a[i] % 2 == 0) {
                System.out.print(a[i]);
                if (coutn < count2 - 1) {
                      System.out.print(";");
                }
                coutn++;
            }
        }
        System.out.println("");
        System.out.println("số cân nặng lớn nhất là:  "+max);
    }
}

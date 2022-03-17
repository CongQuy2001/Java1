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
class bai3 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("mời bạn nhập phần tử  ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int max, min;
        for (int i = 0; i < size; i++) {
            System.out.printf("Nhập phần tử thứ %d: ", (i + 1));
            arr[i] = sc.nextInt();
        }
        max = arr[0];
        for (int i = 0; i < size; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("sốlớn nhất trong mảng :  " + max);
        min = arr[0];
        for (int i = 0; i < size; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }

        }
        System.out.println("số nhỏ nhất trong mảng la:   " + min);
        System.out.print("các số chia hết cho 3 là:  ");
        for (int i = 0; i < size; i++) {
            if (arr[i] % 3 == 0){
                System.out.print(arr[i] + ",");
                
            }
        }
        System.out.print("\n các số chia hết cho 2 là:   ");
        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + ",");
            }
        }
    }
}

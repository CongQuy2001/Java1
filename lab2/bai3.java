/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.Scanner;

/**
 *
 * @author JosCongQuy
 */
public class bai3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("mời bạn nhập số điện");
        double soDien;
        soDien = sc.nextDouble();
        if (soDien < 50) {
            System.out.println("tien" + (soDien * 1000));
        } else {
            System.out.println("số tiền  " + 50 * 1000 + (soDien - 50) * 1200);
        }
    }
}

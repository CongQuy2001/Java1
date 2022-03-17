/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.Scanner;

/**
 *
 * @author JosCongQuy
 */
public class Lap4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Chiều Dài: ");
        int chieuDai = sc.nextInt();
        System.out.println("Nhập Chiều Rộng: ");
        int chieuRong = sc.nextInt();
        HinhChuNhat hinhChuNhat = new HinhChuNhat();
        hinhChuNhat.setChieuDai(chieuDai);
        hinhChuNhat.setChieuRong(chieuRong);
        System.out.println(hinhChuNhat);

        
        
    }
}

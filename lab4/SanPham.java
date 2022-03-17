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
// oop có 4 tính chất  đóng gói,trừu tượng, kế thừa, đa hình
public class SanPham {
    public   void sanpham(){
    }
    static Scanner sc = new Scanner(System.in);
     String tensp;
     double donGia;
     double giamGia;
    
     public void nhapthongtin () {
         System.out.println("nhập tên sản phẩm");
        tensp = sc.nextLine();
         System.out.println("nhập đơn giá");
         donGia = Double.parseDouble(sc.nextLine());
         System.out.println("nhập thông tin giảm giá");
         giamGia = Double.parseDouble(sc.nextLine());
        
    }

     public void xuatthongtin(){
         System.out.println("xuất thông  tin");
         System.out.println("tên sản phẩm là:   "+tensp);
         System.out.println("đơn giá là: "+ donGia);
         System.out.println("thông tin giảm giá là:  "+giamGia);
         System.out.println("thuế nhâp khẩu là:" +donGia*0.1);
     }
          public void   thueNhapKhau(){
          double tnk = donGia *0.1;
    
     
     }
}

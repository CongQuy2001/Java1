/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author JosCongQuy
 */
public class QLlaptop {
    public static void main(String[] args) {
         laptop lap1 = new laptop();
        System.out.println("nhâp thông tin");
       lap1.nhapLT();
        System.out.println("xuất thông tin");
        lap1.xuatLT();
        String tenToiLa = "toi ten la";
        int nam = 1900;
        double giaCa = 999.254;
        laptop hangcuibap = new laptop(tenToiLa, nam, giaCa);
        hangcuibap.xuatLT();
        hangcuibap.setGiaTien(25984);
        hangcuibap.setTenHang("tao ko biet");
        hangcuibap.xuatLT();
        System.out.println(hangcuibap.getNamSX());
    }
  
}

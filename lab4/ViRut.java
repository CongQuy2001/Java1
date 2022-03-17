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
// tạo thuộc tính
public class ViRut {

    private String mauSac;
    private String ten;
    private int kichThuoc;

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getKichThuoc() {
        return kichThuoc;
    }

    public void setKichThuoc(int kichThuoc) {
        this.kichThuoc = kichThuoc;
    }
//    tạo phương thức

    public void nhapVR() {
        Scanner sc = new Scanner(System.in);
        System.out.println("tên virut là");
        this.ten = sc.nextLine();
        System.out.println("virut có màu là:   ");
        this.mauSac = sc.nextLine();
        System.out.println("kích thước con virut");
        this.kichThuoc = sc.nextInt();
    }

    //    tạo phương thức

    public void xuat() {
        System.out.println("virut có tên là:  " + ten);
        System.out.println("virut có màu là:   " + mauSac);
        System.out.println("virut có kích thước là:   " + kichThuoc);
    }
//contructo

    public ViRut() {
    }

    public ViRut(String mauSac, String ten, int kichThuoc) {
        this.mauSac = mauSac;
        this.ten = ten;
        this.kichThuoc = kichThuoc;
    }

    public ViRut(String mauSac, String ten) {
        this.mauSac = mauSac;
        this.ten = ten;

    }

}

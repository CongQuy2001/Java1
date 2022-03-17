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
public class laptop {
//    thuộc tính

    private String tenHang;
    private int namSX;
    private double giaTien;

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public int getNamSX() {
        return namSX;
    }

    public void setNamSX(int namSX) {
        this.namSX = namSX;
    }

    public double getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(double giaTien) {
        this.giaTien = giaTien;
    }

    public void nhapLT() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập tên hãng");
        this.tenHang = sc.nextLine();
        System.out.println("nhập năm sản xuất");
        this.namSX = sc.nextInt();
        System.out.println("nhap gia tien");
        this.giaTien = sc.nextDouble();
    }

    public laptop() {
    }

    public laptop(String tenHang, int namSX, double giaTien) {
        this.tenHang = tenHang;
        this.namSX = namSX;
        this.giaTien = giaTien;
        
    }

    public void xuatLT() {
        System.out.printf("ten %s.\n năm %d. \n giá %.2f. \n xếp loại %s\n", tenHang, namSX, giaTien,xeploaiLT(namSX));
    }
    

    public String xeploaiLT(int namSX) {
        if (namSX > 2018) {
            return "mới";
        } else {
                return "cũ";
        }
    }
}

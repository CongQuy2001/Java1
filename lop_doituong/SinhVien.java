/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lop_doituong;

import java.util.Scanner;

/**
 *
 * @author JosCongQuy
 */

public class SinhVien {

// constructor/ham tao/pthuc khoi tao
    public SinhVien(String hoTen, int tuoi, double diem) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.diem = diem;
    }
//ham tao co tham so
    public SinhVien() {
    }
//    ham tao khong tham so
    static Scanner sc = new Scanner(System.in);
    String hoTen;
    int tuoi;
    double diem;

    public void nhapthongtin() {
        System.out.println("nhập họ tên ");
        hoTen = sc.nextLine();
        System.out.println("nhập tuổi");
        tuoi = Integer.parseInt(sc.nextLine());
        System.out.println("nhập điểm");
        diem = Double.parseDouble(sc.nextLine());
    }

    public void xuatthongtin() {
        System.out.println("xuất thông tin");
        System.out.println("tên của bạn là:    " + hoTen);
        System.out.println("tuổi của bạn là:    " + tuoi);
        System.out.println("điểm của bạn là:  " + diem);
    }
    public void hocLuc() {
     if(diem>5){
         System.out.println("hoc luc gioi");
     }else
            System.out.println("hoc luc yeu");
    }

    public SinhVien(double diem) {
        this.diem = diem;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "hoTen=" + hoTen + ", tuoi=" + tuoi + ", diem=" + diem + '}';
    }

  
}

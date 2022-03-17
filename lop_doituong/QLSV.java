/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// oop có 4 tính chất  đóng gói,trừu tượng, kế thừa, đa hinh
package lop_doituong;

/**
 *
 * @author JosCongQuy
 */
public class QLSV {

    public static void main01(String[] args) {
        SinhVien sv1 = new SinhVien();
        SinhVien sv2 = new SinhVien("ten", 20, 9);
    }

    public static void main(String[] args) {
//            khai báo và khởi tao mot doi tuong sinh vien
        SinhVien sv1 = new SinhVien();
        sv1.nhapthongtin();
        SinhVien sv2 = new SinhVien();
        sv2.nhapthongtin();
        

        System.out.println("thông tin toan bộ sinh viên");
        sv1.xuatthongtin();
        sv1.hocLuc();
        sv2.xuatthongtin();
        sv2.hocLuc();
    }

}

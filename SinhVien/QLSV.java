/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SinhVien;

import java.util.ArrayList;

import java.util.Scanner;



/**
 *
 * @author JosCongQuy
 */
public class QLSV {

    static Scanner sc = new Scanner(System.in);
    private static ArrayList<SinhVienpoly> listSV = new ArrayList<>();

    public void menu() {
        while (true) {
            System.out.println("===========================");
            System.out.println("1.nhập danh sách sinh viên");
            System.out.println("2.xuất danh sách sinh viên");
            System.out.println("3.xuất danh sách sinh viên theo điểm");
            System.out.println("4.tìm sinh viên theo tên");
            System.out.println("5.sửa thông tin sinh viên");
            System.out.println("6.xoá sinh viên");
            System.out.println("0.kết thuc");
            
            System.out.println(">> chọn chức năng:...");
            int so = sc.nextInt();
            System.out.println("===========================");
            sc.nextLine();
            switch (so) {
                case 1:
                    nhap();
                    break;
                case 2:
                    xuat();
                    break;
                case 3:
                    xuatTheoDiem();
                    break;
                case 4:
                    timTheoTen();
                    break;
                case 5:
                    suaten();
                    break;
                case 6:
                    xoa();
                    break;
                case 0:
                    break;

            }
        }
    }

    public void nhap() {
        while (true) {
            System.out.println("mời nhập tên");
            String name = sc.nextLine();
            System.out.println("mời nhập điểm");
            double grade = Double.parseDouble(sc.nextLine());
            System.out.println("mời nhập mã số sinh viên");
            String rollNumber = sc.nextLine();
            SinhVienpoly sv = new SinhVienpoly(name, grade, rollNumber);
            listSV.add(sv);
            System.out.println("nhập tiếp hay ko (y/n)");
            if (sc.nextLine().equalsIgnoreCase("n")) {
                break;
            }
        }

    }

    public void xuat() {
        for (SinhVienpoly listSV1 : listSV) {
//            listSV1 đại diện cho một đối tượng trong mảng listSV
            System.out.println(listSV1);
        }

    }

    public void xuatTheoDiem() {
        System.out.println("mời bạn nhập điểm");
        System.out.println("điểm min");
        double min = sc.nextDouble();
        System.out.println("điểm max");
        double max = sc.nextDouble();
        for (SinhVienpoly sv : listSV) {
            double diem = 0;
            if (sv.diem >= min && sv.diem <= max) {
                System.out.println(sv);
            }
        }
    }

    public void timTheoTen() {
        System.out.println("tìm kiếm sinh viên");
        System.out.println("tên sinh viên");
        String name = sc.nextLine();
        for (SinhVienpoly sv : listSV) {
            if (sv.getTen().equalsIgnoreCase(name)) {
                System.out.println(sv);
            }
        }
    }

    public void suaten() {
        System.out.println("sửa thông tin sinh viên");
        System.out.println("tên sinh viên");
        String name = sc.nextLine();
        for (SinhVienpoly sv : listSV) {
            if (sv.getTen().equalsIgnoreCase(name)) {
                System.out.println("nhập điểm mới");
                sv.setDiem(Double.parseDouble(sc.nextLine()));
            }
        }
    }

    public void xoa() {
        System.out.println("xoá sinh viên");
        System.out.println("tên sinh viên");
        String name = sc.nextLine();
        for (SinhVienpoly sv : listSV) {
            if (sv.getTen().equalsIgnoreCase(name)) {
                listSV.remove(sv);
            }
        }

    }
}

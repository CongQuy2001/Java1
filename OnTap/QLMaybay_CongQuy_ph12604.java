/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnTap;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author JosCongQuy
 */
public class QLMaybay_CongQuy_ph12604 {

    static Scanner sc = new Scanner(System.in);
    private static ArrayList<mayBay> listmaybay = new ArrayList<>();

    public void bangTin() {
        System.out.println("mời bạn nhập urename");
        String urename = sc.nextLine();
        System.out.println("pass");
        String pass = sc.nextLine();
        if (urename.equals("fpolyHN") && pass.equals("Java1")) {
            menu();
        } else {
            System.out.println("lỗi");
        }
    }

    public void menu() {
        while (true) {
            System.out.println("1.mời bạn nhập danh sách máy bay");
            System.out.println("2.xuất danh sách máy bay");
            System.out.println("3.xuất danh sách máy bay theo vòng");
            System.out.println("4.tìm máy bay thoe họ tên");
            System.out.println("5.tìm và sửa vòng 1");
            System.out.println("6.xoá ny theo sdt");
            System.out.println("chọn chức năng");
            int so = sc.nextInt();
            System.out.println("============");
            sc.nextLine();
            switch (so) {
                case 1:
                    nhap();
                    break;
                case 2:
                    xuat();
                    break;
                case 3:
                    xuatmaybaytheovong();
                    break;
                case 4:
                    timtheoten();
                    break;
                case 5:
                    suavong1();
                    break;
                case 6:
                    xoahoten();
                    break;

            }
        }
    }

    public void nhap() {
        while (true) {
            System.out.println("mời bạn nhập tên");
            String hoTen = sc.nextLine();
            System.out.println("mời bạn nhập cân nặng");
            double canNang = Double.parseDouble(sc.nextLine());
            System.out.println("mời bạn nhập vòng 1");
            double vong1 = Double.parseDouble(sc.nextLine());
            System.out.println("nhập tuoi thọ");
            double tuoiTho = Double.parseDouble(sc.nextLine());
            System.out.println("mời bạn nhập sdt");
            String SDT = sc.nextLine();
            mayBay mb1 = new mayBay(hoTen, canNang, vong1, tuoiTho, SDT);
            listmaybay.add(mb1);
            System.out.println("nhâp tiếp hay ko y/n");
            if (sc.nextLine().equalsIgnoreCase("n")) {
                break;
            }
        }
    }

    public void xuat() {
        for (mayBay bambo : listmaybay) {
            System.out.println(bambo.toString());
        }
    }

    public void xuatmaybaytheovong() {
        System.out.println("mời bạn nhập số vòng");
        double vong1 = sc.nextDouble();
        for (mayBay bambo : listmaybay) {
            if (bambo.getVong1() == vong1) {
                System.out.println(bambo.toString());
            }

        }
    }

    public void timtheoten() {
        System.out.println("tên máy bay là ");
        String hoTen = sc.nextLine();
        for (mayBay bambo : listmaybay) {
            if (bambo.getHoten().equalsIgnoreCase(hoTen)) {
                System.out.println(bambo.toString());
            }
        }
    }

    public void suavong1() {
        System.out.println("mời bạn nhập v1");
        double Vong1 = sc.nextDouble();
        for (mayBay bambo : listmaybay) {
            if (bambo.getVong1() == Vong1) {
                System.out.println("sdt mới là");
                bambo.setSDT(sc.nextLine());
            }
        }
    }

    public void xoahoten() {
        System.out.println("nhập ho ten");
        String hoten = sc.nextLine();
        for (mayBay bambo : listmaybay) {
            if (bambo.getHoten().equalsIgnoreCase(hoten)) {
                listmaybay.remove(bambo);
            }
        }
    }
}

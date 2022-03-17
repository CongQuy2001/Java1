/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThiThu;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author JosCongQuy
 */
public class QLmayBay {

    static Scanner sc = new Scanner(System.in);
    private static ArrayList<mayBay> listmaybay = new ArrayList<>();

    public void menu() {
        while (true) {
            System.out.println("==============");
            System.out.println("1. nhập danh sách ");
            System.out.println("2. xuat");
            System.out.println("3.tim theo ten");
            System.out.println("4. xoa ten");
            System.out.println("5. săp xếp theo ten");
            System.out.println("0. kết thúc");
            System.out.println("==========");
            System.out.println("chọn chức năng");
            int so = sc.nextInt();
            System.out.println("====================");
            sc.nextLine();
            switch (so) {
                case 1:
                    nhap();
                    break;
                case 2:
                    xuat();
                    break;
                case 3:
                    timtheoten();
                    break;
                case 4:
                    xoaten();
                    break;
                case 5:
                    sapxep();
                    break;
                case 6:

                    break;

            }
        }
    }

    public void nhap() {
        System.out.println("nhập thông tin");
        while (true) {
            System.out.println("tên là");
            String ten = sc.nextLine();
            System.out.println("tuôi là");
            double tuoi = Double.parseDouble(sc.nextLine());
            System.out.println("sô đo");
            double vong3 = Double.parseDouble(sc.nextLine());
            System.out.println("cân nặng");
            double canNang = Double.parseDouble(sc.nextLine());
            System.out.println("nhập sdt");
            double SDT = Double.parseDouble(sc.nextLine());
            mayBay mb1 = new mayBay(ten, tuoi, canNang, vong3, SDT);
            listmaybay.add(mb1);
            System.out.println("nhập tiếp hay k  y/n");
            if (sc.nextLine().equalsIgnoreCase("n")) {
                break;
            }
        }
    }

    public void xuat() {
        for (mayBay mb1 : listmaybay) {
            System.out.println(mb1);
        }
    }

    public void timtheoten() {
        System.out.println("tên là");
        String ten = sc.nextLine();
        for (mayBay mb1 : listmaybay) {
            if (mb1.getTen().equalsIgnoreCase(ten)) {
                System.out.println(mb1);
            }
        }
    }

    public void xoaten() {
        System.out.println("tên la");
        String ten = sc.nextLine();
        for (mayBay mb1 : listmaybay) {
            if (mb1.getTen().equalsIgnoreCase(ten)) {
                listmaybay.remove(mb1);
            }
        }
    }

    public void sapxep() {
        Comparator<mayBay> comp = new Comparator<mayBay>() {

            @Override
            public int compare(mayBay o1, mayBay o2) {
                return o1.getTen().compareTo(o2.getTen());
            }
        };
        for (mayBay mb1 : listmaybay) {
            System.out.println(mb1);
        }

    }
}

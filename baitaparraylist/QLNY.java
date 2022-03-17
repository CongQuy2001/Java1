/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaparraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author JosCongQuy
 */
public class QLNY {

    static Scanner sc = new Scanner(System.in);
    private static List<NY> listNy = new ArrayList<>();

    public void menu() {
        while (true) {
            System.out.println("==============");
            System.out.println("0. Nhập danh sách người yêu");
            System.out.println("1. in ra tên ny cuối cùng");
            System.out.println("2. xoá đi tên ny đầu tiên");
            System.out.println("3. in ra số lượng người đã yêu");
            System.out.println("4. kiểm tra tên ny");
            System.out.println("6. kết thúc");
            System.out.println("chọn chức năng");
            int so = sc.nextInt();
            sc.nextLine();
            switch (so) {
                case 0:
                    nhap();
                    break;
                case 1:
                    /**
                     * line1: in ra danh sách ny line2: in tên ny cuối cùng
                     */
                    printLastloversName(listNy);

                    break;
                case 2:
                    Deletename(listNy);
                    /**
                     * line1: in ra danh sách ny ban đầu line2: in ra danh sách
                     * ny ban đầu
                     */
                    break;
                case 3:
                    numberny(listNy);
                    /**
                     * line1: số lượng ny đã yêu
                     */
                    break;
                case 4:
                    chekny(listNy);
                    /**
                     * line1: in ra danh sách ny line2: tồn tại hoặc không
                     */
                    break;
                case 6:
                    /**
                     * kết thúc
                     */
                    break;
                default:
                    System.out.println("mời bạn chọn lại");
            }
        }
    }

    public void nhap() {
        while (true) {
            System.out.println("mời nhập tên");
            String name = sc.nextLine();
            NY ny = new NY(name);
            listNy.add(ny);
            System.out.println("nhập tiếp hay ko (y/n)");
            if (sc.nextLine().equalsIgnoreCase("n")) {
                break;
            }
        }
    }

    public void xuat() {
        for (NY ny : listNy) {
            System.out.println(ny);
        }
    }

    public void printListNY(List<NY> listNy) {
        System.out.println("Danh sách NY: " + listNy);
    }

    public void printLastloversName(List<NY> listNy) {
        printListNY(listNy);
        int size = listNy.size();
        NY ny = listNy.get(size - 1);
        String name = ny.getTen();
        System.out.println("teen ny cuoi cung:  " + name);
    }

    public void Deletename(List<NY> listNy) {
        printListNY(listNy);
        NY name = listNy.remove(0);
        System.out.println("xoá tên ny đầu tiên:  " + name);
    }

    public void numberny(List<NY> listNy) {
        printListNY(listNy);
        int ny = listNy.size();
        System.out.println("số lượng ny là:  " + ny);
    }

    public void chekny(List<NY> listNy) {
        printListNY(listNy);
        boolean isContain = false;
        for (NY item : listNy) {
            if(item.getTen().equalsIgnoreCase("Ngoc Anh")) {
                isContain = true;
                break;
            }
        }
        System.out.println(isContain);
       /**
         * used function contains or indexOf
         */
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;


import java.util.Scanner;

public class bai5 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            menu();
        }
    }
 public static void menu() {
        System.out.println("nhap phương trình bậc nhất");
        System.out.println("nhập chương trinh tính tiền điện");
        System.out.println("nhập phương trinh bậc hai");
        System.out.println("mời nhập sự lựa chọn");
        int luaChon = Integer.parseInt(sc.nextLine());
        switch (luaChon) {
            case 1:
                ptbacnhat();
                break;
            case 2:
                tinhtiendien();
                break;
            case 3:
                ptbachai();
                break;
            default:
                System.out.println("chọn nhầm rồi bố");
        }
    }
    public static void ptbacnhat() {

        System.out.println("moi ban nhap a");
        int a;
        a = sc.nextInt();
        System.out.println("moi ban nhap b");
        int b;
        b = sc.nextInt();
        int x = 0;
        if (a == 0) {
            System.out.println("phương trinh vô nghiệm");
        } else {
            x = -b / a;
        }
        System.out.println("phương trinh có nghiệm la " + x);
    }

    public static void tinhtiendien() {
        System.out.println("mời bạn nhập số điện");
        double soDien;
        soDien = sc.nextDouble();
        if (soDien < 50) {
            System.out.println("tien" + (soDien * 1000));
        } else {
            System.out.println("số tiền  " + 50 * 1000 + (soDien - 50) * 1200);
        }
    }

    public static void ptbachai() {
        System.out.println("hệ số a là");
        float a;
        a = sc.nextInt();
        System.out.println("hệ số của b là");
        float b;
        b = sc.nextInt();
        System.out.println("hệ số của c là");
        float c;
        c = sc.nextInt();
        if (a == 0) {
        }
        if (b == 0) {
            System.out.println("phương trinh vô nghiệm");
        } else {
            System.out.println("phương trình có một nghiệm x2 =" + (-c / b));
        }
        float delTa = b * b - 4 * a * c;
        float x1;
        float x2;
        if (delTa > 0) {
            System.out.println("phương trình có hai nghiệm x1= x2=" + "x1" + "x2");
            x1 = (float) ((-b + Math.sqrt(delTa)) / (2 * a));
            x2 = (float) ((-b - Math.sqrt(delTa)) / (2 * a));
        } else if (delTa == 0) {
            x1 = (-b / (2 * a));
            System.out.println("phương trình có một nghiệm kép " + x1);
        } else {
            System.out.println("phương trình vô nghiệm");
        }
    }

   
}

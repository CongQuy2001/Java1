package lab2;

import java.util.Scanner;

public class bai1 {

    public static Scanner sc = new Scanner(System.in);
    public static int tuoi;
    public static String ten;
    public static double soDo;

    public static void main(String[] args) {
        while (true) {
            menu();
        }
    }

    public static void nhap() {
        System.out.println("mời bạn nhập tên");
        String ten;
        ten = sc.nextLine();
        System.out.println("mời bạn nhap tuoi");
        tuoi = Integer.parseInt(sc.nextLine());
        System.out.println("mời bạn nhập số đo vòng");
        double soDo;
        soDo = sc.nextDouble();
    }

    public static void xuat() {
        System.out.println("thong tin cua ban" + ten);
        System.out.println("tuoi cua ban la" + tuoi);
        System.out.println("kết quả vòng 1 " + soDo);
    }

    public static void thoat() {
        System.exit(0);
    }

    public static void menu() {
        System.out.println("moi ban nhap ten");
        System.out.println("moi ban nhap tuoi");
        System.out.println("so do ba vong");
        System.out.println("moi ban nhap thong tin lua chon");
        int luaChon = Integer.parseInt(sc.nextLine());
        switch (luaChon) {
            case 1:
                nhap();
                break;
            case 2:
                xuat();
                break;
            case 3:
                System.exit(0);
            default:
                System.out.println("nhầm rồi 1,2,3 cơ mà");
                break;
        }
    }

}

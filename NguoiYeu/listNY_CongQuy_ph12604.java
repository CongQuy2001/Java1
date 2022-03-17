/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NguoiYeu;

import java.util.ArrayList;

import java.util.Comparator;

import java.util.Scanner;

/**
 *
 * @author JosCongQuy
 */
public class listNY_CongQuy_ph12604 {

    static Scanner sc = new Scanner(System.in);
    private ArrayList<ny> listNy = new ArrayList<>();

    public void menu() {
        while (true) {
            System.out.println("=========================");
            System.out.println("1. Nhập thông tin NYC");
            System.out.println("2. Xuất danh sách NYC");
            System.out.println("3. Tìm theo tên");
            System.out.println("4. Tìm theo số đo");
            System.out.println("5. Tìm tất cả NYC có  tên Ngọc Anh");
            System.out.println("6. Sắp xếp NYC theo số đo ba vòng");
            System.out.println("7. Sắp xếp theo tên sử dụng lamdar");
             System.out.println("8. Sửa vòng ba NYC theo tuổi");
            System.out.println("0. thoát");

            System.out.println("mời bạn chọn chức năng");
            int so = sc.nextInt();
            System.out.println("----------------------");
            sc.nextLine();
            switch (so) {
                case 1:
                    nhapthongtin();
                    break;
                case 2:
                    xuatdanhsach();
                    break;
                case 3:
                    timtheoten();
                    break;
                case 4:
                    timtheosodo();
                    break;
                case 5:
                    checkNY();
                    break;
                case 6:
                    sortNYCByVong3();
                    break;
                case 7:
                    sapxepTheoten();
                    break;
                    case 8:
                        suaVong();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Chọn lại đi bố ơi");
            }

        }
    }

    public void nhapthongtin() {
        System.out.println("mời bạn nhập thông tin NYC");
        while (true) {
            System.out.println("mời bạn nhập tên");
            String ten = sc.nextLine();
            System.out.println("mời bạn nhập tuổi");
            double tuoi = sc.nextDouble();
            System.out.println("mời bạn nhập số đo  vòng ba");
            double sodo = sc.nextDouble();
            sc.nextLine();
            ny nyc = new ny(ten, tuoi, sodo);
            listNy.add(nyc);
            System.out.println("nhập tiếp hay không y/n");
            if (sc.nextLine().equalsIgnoreCase("n")) {
                break;
            }
        }
    }

    public void xuatdanhsach() {
        for (ny nyc : listNy) {
            System.out.println(nyc);
        }
    }

    public void printListNY(ArrayList<ny> listNy) {
        System.out.println("Danh sách NY: " + listNy);
    }

    /**
     * findByName
     */
    public void timtheoten() {
        printListNY(listNy);
        System.out.println("tên ny");
        String ten = sc.nextLine();
        for (ny nyc : listNy) {
            if (nyc.getTen().equalsIgnoreCase(ten)) {
                System.out.println(nyc);
            }
        }
    }

    public void timtheosodo() {
        printListNY(listNy);
        System.out.println("số đo ba vòng NYC");
        System.out.println("mời bạn nhập số đo v3");
        Double soDoVongBa = sc.nextDouble();
        for (ny nyc : listNy) {
            if (nyc.getSoDoVongBa() == soDoVongBa) {
                System.out.println(nyc);
            }
        }
    }

    public void checkNY() {
        printListNY(listNy);
        boolean isContain = false;
        for (ny item : listNy) {
            if (item.getTen().equalsIgnoreCase("Ngoc Anh")) {
                isContain = true;
                break;
            }
        }
        System.out.println(isContain);
    }

    public void sortNYCByVong3() {
        printListNY(listNy);
        Comparator<ny> comp = new Comparator<ny>() {
            @Override
            public int compare(ny o1, ny o2) {
                return o1.soDoVongBa > (o2.soDoVongBa) ? 1 : -1;
//                sử dụng toán tử ba ngôi if true trả về 1 
//                esale -1 và hoán đổi vị trí
            }
        };
         for (ny  nyc : listNy) {
            System.out.println(nyc.toString());
        }
//                ép về kiểm lamdar
//        listNy.stream().forEach((nyc) -> System.out.println(nyc.toString()));

//                 for (ny  nyc : listNy) {
//            System.out.println(nyc.toString());
//        }
    }
    public void sapxepTheoten() {
//        KIỂU COMPARATOR
         printListNY(listNy);
         Comparator <ny> comp = new Comparator<ny>(){
             @Override
             public int compare(ny o1, ny o2) {
              return o1.getTen().compareTo(o2.getTen());
             }
         };
          for (ny nyc : listNy) {
            System.out.println(nyc);
        }
//        XẮP XẾP THEO KIỂU LAMDAR
//          printListNY(listNy);
//         Comparator <ny> comp = (ny o1, ny o2) -> o1.getTen().compareTo(o2.getTen());
//         listNy.stream().forEach((nyc) -> System.out.println(nyc));
//     
                 }
    public void suaVong() {
         printListNY(listNy);
        System.out.println("Sửa Thông Tin NY");
        System.out.println("tuổi của NY");
        double tuoi =sc.nextDouble();
        for ( ny  nyc: listNy){
        if(nyc.getTuoi()==(tuoi)){
                System.out.println("Nhập Vòng mới");
                double vongMoi;
                vongMoi = sc.nextDouble();
        nyc.setSoDoVongBa(vongMoi);
        }
        }
    }
}
    
        
                 
   





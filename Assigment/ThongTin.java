/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assigment;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author JosCongQuy
 */
public class ThongTin {

    static Scanner sc = new Scanner(System.in);
    ArrayList<NhanVien> NV1 = new ArrayList<>();

    public void menu() {
        while (true) {
            System.out.println(" ==========================================================");
            System.out.println("|1. Nhập danh sách nhân viên từ bàn phím                   |");
            System.out.println("|2. Xuất danh sách nhân viên ra màn hình.                  |");
            System.out.println("|3. Tìm và hiển thị nhân viên theo mã nhập từ bàn phím     |");
            System.out.println("|4. Xóa nhân viên theo mã nhập từ bàn phím.                |");
            System.out.println("|5. Cập nhật thông tin nhân viên theo mã nhập từ bàn phím  |");
            System.out.println("|6. Tìm các nhân viên theo khoảng lương nhập từ bàn phím.  |");
            System.out.println("|7. Sắp xếp nhân viên theo họ và tên                       |");
            System.out.println("|8. Sắp xếp nhân viên theo thu nhập.                       |");
            System.out.println("|9. Xuất 5 nhân viên có thu nhập cao nhất.                 |");
            System.out.println("|0. kết thúc                                               |");
            System.out.println(" ==========================================================");
            System.out.println(">> chọn chức năng:...");
            String so = sc.nextLine();
            switch (so) {
                case "1":
                    Nhap();
                    break;
                case "2":
                    xuat();
                    break;
                case "3":
                    TimNV();
                    break;
                case "4":
                    XoaNV();
                    break;
                case "5":
                    CapNhat();
                    break;
                case "6":
                   TimNVTheoLuong();
                    break;
                case "7":
                    SapXepTheoten();
                    break;
                case "8":
                    SapXepTheoThuNhap();
                    break;
                case "9":
                    break;
                case "0":

                    break;
            }
        }
    }
// thông tin  nhân viên
    public boolean NhanVien() {
        while (true) {
          
            System.out.println("mời bạn nhập mã nhân viên");
            String maNV = sc.nextLine();
            System.out.println("mời bạn nhập tên nhân viên");
            String hoTen = sc.nextLine();
            System.out.println("mời bạn nhập lương nhân viên");
            double luong = Double.parseDouble(sc.nextLine());
            NhanVien NV = new NhanVien(maNV, luong, hoTen);
            NV1.add(NV);
            System.out.println("nhập tiếp hay ko y/n");
            if (sc.nextLine().equalsIgnoreCase("n")) {
                return false;
            }
        }
    }
// thông tin nhân viên trưởng phòng
    public Boolean TruongPhong() {
        while (true) {
            System.out.println("mời bạn nhập mã nhân viên");
            String maNV = sc.nextLine();
            System.out.println("mời bạn nhập tên nhân viên");
            String hoTen = sc.nextLine();
            System.out.println("mời bạn nhập lương nhân viên");
            double luong = Double.parseDouble(sc.nextLine());
            System.out.println("mời bạn nhập trách nhiệm");
            double TrachNhiem = Double.parseDouble(sc.nextLine());
            NhanVien NV = new TruongPhong(TrachNhiem, maNV, luong, hoTen);
            NV1.add(NV);
            System.out.println("nhập tiếp hay không y/n");
            if (sc.nextLine().equalsIgnoreCase("n")) {
                return false;
            }
        }

    }
// thông tin nhân viên tiếp thị
    public Boolean TiepThi() {
        while (true) {
            System.out.println("mời bạn nhập mã nhân viên");
            String maNV = sc.nextLine();
            System.out.println("mời bạn nhập tên nhân viên");
            String hoTen = sc.nextLine();
            System.out.println("mời bạn nhập lương nhân viên");
            double luong = Double.parseDouble(sc.nextLine());
            System.out.println("mời bạn nhập doanh so ban hang");
            double doanhSoBanHang = Double.parseDouble(sc.nextLine());
            System.out.println("mời bạn nhập số hoa hồng");
            double hoaHong = Double.parseDouble(sc.nextLine());
            NhanVien NV = new TiepThi(doanhSoBanHang, hoaHong, maNV, luong, hoTen);
            NV1.add(NV);
            System.out.println("nhập tiếp hay không y/n");
            if (sc.nextLine().equalsIgnoreCase("n")) {
                return false;
            }
        }

    }
// 1 nhập thông tin nhân viên
    public void Nhap() {
        Boolean isInputingBoolean = true;
        while (isInputingBoolean) {
            System.out.println("mời bạn chọn");
            System.out.println("1.mời bạn nhạp thông tin nhân viên");
            System.out.println("2.mời bạn nhập thông tin trưởng phòng");
            System.out.println("3.mời bạn nhập thông tin tiếp thị");
            int so = Integer.parseInt(sc.nextLine());
            switch (so) {
                case 1:
                    isInputingBoolean = NhanVien();
                    break;
                case 2:
                    isInputingBoolean = TruongPhong();
                    break;
                case 3:
                    isInputingBoolean = TiepThi();
                    break;
                default:
                    isInputingBoolean = false;
                    break;
            }
        }

    }
//2 xuất thong tin vừa nhập
    public void xuat() {
        for (NhanVien NV : NV1) {
            System.out.println(NV.toString());
        }
    }
//3 tìm nhân viên theo mã vừa nhập
    public void TimNV() {
        System.out.println("mời bạn nhập mã");
        String maNV = sc.nextLine();
        for (NhanVien NV : NV1) {
            if (NV.getMaNV().equalsIgnoreCase(maNV)) {
                System.out.println(NV.toString());
            }
        }
    }
//4 xóa nhân viên theo mã
    public void XoaNV() {
        System.out.println("mời bạn nhập mã nhân viên");
        String maNV = sc.nextLine();
        for (NhanVien NV : NV1) {
            if (NV.getMaNV().equalsIgnoreCase(maNV)) {
                NV1.remove(NV);
            }
        }
    }
//5 cập nhật lại nhân viên theo mã
    public void CapNhat() {
        System.out.println("mời bạn nhập mã nhân viên");
        String maNV = sc.nextLine();
        for (NhanVien x : NV1) {
            if (x.getMaNV().equalsIgnoreCase(maNV)) {
                System.out.print("Mời nhập lại  tên ");
                String name = sc.nextLine();
                x.setHoTen(name);
                System.out.print("Mời nhập lại lương ");
                double luonG = Double.parseDouble(sc.nextLine());
                x.setLuong(luonG);
                break;
            }
        }
    }
//6 tìm nhân viên theo đam mê
    public void TimNVTheoLuong() {
        System.out.println("mời bạn nhập lương");
        double luong = Double.parseDouble(sc.nextLine());
        for (NhanVien NV : NV1) {
            if (NV.getLuong() == luong) {
                System.out.println(NV.toString());
            }
        }
    }
//7 sắp xếp nhân viên theo tên
    public void SapXepTheoten() {
        Comparator<NhanVien> comp = new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                return o1.getHoTen().compareTo(o2.getHoTen());
            }
        };
        for (NhanVien NV : NV1) {
            System.out.println(NV.toString());
        }
    }
//8 sắp xếp nhân viên theo thu nhập
    public void SapXepTheoThuNhap() {
        Comparator<NhanVien> comp = new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                return o1.thuNhap().compareTo(o2.thuNhap());
            }
        };
        for (NhanVien NV : NV1) {
            System.out.println(NV.toString());
        }
    }
//    public void sapXepTheoLuong() {
//       Comparator <NhanVien> comp = new  Comparator<NhanVien>() {
//
//           @Override
//           public int compare(NhanVien o1,NhanVien o2) {
//            return o1.luong > (o2.luong) ? 1 :-1 ;
////             sử dụng toán tử ba ngôi if true trả về 1 
////                esale -1 và hoán đổi vị trí
//           }
//       };
//        for (NhanVien NV : NV1) {
//            System.out.println(NV.toString());
//        }
//    }
}

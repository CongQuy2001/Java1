


import java.util.Scanner;

/**
 * 
 * @author JosCongQuy
 */
public class btlamthem {
    public static  Scanner sc = new Scanner(System.in);
//lam quan vs scanner

//    public static void main11(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int soThuNhat;
//        System.out.println("moi ban nhap thong tin");
//        soThuNhat = sc.nextInt();
//        int sothuHai;
//        System.out.println("moi ban nhap so");
//        sothuHai = sc.nextInt();
//        int soThuBa = soThuNhat + sothuHai;
//        System.out.println(" kết quả   " + soThuBa);
//    }
////    tính điểm trung bình
//
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float monToan;
        System.out.println("moi ban nhap mon toan");
        monToan = sc.nextFloat();
        int monVan;
        System.out.println("moi ban nhap mon van");
        monVan = sc.nextInt();
        int monSinh;
        System.out.println("moi ban nhap moin sinh");
        monSinh = sc.nextInt();
        double diemTrungBinh = (monSinh + monToan + monVan) / 3;
        System.out.println("diem trung binh: " + diemTrungBinh);
        if (diemTrungBinh >= 8) {
            System.out.println("hoc sinh gioi");
        };

        if (diemTrungBinh < 8 && diemTrungBinh > 6.0) {
            System.out.println("hoc luc kha");
        };
        if (diemTrungBinh <= 5) {
            System.out.println("hoc luc trung binh");
        };
    }
//
//    public static void main02(String[] args) {
//        int a = 6;
//        int b = 18;
//        int c = 20;
//        int max = a > b ? a : b;
//        int max2 = max > c ? max : c;
//        System.out.println("ket qua" + max2);
//    }

    public static void main01(String[] args) {
//        
        while (true) {            
            menu();
        }
        
    }

    public static void menu() {
        System.out.println("mời nhập thông tin NYC cũ");
        System.out.println("nhập thông tin sản phẩm");
        System.out.println("giá cả");
        System.out.println("mời nhập sự lựa chọn");
        int luaChon = Integer.parseInt(sc.nextLine());
        switch (luaChon) {
            case 1:
                nhapNYC();
                break;
            case 2:
                chekHang();
                break;
            case 0:
                System.exit(0);
                break;
                default:
                    System.out.println(" mù màu à 1,2,0 thôi");
        }

    }

    public static void nhapNYC() {
        System.out.println("ghi công NYC");
        System.out.println("nhập tên");
        String hoTen;
        hoTen = sc.nextLine();
        System.out.println("mơi bạn nhập tuổi");
        int tuoi;
        tuoi = sc.nextInt();

    }

    public static void chekHang() {

        System.out.println("mời bạn nhập địa điểm");
        String diaDiem;
        diaDiem = sc.nextLine();
        System.out.println("giá cả");
        double giá;
        giá = Double.parseDouble(sc.nextLine());
        System.out.println("chất lượng");
        String chatLuong;
        chatLuong = sc.nextLine();
        System.out.printf("chek ở %s giá khoảng %f có chất lượng %s!", diaDiem, giá, chatLuong);
    }
}

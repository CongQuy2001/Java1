
import com.sun.tools.jdeprscan.scan.Scan;
import java.util.Scanner;

public class bai2_Variable {

    public static void main02(String[] args) {
// toan tu cong
        int a = 25;
        int b = 10;
        int result;
        result = a + b;
        System.out.println(a + " + " + b + " = " + result);
//    toan tu tru
        result = a - b;
        System.out.println(a + " - " + b + " = " + result);
//toan tu nhan
        result = a * b;
        System.out.println(a + " * " + b + " = " + result);
    }
//hằng số

    public static void main01(String[] args) {
        final int Cong_Quy = 2001;
        System.out.println(Cong_Quy);
    }

    //lam quen vs biến  
    public static void main041(String[] args) {
        int age = 20;
        int year = 2020;
        Scanner sc = new Scanner(System.in);
        int solo;
        System.out.println("moi ban nhap");
        solo = sc.nextInt();
        System.out.printf("chon:%d là trúng đề\n", solo);
        System.out.println("age" + age);
        System.out.println("year" + year);
        System.out.print(age);
        System.out.printf("%d", year);
    }

//    nhap thong tin ca nhan
//
//    public static void main03(String[] args) {
//        String name;
//        String job;
//        int age;
//        System.out.println("moi ban nhap thong tin");
//        Scanner sc = new Scanner(System.in);
//        name = sc.nextLine();
//        job = sc.nextLine();
//        age = sc.nextInt();
//        System.out.printf("ten cua ban  là: %s\n", name);
//        System.out.printf("nghe cua ban la: %s\n", job);
//        System.out.printf("tuoi cua ban la:%d \n", age);
//    }
    public static void main05(String[] args) {
        String name;
        String job;
        int age;
        System.out.println("nhập thông tin ");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        job = sc.nextLine();
        age = sc.nextInt();
        System.out.printf("tên của bạn : %s\n", name);
        System.out.printf("nghề của bạn là : %s\n", job);
        System.out.printf("tuổi của bạn là : %d\n", age);

    }
//    ÉP KIỂU

    public static void main04(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap tuoi");
        int tuoi = Integer.parseInt(sc.nextLine());
        System.out.println("nhap diem");
        double diem = Double.parseDouble(sc.nextLine());
        System.out.println("nhap ten");
        String hoTen = sc.nextLine();
        System.out.println(" tuoi" + tuoi + "\ndiem" + diem + "\nhoTen" + hoTen);
    }
//          câu điều kiện if else

    public static void main06(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nhapTen;
        System.out.println("moi ban nhap ten");
        nhapTen = sc.nextLine();
        String tinhTrang;
        System.out.println("moi ban nhap tinh trang");
        tinhTrang = sc.nextLine();
        double nhietDo;
        System.out.println("moi ban nhap nhiet do");
        nhietDo = sc.nextDouble();
        if (nhietDo > 38) {
            System.out.println("ten bố là" + nhapTen);
            System.out.println("tinh trang bố là" + tinhTrang);
            System.out.println("nhiet do cơ thể" + nhietDo);
            System.out.println("dính covid rôi");
        } else {
            System.out.println("binh thuong");
        }
    }
// ÉP KIỂU

    public static void main07(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("moi ban nhap so do");
        System.out.println("vòng 1");
        double v1 = Double.parseDouble(sc.nextLine());
        System.out.println("vong 2");
        double v2 = Double.parseDouble(sc.nextLine());
        System.out.println("vong 3");
        double v3 = Double.parseDouble(sc.nextLine());
        double tBc = (v1 * 3 + v2 + v3 * 2) / 3;
        System.out.println("tong ba vong" + tBc);
    }
// câu điều kiện if else

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("moi ban nhap lương");
        double luong = Double.parseDouble(sc.nextLine());
        System.out.println("moi ban nhap chuc vu");
        String chucVu;
        chucVu = sc.nextLine();
        if (luong > 9000000) {
            System.out.println("luong duoc nhan từ thuế" + (luong - luong * 0.1));
        } else {
            System.out.println("luong được nhận " + luong);
        }
    }

}

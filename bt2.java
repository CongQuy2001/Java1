
import java.util.Scanner;

public class bt2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tuoiCuaBan;
         System.out.println("moi ban nhap tuoi");
         tuoiCuaBan = sc.nextInt();
        int tuoiNy ;
        System.out.println("moi ban nhap tuoi");
         tuoiNy = sc.nextInt();
        int tuoiTho = tuoiCuaBan + tuoiNy;
        System.out.println("tuoi cua ban" +tuoiTho);
    }

         public static void main01(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nhapTen;
        System.out.println("moi ban nhap ten");
        nhapTen = sc.nextLine();
        String soDoBAVong;
        System.out.println("moi ban nhap so do ba vong");
        soDoBAVong = sc.nextLine();
        String dang;
        System.out.println("moi ban nhap dang");
        dang = sc.nextLine();
        System.out.println("nhap chieu cao");
        double chieuCao = Double.parseDouble(sc.nextLine());
        System.out.printf("ten ny cu %s \n", nhapTen, soDoBAVong, chieuCao);
    }

}

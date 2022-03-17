
package lab1;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("mời bạn nhập họ tên");
        String hoVaTen;
        hoVaTen = sc.nextLine();
        System.out.println("mời bạn nhập điểm");
        int  diem;
        diem = sc.nextInt();
        System.out.println("tên bạn là   " + hoVaTen);
        System.out.println("điểm của bạn  " +diem);
    }
}

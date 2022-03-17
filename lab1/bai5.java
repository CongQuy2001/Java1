
package lab1;

import java.util.Scanner;


public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("so thu nhat");
        int soThuNhat;
        soThuNhat = sc.nextInt();
        System.out.println("số thứ hai");
        int sothuHai;
        sothuHai = sc.nextInt();
        System.out.println("số thứ ba");
        int sothuBa;
        sothuBa = sc.nextInt();
        int min = soThuNhat<sothuHai? soThuNhat:sothuHai;
        int min2 = min<sothuBa?  min:sothuBa;
        System.out.println("số nhỏ nhất là   " +min2);
    }
 
}

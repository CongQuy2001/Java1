
package lab1;

import java.util.Scanner;


public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("mời bạn nhập cạnh thứ nhất");
        int a;
        a = sc.nextInt();
        System.out.println("mời bạn nhập cạnh thứ 2");
        int b;
        b =sc.nextInt();
        int c =(a+b)*2;
         System.out.println("chu vi hình chữ nhật   " +c);
        int d = a*b;
         System.out.println("diện tích hình chữ nhật " +d);
        System.out.println("cạnh nhỏ nhất");
        int canhNhoNhat;
        canhNhoNhat = sc.nextInt();
        canhNhoNhat= Math.min(a, b);
        System.out.println("cạnh nhỏ nhất là   "+canhNhoNhat);
    }
}

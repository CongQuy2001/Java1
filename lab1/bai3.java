
package lab1;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("mời bạn nhập cạnh");
        int canh;
     canh = sc.nextInt();
        int v = canh * canh * canh;
         System.out.println("thể tích khối lập phương bằng   "+v);
    }
}

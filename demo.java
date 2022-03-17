
import java.util.Scanner;


public class demo {

    public static void main12(String[] args) {
     int a = 5;
     int b = 10;
     int c ;
     System.out.println("chu vi hinh chu nhat"+2*(a+b));
    }
     public static void main01(String[] args) {
     int a = 10;
      a +=10;
     System.out.println("ket qua"+a );
    }
        //toán tử trong java
        public static void main02(String[] args) {
        int a = 2;
        int b = 3;
        boolean c = false;
        c = a > b;
        System.out.println(a + ">" + b + c);
        c = a < b;
        System.out.println(a + "<" + b + c);
        c = a <= b;
        System.out.println(a + "<=" + b + c);
        c = a >= b;
        System.out.println(a + ">=" + b + c);
        c = a != b;
        System.out.println(a + "!=" + b + c);
        }
        //hàm toán học trong java
        public static void main03(String[] args) {
        int a = 50;
        int b = 90;
        double c = 148.253;
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        System.out.println("max:" + max);
        System.out.println("min:" + min);
        System.out.println("floor:" + Math.floor(c));  //làm tròn xuống
        System.out.println("cell:" + Math.ceil(c));  //làm tròn lên
        System.out.println("round:" + Math.round(c)); // làm tròn đến số gần nhất
        double randomc = Math.random(); // lấy số ngẫu nhiên
        System.out.println("random:" + Math.random());
        }
        //BT tìm số lớn nhất trong ba số
        public static void main04(String[] args) {
        int a = 50;
        int b = 985;
        int e = 189;
        int f = Math.max(a, b);
        int max = Math.max(f, e);
        System.out.println("âsasas"+max);
        
    }
} 


package lab1;

import java.util.Scanner;

public class bai4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("hệ số a là");
        float a;
        a = sc.nextInt();
        System.out.println("hệ số của b là");
        float b;
        b = sc.nextInt();
        System.out.println("hệ số của c là");
        float c;
        c = sc.nextInt();
        if (a == 0) {
        }
        if (b == 0) {
            System.out.println("phương trinh vô nghiệm");
        } else {
            System.out.println("phương trình có một nghiệm x2 =" + (-c / b));
        }
        float delTa = b * b - 4 * a * c;
        float x1;
        float x2;
        if (delTa > 0) {
            System.out.println("phương trình có hai nghiệm x1= x2=" + "x1" + "x2");
            x1 = (float) ((-b + Math.sqrt(delTa)) / (2 * a));
            x2 = (float) ((-b - Math.sqrt(delTa)) / (2 * a));
        } else if (delTa == 0) {
            x1 = (-b / (2 * a));
            System.out.println("phương trình có một nghiệm kép " + x1);
        } else {
            System.out.println("phương trình vô nghiệm");
        }
    }
}

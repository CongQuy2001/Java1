
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JosCongQuy
 */
public class nhapxuatmang {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
//        buoc 1 nhap size cho mang
        System.out.println("mời bạn nhập size");
        int size =  sc.nextInt();
//        buoc 2 khai baos va tao mang
        int a[] = new int[size];
//     buoc 3   nhap gia tri tung phan cho mang
      for(int i =0;i<a.length;i++){
          System.out.printf("mời bạn nhập phần tử thứ %d:",(i+1));
          a[i] = sc.nextInt();
      }
//      buoc 4 xuat mang
        System.out.println("mảng vừa nhập là");
      for(int i=0; i<size;i++){
          System.out.println(""+a[i]);
      }
    }
}
  

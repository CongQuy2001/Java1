/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mang_vonglap;

import java.util.Scanner;

/**
 *
 * @author JosCongQuy
 */
public class demomang {
    static  Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("moi ban nhap ca phan tu ");
        int size = sc.nextInt();
        int tong = 0;
        int i;
        int a[]= new int[size];
        for(i=0;i<a.length;i++){
            System.out.printf("moi ban nhap phan tu %d",(i+1));
            a[i]=sc.nextInt();
            tong +=a[i];
        }
        System.out.println("mang vua nhap");
        for(i=0;i<a.length;i++){
            System.out.println(""+(a[i]));
        }
        System.out.println("tbc"+(double)tong/size);
        System.out.println("mang lap phuong la");
        for( i = 0; i<size; i++){
            System.out.println(""+Math.pow(a[i], 3));
        }
        
    }
}
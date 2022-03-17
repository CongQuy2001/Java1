/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.Scanner;

/**
 *
 * @author JosCongQuy
 */
public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("moi ban nhap a");
        int a;
        a = sc.nextInt();
        System.out.println("moi ban nhap b");
        int b;
        b= sc.nextInt();
        int x = 0;
        if(a==0){
            System.out.println("phương trinh vô nghiệm"); 
        }else
            x= -b/a;
        System.out.println("phương trinh có nghiệm la "+x); 
    }
}

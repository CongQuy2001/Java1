/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7.shape;

/**
 *
 * @author JosCongQuy
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("\nKích Thước HCN");
        ChuNhat hcnHV = new ChuNhat(8.0, 5.0);
        hcnHV.xuat();
        System.out.println("\nKích Thước Hình Vuông");
        Vuong v1 = new Vuong(2);
        v1.xuat();
    }
}

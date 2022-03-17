/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author JosCongQuy
 */
public class bai1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> sothucList = new ArrayList();
        while (true) {
            System.out.println("mời nhập số");
            double soThuc = Double.parseDouble(sc.nextLine());
            sothucList.add(soThuc);
            System.out.println("tiếp hay dừng");
            String tiep = sc.nextLine();
            if (tiep.equalsIgnoreCase("n")) {
                break;
            }
        }
        double tong = 0;
        for (Double xxx : sothucList) {

            tong = tong + xxx;

        }
        System.out.println("tông là   " + tong);
    }

}

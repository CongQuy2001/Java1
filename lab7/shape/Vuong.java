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
public class Vuong extends ChuNhat {

    private double canh;
//
//    public Vuong(double canh, double dai, double rong) {
//        super(dai, rong);
//        this.canh = canh;
//    }

    public Vuong(double canh) {
        this.canh = canh;
    }

    @Override       //Override la chu thich cho viec ghi de khi lớp cha có hàm cùng tên
    public double getChuVi() {
        return canh * 4;
    }

    @Override
    public double getDienTich() {
        return canh * canh;
    }

//    public void show() {
//        super.xuat();
//        System.out.println("cạnh hình vuông là "+ canh);
//    }
    @Override
    public void xuat() {
        System.out.println("cạnh hình Vuông là " + canh);
        System.out.println("chu vi hình Vuông là    " + getChuVi());
        System.out.println("diện tich hình Vuông là " + getDienTich());
    }
}

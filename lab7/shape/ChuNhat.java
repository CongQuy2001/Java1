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
public class ChuNhat {

    private double dai, rong;

    public ChuNhat() {
    }

    public ChuNhat(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }

    public double getDai() {
        return dai;
    }

    public void setDai(double dai) {
        this.dai = dai;
    }

    public double getRong() {
        return rong;
    }

    public void setRong(double rong) {
        this.rong = rong;
    }

    public double getChuVi() {
        return (this.dai + this.rong) * 2;
    }

    public double getDienTich() {
        return (this.dai * this.rong);
    }

    public void xuat() {
        System.out.println("chiều dài  là  " + dai);
        System.out.println("chiều rộng  là  " + rong);
        System.out.println("chu vi HCN là   " + getChuVi());
        System.out.println("diện tich HCN là " + getDienTich());
    }
}

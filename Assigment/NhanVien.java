/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assigment;

/**
 *
 * @author JosCongQuy
 */
public class NhanVien {

    private String maNV;
    protected double luong;
    private String hoTen;

    public NhanVien(String maNV, double luong, String hoTen) {
        this.maNV = maNV;
        this.luong = luong;
        this.hoTen = hoTen;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public NhanVien() {
    }

    Double thuNhap() {
        return luong;
    }

    double thue() {
        if (thuNhap() < 9000000) {
            return 0;
        } else if (thuNhap() <= 15000000) {
            return thuNhap() * 0.1;
        }
        return thuNhap() * 0.12;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "maNV=" + maNV + ", luong=" + luong + ", hoTen=" + hoTen + '}';
    }
    
}

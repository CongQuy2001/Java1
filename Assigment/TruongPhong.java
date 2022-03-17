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
public class TruongPhong extends NhanVien {

    private double TrachNhiem;

    public TruongPhong(double TrachNhiem, String maNV, double luong, String hoTen) {
        super(maNV, luong, hoTen);
        this.TrachNhiem = TrachNhiem;
    }

    public TruongPhong(double TrachNhiem) {
        this.TrachNhiem = TrachNhiem;
    }

    @Override
    public String toString() {
        return "TruongPhong{" + super.toString() + "TrachNhiem=" + TrachNhiem + '}';
    }


    @Override
    double thue() {
        if (thuNhap() < 9000000) {
            return 0;
        } else if (thuNhap() <= 15000000) {
            return thuNhap() * 0.1;
        }
        return thuNhap() * 1.2;

    }

    @Override
    Double thuNhap() {
        return luong + TrachNhiem;
    }

}

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
public class TiepThi  extends NhanVien {
    private  double doanhSoBanHang;
    private double hoaHong;

    public TiepThi(double doanhSoBanHang, double hoaHong, String maNV, double luong, String hoTen) {
        super(maNV, luong, hoTen);
        this.doanhSoBanHang = doanhSoBanHang;
        this.hoaHong = hoaHong;
    }

    public TiepThi(double doanhSoBanHang, double hoaHong) {
        this.doanhSoBanHang = doanhSoBanHang;
        this.hoaHong = hoaHong;
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
    public String toString() {
        return "TiepThi{" + super.toString() + "doanhSoBanHang=" + doanhSoBanHang + ", hoaHong=" + hoaHong + '}';
    }

    
    @Override
    Double thuNhap() {
        return  luong + doanhSoBanHang *hoaHong; // luong bang danh so ban hang * % hoa hong
    }

   
    
    
}

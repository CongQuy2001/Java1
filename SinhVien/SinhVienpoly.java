/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SinhVien;

/**
 *
 * @author JosCongQuy
 */
public class SinhVienpoly {

    double diem;
    private String mssv;
    private String ten;

    SinhVienpoly(String name, double grade, String rollNumber) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public SinhVienpoly() {
    }

    public SinhVienpoly(double diem, String mssv, String ten) {
        this.diem = diem;
        this.mssv = mssv;
        this.ten = ten;
    }

    @Override
    public String toString() {
        return "SinhVienpoly{" + "diem=" + diem + ", mssv=" + mssv + ", ten=" + ten + '}';
    }

   

}

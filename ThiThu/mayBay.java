/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThiThu;

/**
 *
 * @author JosCongQuy
 */
public class mayBay {
    private  String ten;
    private  double  tuoi;
    private double  canNang;
    private  double vong3;
    private  double  SDT;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getTuoi() {
        return tuoi;
    }

    public void setTuoi(double tuoi) {
        this.tuoi = tuoi;
    }

    public double getCanNang() {
        return canNang;
    }

    public void setCanNang(double canNang) {
        this.canNang = canNang;
    }

    public double getVong3() {
        return vong3;
    }

    public void setVong3(double vong3) {
        this.vong3 = vong3;
    }

    public double getSDT() {
        return SDT;
    }

    public void setSDT(double SDT) {
        this.SDT = SDT;
    }

    public mayBay() {
    }

    public mayBay(String ten, double tuoi, double canNang, double vong3, double SDT) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.canNang = canNang;
        this.vong3 = vong3;
        this.SDT = SDT;
    }

    @Override
    public String toString() {
        return "mayBay{" + "ten=" + ten + ", tuoi=" + tuoi + ", canNang=" + canNang + ", vong3=" + vong3 + ", SDT=" + SDT + '}';
    }
    
}

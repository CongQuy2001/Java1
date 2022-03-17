/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnTap;

/**
 *
 * @author JosCongQuy
 */
public class mayBay {

    private String hoten;
    private double canNang;
    private double vong1;
    private double tuoiTho;
    private String SDT;
    private String urename;
    private String pass;

    public String getUrename() {
        return urename;
    }

    public void setUrename(String urename) {
        this.urename = urename;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "mayBay{" + "hoten=" + hoten + ", canNang=" + canNang + ", vong1=" + vong1 + ", tuoiTho=" + tuoiTho + ", SDT=" + SDT + '}';
    }

    public mayBay(String hoten, double canNang, double vong1, double tuoiTho, String SDT) {
        this.hoten = hoten;
        this.canNang = canNang;
        this.vong1 = vong1;
        this.tuoiTho = tuoiTho;
        this.SDT = SDT;
    }

    public mayBay() {
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public double getCanNang() {
        return canNang;
    }

    public void setCanNang(double canNang) {
        this.canNang = canNang;
    }

    public double getVong1() {
        return vong1;
    }

    public void setVong1(double vong1) {
        this.vong1 = vong1;
    }

    public double getTuoiTho() {
        return tuoiTho;
    }

    public void setTuoiTho(double tuoiTho) {
        this.tuoiTho = tuoiTho;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

}

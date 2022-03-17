/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7.qlsv;

/**
 *
 * @author JosCongQuy
 */
public class SinhVienIT extends PolySinhVien{
    private double diemJava;
    private double diemHtml;
    private double diemCss;

    public SinhVienIT(double diemJava, double diemHtml, double diemCss) {
        this.diemJava = diemJava;
        this.diemHtml = diemHtml;
        this.diemCss = diemCss;
    }

    public SinhVienIT(double diemJava, double diemHtml, double diemCss, String hoten, String ngành) {
        super(hoten, ngành);
        this.diemJava = diemJava;
        this.diemHtml = diemHtml;
        this.diemCss = diemCss;
    }
    
    
    @Override
    public double getdiem() {
        return (this.diemJava + this.diemHtml + this.diemCss);
    }

    public double getDiemJava() {
        return diemJava;
    }

    public void setDiemJava(double diemJava) {
        this.diemJava = diemJava;
    }

    public double getDiemHtml() {
        return diemHtml;
    }

    public void setDiemHtml(double diemHtml) {
        this.diemHtml = diemHtml;
    }

    public double getDiemCss() {
        return diemCss;
    }

    public void setDiemCss(double diemCss) {
        this.diemCss = diemCss;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NguoiYeu;

/**
 *
 * @author JosCongQuy
 */
public class ny {

    private String ten;
    private Double tuoi;   
    /**
     * indicator v3
     */
    Double soDoVongBa;

    
    public ny() {
    }

    public ny(String ten, double tuoi, double soDoVongBa) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.soDoVongBa = soDoVongBa;
    }

    @Override
    public String toString() {
        return "ny{" + "ten=" + ten + ", tuoi=" + tuoi + ", soDoVongBa=" + soDoVongBa + '}';
    }

    public Double getTuoi() {
        return tuoi;
    }

    public void setTuoi(Double tuoi) {
        this.tuoi = tuoi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Double getSoDoVongBa() {
        return soDoVongBa;
    }

    public void setSoDoVongBa(Double soDoVongBa) {
        this.soDoVongBa = soDoVongBa;
    }
}

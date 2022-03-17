/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chuoi;

/**
 *
 * @author JosCongQuy
 */
public class maxBook extends lapTop {
    private  String HeDieuHanh;

    public maxBook(String HeDieuHanh, String name, double price) {
        super(name, price);
        this.HeDieuHanh = HeDieuHanh;
    }

    public String getHeDieuHanh() {
        return HeDieuHanh;
    }

    public void setHeDieuHanh(String HeDieuHanh) {
        this.HeDieuHanh = HeDieuHanh;
    }
    public  void Show() {
        super.showInfo();
        System.out.println("hệ điều hành là "  +getHeDieuHanh());
    }
    
}

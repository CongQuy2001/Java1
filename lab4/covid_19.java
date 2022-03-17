/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author JosCongQuy
 */
public class covid_19 {
    public static void main(String[] args) {
        ViRut vr1 = new ViRut();
        System.out.println("nhập thông tin");
        vr1.nhapVR();
        System.out.println("xuất thông tin");
        vr1.xuat();
       ViRut vr2 = new ViRut("xanh", "hà");
       vr2.xuat();
       ViRut vr3 = new ViRut("hồng", "song");
       vr3.xuat();
    }
}

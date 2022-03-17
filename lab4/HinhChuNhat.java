/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.Scanner;

/**
 *
 * @author JosCongQuy
 */
public class HinhChuNhat {

    private int chieuDai;
    private int chieuRong;
    public int getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(int chieuDai) {
        this.chieuDai = chieuDai;
    }

    public int getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(int chieuRong) {
        this.chieuRong = chieuRong;
    }

    public int dienTich() {
        int dienTich = this.chieuDai * this.chieuRong;
        return dienTich;
    }

    public int chuVi() {
        int chuVi = (this.chieuDai + this.chieuRong) * 2;
        return chuVi;
    }

    @Override
    public String toString() {
        return "\nchieuDai  = " + chieuDai + ",  \nchieuRong  = " + chieuRong + ", \nchuVi  =  " + chuVi() + ", \ndienTich  = " + dienTich();
    }

}

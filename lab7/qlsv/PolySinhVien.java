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
public abstract class PolySinhVien {

    private String hoten;
    private String ngành;

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNgành() {
        return ngành;
    }

    public void setNgành(String ngành) {
        this.ngành = ngành;
    }

    public PolySinhVien() {
    }

    public PolySinhVien(String hoten, String ngành) {
        this.hoten = hoten;
        this.ngành = ngành;
    }

    public abstract double getdiem();

    public void gethocLuc() {
        if (getdiem() < 5) {
            System.out.println("học lực yếu");
        } else if (getdiem() >= 5 && getdiem() <= 6.5) {
            System.out.println("học lực trung bình");
        } else if (getdiem() >= 6.5 && getdiem() < 7.5) {
            System.out.println("học lực khá");
        } else if (getdiem() >= 7.5 && getdiem() < 9) {
            System.out.println("học lực giỏi");
        }
        if (getdiem() > 9) {
            System.out.println("học lực xuất sắc");
        }
    }

    public void printStudent() {
        System.out.println("tên Sinh Viên là  " + getHoten());
        System.out.println("ngành học của Sinh Viên là  " + getNgành());
        System.out.println("điểm của Sinh Viên là  " + getdiem());
        System.out.println("SInh viên có hk lục là " + getdiem());
    }
}

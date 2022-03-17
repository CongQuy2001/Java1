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
public class lapTop {
    private  String name;
    private double  price;

    public lapTop() {
    }

    public lapTop(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public  void showInfo() {
        System.out.println("tên là " +getName());
        System.out.println("giá là " +getPrice());
    }
}

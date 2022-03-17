/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

/**
 *
 * @author lecon
 */
enum HoliDay {
    WESTERN_NEW_YEAR(1, 1),
    CHRISTMAS(25, 12);

    private final int day;

    private final int month;

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    HoliDay(int day, int month) {
        this.day = day;
        this.month = month;
    }
}

public class Main {

    public static void main(String[] args) {
        System.out.println(HoliDay.CHRISTMAS.getDay());
        System.out.println(HoliDay.CHRISTMAS.getMonth());
    }
}



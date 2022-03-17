/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

import lop_doituong.SinhVien;
import java.util.ArrayList;

/**
 *
 * @author JosCongQuy
 */
public class demoarraylist {

    public static void main(String[] args) {
//     ArrayList không định kiểu
        ArrayList list = new ArrayList();
        list.add("hahahah");
        list.add(123);
        list.add(123.456);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        list.stream().forEach((list1) -> {
            System.out.println(list1);
        });

//        ArrayList có định kiểu
        ArrayList<String> list1 = new ArrayList();
        list1.add("meo meo");
        for (String list11 : list1) {
            System.out.println(list11);
        }

//        kiểu đối tượng
        SinhVien sv1 = new SinhVien(9);
        SinhVien sv2 = new SinhVien("meo", 20, 30.5);
        SinhVien sv3 = new SinhVien("mèo", 15, 19);
        ArrayList<SinhVien> listSV = new ArrayList();
        listSV.add(sv1);
        listSV.add(sv2);
        listSV.add(sv3);
        for (SinhVien listSV1 : listSV) {
            System.out.println(listSV1);
        }
       
    }

}

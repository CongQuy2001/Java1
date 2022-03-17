/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author JosCongQuy
 */
public class mang {

    public static void main(String[] args) {
        int array[] = new int[10];
          Random rand = new Random(); 
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10); 
        }
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("index mảng vừa hiển thị");
        int index;
        for(index =0 ; index< array.length;index ++){
            System.out.println(index);}
    }

}

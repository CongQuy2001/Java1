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
//    String one = firstOfFirst(Arrays.asList("one", "two"), Collections.emptyList());
//
//assertEquals("one", one);
/*
  static <T> T[] toArray(T... arguments) {
    return arguments;
}
 */
public class VarargsExample1 {
//    public static void add( int... values) {
//        int total = 0;
//        for (int i = 0; i < values.length; i++) {
//            total = total + values[i];
//        }
//        System.out.println("So doi so: " + values.length);
//        System.out.println("Tong = " + total);
//    }
// 
//    public static void main(String[] args) {
//        add();
//        add(1, 2);
//        add(1, 2, 3);
//        add(1, 2, 3, 4);
//    }

//    static void display(String... values){  
//  System.out.println("display method invoked ");  
//  for(String s:values){  
//   System.out.println(s);  
//  }  
// }  
//  
// public static void main(String args[]){  
//  
// display();//zero argument   
// display("hello");//one argument   
// display("my","name","is","varargs");//four arguments  
// }   
//}
    static int summary(int... intArrays) {
        int sum, i;
        sum = 0;
        for (i = 0; i < intArrays.length; i++) {
            sum += intArrays[i];
        }
        return (sum);
    }

    public static void main(String args[]) {
        int sum = 0;
        sum = summary(new int[]{10, 12, 33, 44, 55});
        System.out.println("The sum of the numbers is: " + sum);
    }
}

//    public static void main(String[] args) {
//        add(5,50);
//        add(5,7,9);
//    }
//
//    public static void add(int... s){
//        System.out.println(s.length);
//        int sum=0;
//        for(int num:s)
//            sum=sum+num;
//        System.out.println("sum is "+sum );
//    }


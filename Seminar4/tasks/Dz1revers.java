package tasks;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Collections; 

public class Dz1revers {
    
    public static void main(int[] arr) {
        
        System.out.println("Исходный массив: " + Arrays.toString(arr));
        System.out.print("Перевернутый массив: [");
        for (int i = arr.length; i>1; i--){ // уловка, чтобы распечатать последний элемент без запятой и без пробела
            System.out.print((arr[i-1]) + ", ");
        }System.out.print(arr[0] + "]");
        System.out.println();
    }
    public static void revers(int[] arr) {
        LinkedList<Integer> list = new LinkedList<Integer>(); 
        for (int i=0; i< arr.length; i++){
            list.add(arr[i]);
        }
        Collections.reverse(list);
        System.out.println("Развернутый Связанный список: " + list); 
    }
}

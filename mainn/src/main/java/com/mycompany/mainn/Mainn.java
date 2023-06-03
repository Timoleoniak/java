

package com.mycompany.mainn;


public class Mainn {
    
    public static  <T extends Comparable<T>>{
    
}

    
    public static <T> void findMinMax(T[] arr, int i , int j){
         if(i < 0 || i > arr.length || j < 0 || j > arr.length){
                        throw new IndexOutOfBoundsException("Invalid index");
                }
    }
}

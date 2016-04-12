/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaTutorials;

/**
 *
 * @author Ruhani
 */
public class ArrayCopyOfDemo {
    public static void main(String[] args) { 
     int[] arrayOfInt = {22, 23, 26, 29, 31, 58} ;
     
     //searching value in the entire array
     int searchIndex_47 = java.util.Arrays.binarySearch(arrayOfInt, 47) ;
     int searchIndex_29 = java.util.Arrays.binarySearch(arrayOfInt, 29) ;
     System.out.println("searchIndex_47: " +  searchIndex_47);
     System.out.println("searchIndex_29: " +  searchIndex_29 +  "\n");
     
     //searching a value in a range
     int searchIndexRange_47 = java.util.Arrays.binarySearch(arrayOfInt, 1, 4, 47) ;
     int searchIndexRange1_23 = java.util.Arrays.binarySearch(arrayOfInt, 1, 1, 23) ;
     System.out.println(" searchIndexRange_47: " +  searchIndexRange_47);
     System.out.println("searchIndexRange1_47: " +  searchIndexRange1_23);
     
    }
}

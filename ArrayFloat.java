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
public class ArrayFloat {
    public static void main(String[] args) {
        
        float[] arrayFloat1 = {12.34f, 2+3, 3/4f, 34.359759758753f} ;
        displayElements(arrayFloat1) ;
        
        float[] arrayFloat2 = {12.34f, 1+4, 25*0.03f, 34.35975975875f} ;
        displayElements(arrayFloat2) ;
        
        //equals method
        if(java.util.Arrays.equals(arrayFloat1, arrayFloat2)) 
            System.out.println("\narrayFloat1 and arrayFloat2 are equal");
        else
            System.out.println("\narrayFloat1 and arrayFloat2 are not equal");
        
        //binarySearch method
        float[] arrayFloat3 = {34.359759758753f, 34.35975975875f, 34.35976f} ;
        displayElements(arrayFloat3) ;
        System.out.println("\n34.35976 found at index = " + java.util.Arrays.binarySearch(arrayFloat3, 34.35976f)) ;
        System.out.println("\n34.35976 found at index = " + java.util.Arrays.binarySearch(arrayFloat3, 0, 2, 34.35976f)) ;
        
        //copy array 
        float[] arrayFloat3Copy = java.util.Arrays.copyOfRange(arrayFloat3, 0, arrayFloat3.length) ;
        displayElements(arrayFloat3Copy) ;
        
        //sort array
        java.util.Arrays.sort(arrayFloat3) ;
        displayElements(arrayFloat3) ;
        
        //fill array 
        java.util.Arrays.fill(arrayFloat3, 4783.4764f);
        displayElements(arrayFloat3) ;
    }
    
    public static void displayElements(float[] arrayOfFloat) {
        int counter = 0;
        System.out.println("\nElements of array:");
        while(counter < arrayOfFloat.length) {
            System.out.print(arrayOfFloat[counter] + " ");
            counter+=1 ;
        }
        System.out.println() ;
        
    }
}

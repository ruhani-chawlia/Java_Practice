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
public class ArrayDemo {
    public static void main (String[] args) {
        //declare array -- array type and array name 
        int[] anArrayOfInt ; 
        //create array of int and assign it to the variable declared above 
        anArrayOfInt = new int[5] ;
        
        //creating array in one step 
        char[] anArrayOfChar = new char[5] ;
        
        //by default, new operator initializes each int element to zero and each char element to null
        System.out.println("Elements' default value initialized by new operator:");
        System.out.println(anArrayOfInt[0]) ;
        System.out.println(anArrayOfInt[1]) ;
        System.out.println(anArrayOfInt[2]) ;
        System.out.println(anArrayOfInt[3]) ;
        System.out.println(anArrayOfInt[4]) ;
        System.out.println() ;
        System.out.println(anArrayOfChar[0]);
        System.out.println(anArrayOfChar[1]);
        System.out.println(anArrayOfChar[2]);
        System.out.println(anArrayOfChar[3]);
        System.out.println(anArrayOfChar[4]);
        
        //initialize array of int
        anArrayOfInt[0] = 10 ;
        anArrayOfInt[1] = 20 ;
        anArrayOfInt[2] = 30 ;
        anArrayOfInt[3] = 40 ;
        anArrayOfInt[4] = 50 ;
        //initialize array of char
       anArrayOfChar[0] = 'a';
       anArrayOfChar[1] = 'b';
       anArrayOfChar[2] = 'c';
       anArrayOfChar[3] = 'd';
       anArrayOfChar[4] = 'e';
       
       //display array elements 
        System.out.println("Elements' new values initialized by the programmer: ");
        System.out.println(anArrayOfInt[0]) ;
        System.out.println(anArrayOfInt[1]) ;
        System.out.println(anArrayOfInt[2]) ;
        System.out.println(anArrayOfInt[3]) ;
        System.out.println(anArrayOfInt[4]) ;
        System.out.println() ;
        System.out.println(anArrayOfChar[0]);
        System.out.println(anArrayOfChar[1]);
        System.out.println(anArrayOfChar[2]);
        System.out.println(anArrayOfChar[3]);
        System.out.println(anArrayOfChar[4]);
        
        //creating and initializing array in one step 
        int[] arrayOfInt2 = {1,2,3,4,5} ;
        System.out.println("\nElements of array created and initialized in one step:") ;
        System.out.println(arrayOfInt2[0]) ;
        System.out.println(arrayOfInt2[1]) ;
        System.out.println(arrayOfInt2[2]) ;
        System.out.println(arrayOfInt2[3]) ;
        System.out.println(arrayOfInt2[4]) ;
    }
}

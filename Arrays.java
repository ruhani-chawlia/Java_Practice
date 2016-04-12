/*
 * program to understand arrays in Java 
 */
package JavaTutorials;

/**
 *
 * @author Ruhani
 * Date: 26-Mar-2016
 */
public class Arrays {
    public static void main(String[] args) {
        /*
        1) declaring array variable
        2) creating an array object
        3) assigning the array to the variable. By default, elemements will be initialized to their default value by the new operator.
        4) initializing the elements 
        5) accessing the elements through the index
        */
        
        //creating arays 
        int[] arrayOfInt = {22, 12, 32, 100, 9} ;
        char[] arrayOfChar  = {'x', 'g', 'f', 'h', 'A' } ;
        String[] arrayOfString  = {"Ruhani", "Charan", "sheru"} ;
        
        //copying arrays for backup
        int[] copyOfArrayOfInt = java.util.Arrays.copyOfRange(arrayOfInt, 0, arrayOfInt.length) ;
        char[] copyOfArrayOfChar = java.util.Arrays.copyOfRange(arrayOfChar, 0, arrayOfChar.length) ;
        String[] copyOfArrayOfString = java.util.Arrays.copyOfRange(arrayOfString, 0, arrayOfString.length) ;
        
        //sorting entire arrays
        java.util.Arrays.sort(arrayOfInt);
        java.util.Arrays.sort(arrayOfChar);
        java.util.Arrays.sort(arrayOfString);
        
        //displaying array elements
        System.out.println("Sorting entire arrays: ") ;
        displayElements(arrayOfInt, arrayOfChar, arrayOfString) ;
   
        //copying from backup to original
        arrayOfInt = java.util.Arrays.copyOfRange(copyOfArrayOfInt, 0, copyOfArrayOfInt.length) ;
        arrayOfChar = java.util.Arrays.copyOfRange(copyOfArrayOfChar, 0, copyOfArrayOfChar.length) ;
        arrayOfString = java.util.Arrays.copyOfRange(copyOfArrayOfString, 0, copyOfArrayOfString.length) ;
        
        //displaying array elements
        System.out.println("\nUnsorted arrays: ") ;
        displayElements(arrayOfInt, arrayOfChar, arrayOfString) ;
        
        //sorting fromIndex ToIndex
        java.util.Arrays.sort(arrayOfInt, 0, 3) ;
        java.util.Arrays.sort(arrayOfChar, 1, 4);
        java.util.Arrays.sort(arrayOfString, 1, 3);
        
        //displaying array elements
        System.out.println("\nSorting from index to index: ") ;
        displayElements(arrayOfInt, arrayOfChar, arrayOfString) ;
        
        //checking whether two arrays are equal or not
        byte[] arrayOfByte1 = {10, 20, 30, 40, 50} ;
        byte[] arrayOfByte2 = {10, 20, 30, 40, 50,};
        
        //two arrays are equal if they contain same elements in the same order
        if(java.util.Arrays.equals(arrayOfByte1, arrayOfByte2))
            System.out.println("\narrayOfByte1 and arrayOfByte2 are equal arrays when checked from equals method") ;
        //here, equals method checks whether the two arrays contain same elements in the same order or not
        
        if(arrayOfByte1 == arrayOfByte2)
            System.out.println("\narrayOfByte1 and arrayOfByte2 are same arrays when checked from == operator ") ;
        //here, == operator checks whether the two array references point to the same object or not
        //Since, they point to two different objects, == operator returns false
        
        //Let's make arrayOfByte1 and arrayOfByte2 point to the same object
        arrayOfByte1 = arrayOfByte2 ;
        if(arrayOfByte1 == arrayOfByte2)
            System.out.println("\narrayOfByte1 and arrayOfByte2 are same arrays when checked from == operator ") ;
        //Since, they point to the same object now, == returns true
        
        //learning about fill method
        java.util.Arrays.fill(arrayOfByte1, (byte)100);
        //display array elements
        displayElements(arrayOfByte1) ;
        java.util.Arrays.fill(arrayOfByte1, 0, 2, (byte)10);
        displayElements(arrayOfByte1) ;
        
        //learning about binary search
        System.out.println(java.util.Arrays.binarySearch(arrayOfByte1, (byte)100));        
        /*
        byte[] arrayOfByte3 = {,} ;
        byte[] arrayOfByte4 = {} ;
        System.out.println("\nlength of arrayOfByte3 = " + arrayOfByte3.length) ; 
        System.out.println("length of arrayOfByte4 = " + arrayOfByte4.length) ; 
        
        char[] arrayOfChar2 = {,} ;
        System.out.println("length of arrayOfChar2 = " + arrayOfChar2.length) ;
        */
    }
    
    public static void displayElements(int[] arrayOfInt, char[] arrayOfChar, String[] arrayOfString) {
        int counter = 0;
        System.out.println("Sorted elements of arrayOfInt:");
        while(counter < arrayOfInt.length) {
            System.out.print(arrayOfInt[counter] + " ");
            counter+=1 ;
        }
        System.out.println("\nSorted elements of arrayOfChar:");
        counter = 0 ;
        while(counter < arrayOfChar.length) {
            System.out.print(arrayOfChar[counter] + " ");
            counter+=1 ;
        }
        System.out.println("\nSorted elements of arrayOfString:");
        counter = 0 ;
        while(counter < arrayOfString.length) {
            System.out.print(arrayOfString[counter] + " ");
            counter+=1 ;
        }
        System.out.println() ;
    }
    
        public static void displayElements(byte[] arrayOfByte) {
        int counter = 0;
        System.out.println("\nSorted elements of arrayOfByte:");
        while(counter < arrayOfByte.length) {
            System.out.print(arrayOfByte[counter] + " ");
            counter+=1 ;
        }
        
    }
}

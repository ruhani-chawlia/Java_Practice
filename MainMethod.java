/*
 * Program to check how the main method should be called
 */
package JavaTutorials;

/**
 *
 * @author Ruhani
 * Date: 26-Mar-2016
 */

public class MainMethod { //This class cannot be declared private. If declared, complile-time error: modifier private not allowed here
    
     public static void main(String[] args) {
        System.out.println("Inside main");
        //return 10 ;
        method2() ; //a static method (here, main method) can't call a non-static method 
        System.out.println("Inside main again");
        System.exit(0) ;
    }
     
     static void method2() {
         System.out.println("Inside method2");
     }
    
    /**
     * 1) If we skip public or static or the command-line arguments from the signature,
          the application would get compiled successfully
          but we'll get a runtime error: Class "JavaTutorials.MainMethod" does not have a main method
     * 2) Specifying main method as private will also produce the same runtime error
     * 3) position of static and public can be interchanged in the signature but as per the convention, public is followed by static
     */
}

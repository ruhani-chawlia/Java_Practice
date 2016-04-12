/**
 * Program to understand variables in Java
 */


package JavaTutorials ; 

/**
 *
 * @author Ruhani
 * Date: 26-Mar-2016
 */

public class Variables {
    
    /* 
     * instance variable or non-static field. Initiliazed to its default value by the default constructor 
     * (if no constructor is defined in the class) at the time of creation of an object.
     */
    byte byteVar ; //size of 1 byte
    short shortVar ; //size of 2 bytes
    int intVar ; //size of 4 bytes
    long longVar ; //size of 8 bytes
    float floatVar ; //size of 4 bytes
    double doubleVar ; //size of 8 bytes
    char charVar ; //size of 2 bytes, can store Unicode characters
    boolean booleanVar ; //represents 1 bit information. Size is not precisely defined. 
    String stringVar ; //object of String class
    
 
    //unparameterized constructor
    Variables() {
         byteVar = 0 ;
         shortVar = 0 ;
         intVar = 0 ;
         longVar = 0 ;
         floatVar = 0.0f ;
         doubleVar = 0.0d ;
         charVar = '\u0000' ;
         booleanVar = false ;
         stringVar = null ;
    }
    
     //parametrized constructor    
    Variables(byte newValueByte, short newValueShort, int newValueInt, long newValueLong, 
            float newValueFloat, double newValueDouble, char newValueChar, boolean newValueBoolean, String newobjectString) {
         byteVar = newValueByte ;
         shortVar = newValueShort ;
         intVar = newValueInt ;
         longVar = newValueLong ;
         floatVar = newValueFloat ;
         doubleVar = newValueDouble ;
         charVar = newValueChar ;
         booleanVar = newValueBoolean ;
         stringVar = newobjectString ;
    }
    
    public static void main(String[] args) { //args is a variable that references to a String array. It's a parameter
       
        Variables var1 = new Variables() ; //creating an object of Variables class
        
        System.out.println("Displaying instance variables for var1 object:");
        System.out.println("Value of instance variable byteVar is " + var1.byteVar) ; //default value 0 will be printed
        System.out.println("Value of instance variable shortVar is " + var1.shortVar) ; //default value 0 will be printed
        System.out.println("Value of instance variable intVar is " + var1.intVar) ; //default value 0 will be printed
        System.out.println("Value of instance variable longVar is " + var1.longVar) ; //default value of 0L will be printed
        System.out.println("Value of instance variable floatVar is " + var1.floatVar) ; //default value 0.0 (0.0f) will be printed
        System.out.println("Value of instance variable doubleVar is " + var1.doubleVar) ; //default value 0.0 (0.0d) will be printed
        System.out.println("Value of instance variable charVar is " + var1.charVar) ; //default value '\u0000' (null) will be printed
        System.out.println("Value of instance variable booleanVar is " + var1.booleanVar) ; //default value false will be printed
        System.out.println("Value of instance variable stringVar is " + var1.stringVar) ; //default value null will be printed since the 
                                                                                         // variable is not pointing to any String object
        System.out.println() ;
        
        Variables var2 = new Variables((byte)100, (short)32333, 3737276, 2475274854875L, 
                234752487245.23478475875f, 234752487245.23478475875, 'K', true, "Hello") ; //creating an object of Variables class
        //type casting is required for byte and short otherwise we get compile-time error 
        //arguments must have the same data type as parameters in the signature 
        System.out.println("Displaying instance variables for var2 object:");
        System.out.println("Value of instance variable byteVar is " + var2.byteVar) ; //default value 0 will be printed
        System.out.println("Value of instance variable shortVar is " + var2.shortVar) ; //default value 0 will be printed
        System.out.println("Value of instance variable intVar is " + var2.intVar) ; //default value 0 will be printed
        System.out.println("Value of instance variable longVar is " + var2.longVar) ; //default value of 0L will be printed
        System.out.println("Value of instance variable floatVar is " + var2.floatVar) ; //default value 0.0 (0.0f) will be printed
        System.out.println("Value of instance variable doubleVar is " + var2.doubleVar) ; //default value 0.0 (0.0d) will be printed
        System.out.println("Value of instance variable charVar is " + var2.charVar) ; //default value '\u0000' (null) will be printed
        System.out.println("Value of instance variable booleanVar is " + var2.booleanVar) ; //default value false will be printed
        System.out.println("Value of instance variable stringVar is " + var2.stringVar) ; //default value null will be printed since the 
                                                                                         // variable is not pointing to any String object
        System.out.println() ;
        

     /* Understanding literals 
      * -- Variables below are local variables and not fields. It's essential to initialize them before we use them.
      * -- Numeric literals are of int data type by default. 
      * -- Floating-point literals are of double data type by default. Hence, 'f' needs to be suffixed while initializing float variables.
      * -- Values can be defined as per the defined range of the data type. 
      * -- underscore can be used in numeric literals to improve readability.
      */
        byte byteVar = 127 ; 
        short shortVar = 32_767 ;
        int intVar = 2_147_483_647 ;
        long longVar = 2_147_483_648L ; //if the int literal is out of (int) range, suffix 'L' to make it a long literal
        float floatVar = 123_456_789_829.72_452_464f ; //we will get compile-time error if 'f' is not suffixed after the literal
        double doubleVar = 7_438_625_782_569_285_623_587.347_235_786_587_256_875 ; 
        char charVar = 'R' ;
        boolean booleanVar = true ; //can assign only true or false. 'True' or 'False' will not work here. 
        String stringVar = new String("Ruhani"); 
        //String stringVar = "Ruhani"; would have worked the same way
        System.out.println("Displaying local variables declared inside main method:") ;
        System.out.println("Value of local variable byteVar is " + byteVar) ; 
        System.out.println("Value of local variable shortVar is " + shortVar) ; 
        System.out.println("Value of local variable intVar is " + intVar) ; 
        System.out.println("Value of local variable longVar is " + longVar) ; 
        System.out.println("Value of local variable floatVar is " + floatVar) ; 
        System.out.println("Value of local variable doubleVar is " + doubleVar) ; 
        System.out.println("Value of local variable charVar is " + charVar) ; 
        System.out.println("Value of local variable booleanVar is " + booleanVar) ; 
        System.out.println("Value of local variable stringVar is " + stringVar) ; 
    }
    
}

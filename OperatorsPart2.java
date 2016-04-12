/*
 * This program is about types of operators 
 *           equality and relational operators --> ==, !=, <, >, <=, >=
 *                       conditional operators --> &&, ||, ?:
 *                The type comparison operator --> instanceof
 */
package JavaTutorials;

/**
 *
 * @author Ruhani
 */


public class OperatorsPart2 {
    public static void main(String[] args) {
        
        //Learning conditional operators --> ?:, &&, ||
         // 1) Ternary operator ?: --> uses three operands, equivalent to if-then-else
        double d1 = 47_826_347_826.3_247_465 ;
        double d2 = 47_826_347_826.3_247_400 ;
        String result = d1==d2 ? "d1 equal to d2" : "d1 not equal to d2" ;                                                          
        System.out.println("d1 = " + d1) ;
        System.out.println("d2 = " + d2) ;
        System.out.println(result) ;
        
        result = new Float(11.2f).equals(new Float(11.24f)) ? "float values equal" : "float values not equal" ;
        System.out.println(result) ;
        
        result = (new Float(11.3535f)).floatValue() == (new Float(11.3535f)).floatValue() ? "float values equal" : "float values not equal" ;
        System.out.println(result) ;
        
         // 2) short-circuit AND --> &&
               // && operator performs conditional-AND operation on two boolean expressions
               // second operand is evaluated only if the first operand evaluates to true
        int a = 123 ;
        int b = 12 ;
        if(a==123 && b==12)
            System.out.println("a=123 AND b=12");
        if(a==12 && b==123)
            System.out.println("a=12 AND b=123");
        if(true && true)
            System.out.println("both expressions are true. This will get printed."); 
        if(true && false)
            System.out.println("second expression evaluated because first operand is true. This will not get printed.");
        if(false && true)
            System.out.println("second expression not evaluated because first operand is false. This will not get printed.");
        
        // 3) short-circuit OR --> ||
               // || operator performs conditional-OR operation on two boolean expressions
               // second operand is evaluated only if the first operand evaluates to false
        int c = 10 ;
        int d = 20 ;
        if(c>5 || d>10) //second operand not evaluated because first operand is true
            System.out.println("c>5 OR d>10"); //This will get printed
        if(c>5 || d<10) //second operand not evaluated because first operand is true
            System.out.println("c>5 OR d>10"); //This will get printed
        if(c<5 || d>10) //second operand evaluated because first operand is false
            System.out.println("c>5 OR d>10"); //This will get printed
        if(c<5 || d<10) //second operand evaluated because first operand is false
            System.out.println("c>5 OR d>10"); //This will not get printed
        
        
        //Learning equality and relational operators --> ==, !=, <, >, >=, <=
        int e = 50 ;
        if(e == 50)
            System.out.println("e == 50") ;
        if(e != 60)
            System.out.println("e != 60") ;
        if(e > 20)
            System.out.println("e > 20") ;
        if(e < 51)
            System.out.println("e < 51") ;
        if(e >= 50)
            System.out.println("e >= 50") ;
        if(e <= 50)
            System.out.println("e <= 50") ;
        
       //Learning instanceof operator 
        /* instanceof operator compares an object to a specified type. 
           We can test it to check if an object is an instance of a 
           - class, or
           - subclass, or
           - a class that implements a paticular interface
        */
        Parent obj1 = new Parent() ;
        Child obj2 = new Child() ;
        System.out.println("obj1 is an instance of Parent = " + (obj1 instanceof Parent)) ; //obj1 is an instance of class Parent
        System.out.println("obj1 is an instance of Child  = " + (obj1 instanceof Child)) ; //obj1 is not an instance of sublass Child
        System.out.println("obj1 is an instance of MyInterface = " + (obj1 instanceof MyInterface)) ; 
        //obj1 is not an instance of a class that implements MyInterface interface
        System.out.println("obj2 is an instance of Parent = " + (obj2 instanceof Parent)) ; //obj2 is an instance of class Parent
        System.out.println("obj2 is an instance of Child = " + (obj2 instanceof Child)) ; //obj2 is an instance of sublass Child
        System.out.println("obj2 is an instance of MyInterface = " + (obj2 instanceof MyInterface)) ;
        //obj2 is an instance of a class that implements MyInterface interface
    }
}

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
public class OperatorsPart1 {
    public static void main(String[] args) {
        
        //understanding unary operators
        int result = +1 ; //unary plus operator; indicates positive value
        System.out.println("unary plus operator = " + result) ;
        result = -result ; //unary minus operator; negates an expression
        System.out.println("unary minus operator = " + result) ;
        ++result ; //increment operator; increments value by 1
        System.out.println("increment operator = " + result) ;
        --result ; //decrement operator; decrements value by 1
        System.out.println("decrement operator = " + result) ;
        boolean boolResult = false ;
        System.out.println("logical complement operator = " + !boolResult) ; //logical complement operator; inverts the value of a boolean
        System.out.println("logical complement operator = " + !(4>3)) ; //4>3 is true, so logical complement operator will return false 
        //understanding postfix and prefix increment operators
        result = 1;
        result++ ; //value will remain 1 till result is used next time
        result++ ; //previous value = 2, value will remain 2 till result is used next time
        System.out.println("postfix increment operator = " + result) ; //result = 3
        ++result ; //result = 4
        System.out.println("prefix increment operator = " + result) ; //result = 4
        int incResult = result++ + ++result + result++ ; //postfix has higher predence than prefix increment operator 
                      //  4      +     7    +    5
        System.out.println("incResult value = " + incResult) ; //incResult = 16
        System.out.println("Result value = " + result) ; //result = 7
        
        result = 1;
        result = result++ ; //result = 1
        System.out.println("Result value = " + result) ;
        result = ++result ; //result = 2
        System.out.println("Result value = " + result) ;
        
        result = 1;
        result++ ; //result = 1
        System.out.println("Result value = " + result) ; //result = 2
        ++result ; //result = 3
        System.out.println("Result value = " + result) ; //result = 3
        
        
        //understanding arithmetic operators
        //remainder operator
        float f1 = 10.55f ;
        float float_mod_val = f1 % 5 ; 
        System.out.println("float remainder value = " + float_mod_val);
        
        f1 = 7.3f ;
        float_mod_val = f1 % 5 ;
        System.out.println("float remainder value = " + float_mod_val);
        
        f1 = 0.5f;
        float_mod_val = f1 % 5 ;
        System.out.println("float remainder value = " + float_mod_val);
        
        int i = 4;
        int int_mod_val = i % 5 ;
        System.out.println("int remainder value = " + int_mod_val);
     
        
        //understanding precedence of unary and arithmetic operators
        int value = 1;
        float netValue = value + result % 2 + ++result + result++ * 4 / 5 ;
                      //  1    + result % 2 + ++result +   3      * 4 / 5
                      //  1    + result % 2 +    5     +   3      * 4 / 5
                      //  1    +   5    % 2 +    5     +   3      * 4 / 5
                      //  1    +   5    % 2 +    5     +   3      * 4 / 5
                      //  1    +   1        +    5     +   12         / 5
                      //  1    +   1        +    5     +   2
                      // 9
        System.out.println("netValue = " + netValue);
    } 
}

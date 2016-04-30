/*
 * Program to learn switch statement 
 */
package JavaTutorials;

/**
 *
 * @author Ruhani
 * Date: 26-Apr-2016
 */
public class Switch {
    public static void main(String[] args) {
        
        int month = 6 ;
        String monthName ;
        int year = 100 ;
        
        //switch block with break statement 
        switch (month) {
            case 13%4: monthName = "January" ; //arithmetic expressions can also be used in case labels
                       break ;
            case 2: monthName = "February" ; //if instead of 2, you mention the character which has ASCII value = 2, this case 
                    break ;                  //label will be executed
            case 1+2: monthName = "March" ; 
                      break ;
            //case 3: monthName = "March" ; --duplicate case labels are not allowed. You'll get compile-time error
            case 4: monthName = "April" ; 
                    break ;
            case 5: monthName = "May" ;
                    break ;
            case 2*3: monthName = "June" ; 
                    break ;
            case 3+4: monthName = "July" ; 
                    break ;
            case 8: monthName = "August" ; 
                    break ;
            case 9: monthName = "September" ; 
                    break ;
            case 10: monthName = "October" ; 
                    break ;
            case 11: monthName = "November" ; 
                    break ;
            case 12: monthName = "December" ; 
                    break ;
            default: monthName = "Invalid" ; //default section is optional
        }
        System.out.println("Month name is " + monthName);
        /* If we do not provide default section in the above switch block, the above print statement will throw compile-time error
           saying, monthName variable has not been initialized */
        
        
        //switch block without break statement
        /* This will be implemented using ArrayList class.
         * ArrayList class provides resizable array, which means that elements can be added/removed from the list.  
         * This class implements List interface. 
         * An ArrayList is a dynamic data structure which can be used when there is no upper bound on the number of elements. 
         * On the other hand, an array is a static data structure in which initial size of array cannot be changed. 
        */
        java.util.ArrayList<String> monthList = new java.util.ArrayList<String>() ; //creates an empty list of String objects
        
        switch (month) {
            case 1: monthList.add("January") ; //add(String) method adds a String object at the end of the list
            case 2: monthList.add("February") ; 
            case 3: monthList.add("March") ;
            case 4: monthList.add("April") ;
            case 5: monthList.add("May") ;
            case 6: monthList.add("June") ;  
            case 7: monthList.add("July") ;
            case 8: monthList.add("August") ;
            case 9: monthList.add("September") ;
            case 10: monthList.add("October") ;
            case 11: monthList.add("November") ;
            case 12: monthList.add("December") ;
        }
        
        if (monthList.isEmpty()) //condition will be true only if none of the above case labels get executed
            System.out.println("Invalid month number...");
        else
            System.out.println("Month list: " + monthList);
        
        
        //switch block with multiple case labels
        int numOfDays = 0 ;
        switch (month) {
           case 1: case 3: case 5: case 7: case 8: case 10: case 12:
               numOfDays = 31 ;
               break ;
           case 4: case 6: case 9: case 11:
               numOfDays = 30 ;
               break ;
           case 2:
               if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
                   numOfDays = 29 ;
               else
                   numOfDays = 28 ;
        }
        
        if (numOfDays == 0)
            System.out.println("Invalid month");
        else
            System.out.println("Number of days in the month: " + numOfDays);
        /* If we do not declare numOfDays variable outside the switch block, we'll get compile-time error in the above statement 
        as the scope of numOfDays will only be in the switch block, and not outside it. */
        
        
        //Using String objects in swtich statements' expressions
        monthName = "December" ;
        int returnedMonthNumber = Switch.getMonthNumber(monthName);
        if (returnedMonthNumber < 0) 
            System.out.println("Invalid month name");
        else
            System.out.println("month number for " + monthName + " is " + returnedMonthNumber);
        
        
        //switch block with char data type
        System.out.println("Do you want to continue? (y/n): ") ;
        char choice = 'y' ;
        switch (choice) {
            case 121 : System.out.println("Let's continue."); break ; //we can use ASCII value of characters in case label 
            //case 'y' : System.out.println("Let's continue."); break ; //duplicate case label not allowed
            case 'n' : System.out.println("Let's take a break."); break ;
            default  : System.out.println("Invalid choice.");
        }
        
    }
    
    public static int getMonthNumber (String monthName) { 
        switch (monthName.toLowerCase()) { //Ensure that the expression in any switch statement is not null to prevent        
            case "january": return 1 ;     //NullPointerException from being thrown
            case "february": return 2 ;
            case "march": return 3 ;
            case "april": return 4 ;
            case "may": return 5 ;
            case "june": return 6 ;
            case "july": return 7 ;
            case "august": return 8;
            case "september": return 9; 
            case "october": return 10;
            case "november": return 11;
            case "december": return 12;
            default: return -1; 
        }
    }
}

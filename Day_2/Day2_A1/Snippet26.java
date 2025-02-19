// Snippet 26: 
/*public class Switch { 
 public static void main(String[] args) { 
 int number = 5; 
 switch(number) { 
 case 5: 
 System.out.println("Number is 5"); 
 break; 
 case 5: 
 System.out.println("This is another case 5"); 
 break; 
 default: 
 System.out.println("This is the default case"); 
 } 
 } 
} 



 Error to Investigate: Why does the compiler complain about duplicate case labels? What 
  happens when you have two identical case labels in the same switch block?
---> Error : Duplicate case label – case 5 appears twice, which is not allowed in Java.
     Each case in a switch must be unique to avoid confusion in execution.
     Solution: Remove or modify the duplicate case.*/


// Fixed program
public class Snippet26 {
    public static void main(String[] args) { 
        int number = 5; 
        switch(number) { 
        case 5: 
        System.out.println("Number is 5"); 
        break; 
        case 6: 
        System.out.println("This is another case 5"); 
        break; 
        default: 
        System.out.println("This is the default case"); 
        } 
        } 
}

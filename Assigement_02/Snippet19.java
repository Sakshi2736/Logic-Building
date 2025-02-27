// Snippet 19: 
/*public class Main { 
 public static void main(String[] args) { 
 int a = 10; 
 int b = 0; 
 int result = a / b; 
 System.out.println(result); 
 } 
} 

 What runtime exception is thrown? Why does division by zero cause an issue in Java?
---> Error - Exception in thread "main" java.lang.ArithmeticException: / by zero
     Never divide by zero because it does not allowed in java instead Changing b = 0 to any non-zero value prevents runtime errors.
*/

public class Snippet19 { 
    public static void main(String[] args) { 
    int a = 10; 
    int b = 2; 
    int result = a / b; 
    System.out.println(result); 
    } 
   } 

/*Snippet 7: 
public class UninitializedWhileLoop { 
 public static void main(String[] args) { 
 int count; 
 while (count < 10) { 
 System.out.println(count); 
 count++; 
 } 
 } 
}


? Error to investigate: Why does this code produce a compilation error? What needs to be done to initialize the loop 
  variable properly?
--->The variable count is declared but not initialized, causing a compilation error because count < 10 is checked before 
    assigning it a value so ,Initialize count before the loop
*/
// Fixed program
public class Snippet_07 {
    public static void main(String[] args) { 
        int count=0; 
        while (count < 10) { 
        System.out.println(count); 
        count++; 
        } 
        }    
}

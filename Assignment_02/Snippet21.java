// Snippet 21: 
/*public class Main { 
 public static void main(String[] args) { 
 System.out.println("Hello, World!"); 
 // Missing closing brace here 
} 


 What does the compiler say about mismatched braces?
--->A closing brace (}) is missing, so Java doesn't know where the block ends.
    This causes a syntax error, and the program won't compile.
*/


// fix
public class Snippet21 {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        // Missing closing brace here
    }
}

//Snippet 9: 
/*public class Main { 
 public static void main(String[] args) { 
 int class = 10; 
 System.out.println(class); 
 } 
} 


 What error occurs? Why can't reserved keywords be used as identifiers?
--->Compilation Error occurs,because class is a reserved keyword in Java,
    meaning it has a predefined purpose and cannot be used as a variable name.
    1.Reserved Keywords Have Special Meaning.
    2.Avoids Confusion for the Compiler.
    3.Ensures Code Clarity and Readability*/


// Fixed program
    public class Snippet9 {
    public static void main(String[] args) {
        int myclass =10;
        System.out.println(myclass);
    }
}

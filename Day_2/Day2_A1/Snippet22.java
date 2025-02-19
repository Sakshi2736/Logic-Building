// Snippet 22: 
/*public class Main { 
 public static void main(String[] args) { 
 static void displayMessage() { 
 System.out.println("Message"); 
 } 
 } 
} 


 What syntax error occurs? Can a method be declared inside another method?
--> error: illegal start of expression.The displayMessage() method is inside main(), which is not allowed.
    No, Java does not allow method declarations inside other methods.
    Methods must be declared inside a class, but outside other methods.*/

//Fixed program
public class Snippet22 {
    public static void displayMessage() { // Method moved outside main()
        System.out.println("Message");
    }

    public static void main(String[] args) {
        displayMessage(); // Call the method here
    }
}

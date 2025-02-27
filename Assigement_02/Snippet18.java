// Snippet 18: 
/*public class Main { 
 public static void main(String[] args) { 
 int a = 10; 
 int b = 5; 
 int result = a + b * 2; 
 System.out.println(result); 
 } 
} 
 What is the output of this code? How does operator precedence affect the result?
--->Output=20,Operator precedence follows BODMAS.
    In a + b * 2, multiplication happens first, so the result is 20.
    Using parentheses (a + b) * 2 changes the order, giving 30. 

*/
public class Snippet18 {
    public static void main(String[] args) {
        int a =10;
        int b = 5;
        int  result = (a + b) * 2;
        System.out.println(result);
    }
}

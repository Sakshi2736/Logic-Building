/*Snippet 6: 
public class Main { 
 public static void main(String[] args) { 
 int x = y + 10; 
 System.out.println(x); 
 } 
} 


 What error occurs? Why must variables be declared?
-->In that y var is not declare ,in java it is important that 
   when we use var first we need to declare  with data type and then use.so the program know how to handle them*/


// Fixed program
public class Snippet6 {
  public static void main(String[] args) {
    int y = 12;
    int x = y + 10;
    System.out.println(x);
  }  
}

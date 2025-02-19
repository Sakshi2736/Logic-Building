// Snippet 15: 
/*public class Main { 
 public static void main(String[] args) { 
 int num1 = 10; 
 double num2 = 5.5; 
 int result = num1 + num2; 
 System.out.println(result); 
 } 
} 


 What error occurs when compiling this code? How should you handle different data types 
  in operations?
--->incompatible error occurs because we cannot store double into int that occure type mismatch.
    so use the compatiable data type for the calculation.*/


//Fixed program
public class Snippet15 {
    public static void main(String[] args) { 
        int num1 = 10; 
        double num2 = 5.5; 
        double result = num1 + num2; 
        System.out.println(result); 
        }    
}

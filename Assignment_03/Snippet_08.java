/*Snippet 8: 
public class OffByOneDoWhileLoop { 
 public static void main(String[] args) { 
 int num = 1; 
 do { 
 System.out.println(num); 
 num--; 
 } while (num > 0); 
 } 
} 


? Error to investigate: Why does this loop print unexpected numbers? What adjustments are needed to print the 
   numbers from 1 to 5? 
--->The loop decreases num (num--), causing it to exit immediately after printing 1, 
    instead of counting up to 5 So,Change num-- to num++ and adjust the condition to num <= 5*/


    
//Fixed program
public class Snippet_08 {
    public static void main(String[] args) { 
        int num = 1; 
        do { 
        System.out.println(num); 
        num++; 
        } while (num <=5); 
        }    
}

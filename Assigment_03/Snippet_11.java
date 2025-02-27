/*Snippet 11: 
public class IncorrectLoopUpdate { 
 public static void main(String[] args) { 
 int i = 0; 
 while (i < 5) { 
 System.out.println(i); 
 i += 2; // Error: This may cause unexpected results in output 
 } 
 } 
} 



? Error to investigate: What will be the output of this loop? How should the loop variable be updated to achieve the 
   desired result? 
--->The update i += 2 increases i by 2 in each iteration, causing the loop to print only even numbers (0, 2, 4) instead of the full sequence 0 to 4.
    To print all numbers from 0 to 4 sequentially, update i by 1 (i++) instead of 2 (i += 2).*/



//Fixed progrem
public class Snippet_11 {
    public static void main(String[] args) { 
        int i = 0; 
        while (i < 5) { 
        System.out.println(i); 
        i++;  
        } 
        } 
}

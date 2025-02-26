/*Snippet 9: 
public class InfiniteForLoopUpdate { 
 public static void main(String[] args) { 
 for (int i = 0; i < 5; i += 2) { 
 System.out.println(i); 
 } 
 } 
} 


? Error to investigate: Why does the loop print unexpected results or run infinitely? How should the loop update 
   expression be corrected?
--->The update expression i += 2 increments i by 2 instead of 1, which may cause unexpected results but does not create 
    an infinite loop So Change i += 2 to i++ to increment by 1 for a standard loop*/



// Fixed program
public class Snippet_09 {
        public static void main(String[] args) { 
        for (int i = 0; i < 5; i++) { 
        System.out.println(i); 
        } 
        }   
}

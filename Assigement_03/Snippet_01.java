// Snippet 1: 
/*public class Infinitforloop { 
 public static void main(String[] args) { 

 for (int i = 0; i < 10; i--) { 
 System.out.println(i); 
 } 
 } 
} 


 Error to investigate: Why does this loop run infinitely? How should the loop control variable be adjusted?
 --->The loop runs infinitely because i-- decreases i, keeping it always < 10. This makes the condition always true, so the loop never stops.
    -To prevent an infinite loop, i should increase (i++) instead of decreasing(i--).*/



// Fixed program
public class Snippet_01 { 
    public static void main(String[] args) { 
   
    for (int i = 0; i < 10; i++) { 
    System.out.println(i); 
    } 
    } 
   } 
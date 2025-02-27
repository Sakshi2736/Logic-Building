    /*  Snippet 3: 
    public class Snippet_03 {
     public static void main(String[] args) { 
     int num = 0; 
     do { 
     System.out.println(num); 
     num++; 
     } while (num > 0); 
     } 
    } 


? Error to investigate: Why does the loop only execute once? What is wrong with the loop condition in the `do while' loop 
-->The loop executes only once because num starts at 0, increments to 1, and the condition num > 0 remains true, causing an infinite loop.*/
     

// Fixed program

public class Snippet_03 {
    public static void main(String[] args) { 
        int num = 0; 
        do { 
        System.out.println(num); 
        num++; 
        } while (num < 10); 
        } 
    }
// Snippet 2: 
/*public class IncorrectWhileCondition { 
 public static void main(String[] args) { 
 int count = 5; 
 while (count = 0) { 
 System.out.println(count); 
 count--; 
 } 
 } 
} 



 Error to investigate: Why does the loop not execute as expected? What is the issue with the condition in the `while` loop?
--->The condition while (count = 0) causes a compilation error because = is an assignment, not a comparison but if we use a comparison operator  
    the loop never runs because count == 0 is false initially. so Use while (count > 0) to run loop correctly while  count is positive */



// Fixed program
public class Snippet_02{ 
    public static void main(String[] args) { 
    int  count = 5; 
    while (count > 0) { 
    System.out.println(count); 
    count--; 
    } 
    } 
   } 
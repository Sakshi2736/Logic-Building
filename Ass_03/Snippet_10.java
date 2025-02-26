/*Snippet 10: 
public class IncorrectWhileLoopControl { 
 public static void main(String[] args) { 
 int num = 10; 
 while (num = 10) { 
 System.out.println(num); 
 num--; 
 } 
 } 
}


? Error to investigate: Why does the loop execute indefinitely? What is wrong with the loop condition?
---> The condition while (num = 10) is incorrect because = is an assignment operator, not a comparison operator, 
     causing a compilation error So, Use == for comparison*/


// Fixed program
public class Snippet_10 {
    public static void main(String[] args) { 
        int num = 10; 
        while (num>0) { 
        System.out.println(num); 
        num--; 
        } 
        } 
    }


/*  Snippet 4:
public class OffByOneErrorForLoop { 
    public static void main(String[] args) { 
    for (int i = 1; i <= 10; i++) { 
    System.out.println(i); 
    } 
    // Expected: 10 iterations with numbers 1 to 10 
    // Actual: Prints numbers 1 to 10, but the task expected only 1 to 9 
    } 
   } 


   ? Error to investigate: What is the issue with the loop boundaries? 
     How should the loop be adjusted to meet the expected output?
   --->he condition i <= 10 causes the loop to print numbers 1 to 10 instead 
       of 1 to 9, so Change the condition to i < 10 so the loop stops at 9, meeting the expected output*/


//Fixed progeam
public class Snippet_04 {
    public static void main(String[] args) {
        for(int i=1;i<10;i++ ){
            System.out.println(i);
        }
    }
}

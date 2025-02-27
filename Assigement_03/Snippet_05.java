/*Snippet 5:
public class WrongInitializationForLoop { 
    public static void main(String[] args) { 
    for (int i = 10; i >= 0; i++) { 
    System.out.println(i); 
    } 
    } 
   } 


   ? Error to investigate: Why does this loop not print numbers in the expected order? What is the problem with the 
   initialization and update statements in the `for` loop? 
   -->The update statement i++ incorrectly increases i instead of decreasing, causing an infinite loop,so Change 
      i++ to i-- so the loop correctly counts down from 10 to 0*/


//Fixed program   
public class Snippet_05 {
  public static void main(String[] args) {
    for(int i=10;i>=0;i--){
        System.out.println(i);
    }
  }  
}

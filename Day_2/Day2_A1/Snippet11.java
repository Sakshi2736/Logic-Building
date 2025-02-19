//Snippet 11: 
/*public class Main { 
 public static void main(String[] args) { 
 int[] arr = {1, 2, 3}; 
 System.out.println(arr[5]); 
 } 
} 


 What runtime exception do you encounter? Why does it occur?
--->arr[5] tries to access the 6th element, which does not exist.
    This causes Java to throw an ArrayIndexOutOfBoundsException at runtime.*/ 


//Fixed program
public class Snippet11 {
    public static void main(String[] args) { 
        int[] arr = {1, 2, 3}; 
        System.out.println(arr[2]); //accesse the last no
        } 
}

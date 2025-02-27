// Snippet 13: 
/*public class Main { 
 public static void main(String[] args) { 
 String str = null; 
 System.out.println(str.length()); 
 } 
}


 What exception is thrown? Why does it occur?
--->NullPointerException occurs because str is null,it happens when calling methods on null. 
   calling str.length() tries to access something that doesn’t exist*/

   
//Fixed program
public class Snippet13 {
    public static void main(String[] args) { 
        String str = "Hello World"; 
        System.out.println(str.length()); 
        } 
}

//Snippet 7: 
/*public class Main { 
 public static void main(String[] args) { 
 int x = "Hello"; 
 System.out.println(x); 
 } 
} 


   What compilation error do you see? Why does Java enforce type safety
--> In that program string is tring to convert in int datatype.string is different from int,
    so we need to declare x as string*/


// Fixed program
public class Snippet7 {
    public static void main(String[] args) {
        String x ="Hello";
System.out.println(x);
    }
}

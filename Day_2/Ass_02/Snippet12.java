//Snippet 12: 
/*public class Main { 
 public static void main(String[] args) { 
 while (true) { 
 System.out.println("Infinite Loop"); 
 } 
 } 
}


 What happens when you run this code? How can you avoid infinite loops?
--->The program enters an infinite loop and keeps printing, because there is no exit condition. 
    so we need to add condition instead of true or add a break(Exit)statement.*/ 


//fixed program
public class Snippet12 {
        public static void main(String[] args) { 
         int a = 10;
            while (a >=5) { 
        System.out.println("Infinite Loop");
        a--; 
        } 
        } 
}

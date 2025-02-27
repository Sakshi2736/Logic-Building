// Snippet 16: 
/*public class Main { 
 public static void main(String[] args) { 
 int num = 10; 
 double result = num / 4; 
 System.out.println(result); 
 } 
} 
 What is the result of this operation? Is the output what you expected?
--->num / 4 does integer division, so 10 / 4 gives 2, not 2.5 because both no are int even ifresult is double
    Since division happens before assignment, the decimal part is lost so use atleast 1 double value.

*/
public class Snippet16 {
    public static void main(String[] args) {
        int num = 10;
        double result = num / 4.0;
        System.out.println(result);
    }
}

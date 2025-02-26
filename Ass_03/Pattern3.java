public class Pattern3 {
    public static void pattern(int n) {
        // int i,j; // Number of rows

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int b = 6;
        pattern(b);
    }
}

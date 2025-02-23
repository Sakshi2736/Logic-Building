public class S2_02 {
    public static void main(String[] args) {
        int day = 7; 

        switch (day) {
            case 1: case 2: case 3: case 4: case 5:
                System.out.print("Day: ");
                switch (day) {
                    case 1: System.out.println("Monday"); break;
                    case 2: System.out.println("Tuesday"); break;
                    case 3: System.out.println("Wednesday"); break;
                    case 4: System.out.println("Thursday"); break;
                    case 5: System.out.println("Friday"); break;
                }
                System.out.println("It is a weekday.");
                break;

            case 6: case 7:
                System.out.print("Day: ");
                switch (day) {
                    case 6: System.out.println("Saturday"); break;
                    case 7: System.out.println("Sunday"); break;
                }
                System.out.println("It is a weekend.");
                break;

            default:
                System.out.println("Invalid day number!");
        }
    }
}


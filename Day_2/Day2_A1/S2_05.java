public class S2_05 {
    public static void main(String[] args) {
        int sub1 = 37;
        int sub2 = 51;
        int sub3 = 35;
        int failedsub = 0;

        switch (sub1 >= 40 ? 1 : 0) {
        case 0:
        failedsub++;
        }
        switch (sub2 >= 40 ? 1 : 0) {
        case 0:
        failedsub++;
        }
        switch (sub3 >= 40 ? 1 : 0) {
        case 0:
        failedsub++;
        }

        switch (failedsub) {
        case 0:
        System.out.println("Student has passed.");
        break;
        default:
        System.out.println("Student has failed in " + failedsub + " subjects.");
        break;
        }
        }
    }


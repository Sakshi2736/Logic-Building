public class S2_04 {
    public static void main(String[] args) {
        int totalPurchase = 750;
        double discount = 0;

        if (totalPurchase >= 1000) {
            discount = totalPurchase * 0.20;    //750 *(20/100)=150
        } else if (totalPurchase >= 500) {
            discount = totalPurchase * 0.10;    //750*(10/100)=75
        } else {
            discount = totalPurchase * 0.05;    //750*(5/100)=37.5
        }

        double finalAmount = totalPurchase - discount;
        System.out.println("Total Purchase: Rs." + totalPurchase);
        System.out.println("Discount Applied: Rs." + discount);
        System.out.println("Final Amount to Pay: Rs." + finalAmount);
    }
}


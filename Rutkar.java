import java.util.Scanner;

public class Rutkar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your annual income: ");
        double income = sc.nextDouble();

        double tax = 0;

        if (income <= 500000) {
            tax = income * 0;
        } else if (income > 500000 && income <= 1000000) {
            tax = income * 0.2;
        } else {
            tax = income * 0.3;
        }

        double netIncome = income - tax;

        System.out.println("========== TAX SUMMARY ==========");
        System.out.println("Gross Income : Rs. " + income);
        System.out.println("Tax (0/20/30%): Rs. " + tax);
        System.out.println("Net Income   : Rs. " + netIncome);
        System.out.println("==================================");

        sc.close();
    }
}

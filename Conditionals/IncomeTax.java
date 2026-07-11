package Conditionals;
import java.util.Scanner;
public class IncomeTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your annual income: ");
        double income = sc.nextDouble();
        double taxAmount = 0.0;

        if (income <= 1200000) {
            taxAmount = 0; // No tax for income up to 12 lakh
        } else if (income <= 2000000) {
            taxAmount = (income - 1200000) * 0.05; // 5% tax for income between 12 lakh and 20 lakh
        } else if (income <= 5000000) {
            taxAmount = (800000 * 0.05) + ((income - 2000000) * 0.20); // 20% tax for income between 20 lakh and 5 crore
        } else {
            taxAmount = (800000 * 0.05) + (30000 * 9.9); // Simplified calculation for income above 5 crore
        }

        System.out.println("The income tax amount is: ₹" + taxAmount);
        sc.close();
    }
}

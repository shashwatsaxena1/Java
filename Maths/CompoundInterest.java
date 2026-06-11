package Maths;
import java.util.*;
public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        double principal = sc.nextDouble();
        System.out.print("Enter the annual interest rate (in %): ");
        double rate = sc.nextDouble();
        System.out.print("Enter the number of times interest is compounded per year: ");
        int n = sc.nextInt();
        System.out.print("Enter the number of years: ");
        int t = sc.nextInt();

        double amount = principal * Math.pow(1 + (rate / 100) / n, n * t);
        System.out.printf("The compound interest after %d years is: %.2f\n", t, amount - principal);
        System.out.printf("The total amount after %d years is: %.2f\n", t, amount);
        sc.close();
    }
}

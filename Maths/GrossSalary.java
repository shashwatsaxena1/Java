package Maths;
import java.util.*;
public class GrossSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the basic salary: ");
        double basicSalary = sc.nextDouble();
        System.out.print("Enter the HRA percentage: ");
        double hraPercentage = sc.nextDouble();
        System.out.print("Enter the Allowances: ");
        double Allowances = sc.nextDouble();

        double hra = (hraPercentage / 100) * basicSalary;
        double grossSalary = basicSalary + hra + Allowances;

        System.out.printf("The gross salary is: %.2f\n", grossSalary);
        sc.close();
    }
}

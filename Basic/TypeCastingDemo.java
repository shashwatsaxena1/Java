package Basic;
import java.util.*;
public class TypeCastingDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Implicit Type Casting (Widening)
        System.out.print("Enter an integer: ");
        int num1 = sc.nextInt();
        double num2 = num1; // int to double
        System.out.println("Implicit Type Casting (int to double): " + num2);

        // Explicit Type Casting (Narrowing)
        System.out.print("Enter a decimal number: ");
        double num3 = sc.nextDouble();
        int num4 = (int) num3; // double to int
        System.out.println("Explicit Type Casting (double to int): " + num4);
        sc.close();
    }
}

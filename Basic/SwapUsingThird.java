package Basic;
import java.util.Scanner;
public class SwapUsingThird {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        int temp = num1;// Store the value of num1 in a temporary variable
        num1 = num2;
        num2 = temp;
        System.out.println("After swapping:");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);
        sc.close();
    }
}

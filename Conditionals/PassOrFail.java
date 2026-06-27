package Conditionals;
import java.util.Scanner;
public class PassOrFail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int marks = scanner.nextInt();
        if (marks >= 50) {
            System.out.println("You have passed.");
        } else {
            System.out.println("You have failed.");
        }
        scanner.close();
    }
}

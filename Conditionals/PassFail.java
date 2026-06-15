package Conditionals;
import java.util.*;
public class PassFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();
        if (marks >= 40) {
            System.out.println("You have passed.");
        } else {
            System.out.println("You have failed.");
        }
        sc.close();
    }
}

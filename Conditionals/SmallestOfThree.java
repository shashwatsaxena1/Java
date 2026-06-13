package Conditionals;
import java.util.*;
public class SmallestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = sc.nextInt();
        if(num1 <= num2 && num1 <= num3){
            System.out.println(num1 + " is the smallest number.");
        } else if(num2 <= num1 && num2 <= num3){
            System.out.println(num2 + " is the smallest number.");
        } else if(num3 <= num1 && num3 <= num2){
            System.out.println(num3 + " is the smallest number.");
        }
        else {
            System.out.println("All numbers are equal.");
        }
        sc.close();
    }
}

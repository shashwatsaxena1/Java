package Conditionals;
import java.util.*;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        boolean isLeapYear;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            isLeapYear = true;
        } else {
            isLeapYear = false;
        }
        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
        sc.close();
    }
}

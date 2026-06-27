package Conditionals;
import java.util.*;
public class DrivingLicense {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age: ");
        int age = sc.nextInt();
    if(age >= 18){
        System.out.println("You are eligible for a driving license.");
    } else {
        System.out.println("You are not eligible for a driving license.");
    }
    sc.close();
    }
}

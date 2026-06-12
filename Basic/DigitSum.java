package Basic;
import java.util.*;
public class DigitSum {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        int sum = 0;
        while(num>0){
            sum = num%10 + sum;
            num = num/10;
        }
        System.out.println("The sum of the digits is: " + sum);
        sc.close();
    }
}

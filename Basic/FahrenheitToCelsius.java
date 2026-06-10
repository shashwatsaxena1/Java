package Basic;
import java.util.Scanner;
public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        double celsius = (fahrenheit - 32) * 5/9; //formula to convert Fahrenheit to Celsius
        System.out.println("The temperature in Celsius is: " + celsius);
        sc.close();
    }
}

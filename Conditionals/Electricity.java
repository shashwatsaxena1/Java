package Conditionals;
import java.util.Scanner;
public class Electricity {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of units consumed: ");
        int units = sc.nextInt();
        // Add logic to calculate electricity bill based on units consumed
        double billAmount = 0.0;

        if(units <= 100){
            billAmount = units * 0.5; // Rate for first 100 units
        } else if(units <= 200){
            billAmount = (100 * 0.5) + ((units - 100) * 0.75); // Rate for next 100 units
        } else if(units <= 300){
            billAmount = (100 * 0.5) + (100 * 0.75) + ((units - 200) * 1.20); // Rate for next 100 units
        } else {
            billAmount = (100 * 0.5) + (100 * 0.75) + (100 * 1.20) + ((units - 300) * 1.50); // Rate for units above 300
        }
        System.out.println("The electricity bill amount is: ₹" + billAmount);
        sc.close();
    }
}

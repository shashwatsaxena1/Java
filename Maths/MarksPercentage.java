package Maths;
import java.util.*;
public class MarksPercentage {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int totalMarks = 0;
        for(int i=1;i<=5;i++){
            System.out.print("Enter the Marks of your subject "+(i)+": ");
            totalMarks += sc.nextInt();
        }
        double percentage = ((double) totalMarks / 500)*100;
        System.out.printf("The percentage is: %.2f\n", percentage);
        sc.close();
    }
}

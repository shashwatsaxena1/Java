package Basic;
import java.util.*;
public class DaysToYearsWeeksDays {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of days: ");
        int days = sc.nextInt();
        int years = days / 365;
        int remainingDays = days % 365;
        int weeks = remainingDays / 7;
        remainingDays = remainingDays % 7;
        System.out.println(years + " years, " + weeks + " weeks, and " + remainingDays + " days.");
        sc.close();
    }
}

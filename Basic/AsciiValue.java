package Basic;
import java.util.Scanner;
public class AsciiValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // For Character to Integer conversion
        System.out.print("Enter a character: ");
        char character = sc.next().charAt(0);
        int asciiValue = (int) character;
        System.out.println("ASCII value of '" + character + "' is: " + asciiValue);

        //For Integer to Character conversion
        System.out.println("Enter the ASCII value: ");
        int asciiInput = sc.nextInt();
        char charFromAscii = (char) asciiInput;
        System.out.println("Character for ASCII value " + asciiInput + " is: '" + charFromAscii + "'");
        sc.close();
    }
}

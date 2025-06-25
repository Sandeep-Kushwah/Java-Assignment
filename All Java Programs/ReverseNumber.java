import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int reversed = 0,digit;

        // Logic to reverse the number
        while (number != 0) {
            digit = number % 10;       // Get the last digit
            reversed = reversed * 10 + digit;
            number /= 10;                  // Remove last digit
        }

        // Output the reversed number
        System.out.println("Reversed number: " + reversed);
        System.out.println("\nI am Sandeep Kushwah.");
        System.out.println("Roll num : 0873CS231107");
    }
}

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // a. Check if it is a positive integer
        if (number > 0) {
            System.out.print("Factors of " + number + " are: ");
            
            // b. Run a for loop from i = 1 to i < number
            for (int i = 1; i < number; i++) {
                // Check if perfectly divisible
                if (number % i == 0) {
                    System.out.print(i + " ");
                }
            }
        } else {
            System.out.println("Input must be a positive integer.");
        }
        sc.close();
    }
}

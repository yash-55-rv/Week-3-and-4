import java.util.Scanner;

public class Votingcheck {
    public static void main(String[] args) {
        // a. Create a Scanner object to get integer input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the person's age: ");
        int age = scanner.nextInt();

        // b. Check if the person is 18 or older
        if (age >= 18) {
            // Output if age is greater than or equal to 18
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            // Output if age is less than 18
            System.out.println("The person's age is " + age + " and cannot vote.");
        }

        scanner.close();
    }
}
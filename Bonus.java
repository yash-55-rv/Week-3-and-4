
import java.util.Scanner;

public class Bonus{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your current salary: ");
        double salary = scanner.nextDouble();
        System.out.print("Enter your years of service: ");
        int yearsOfService = scanner.nextInt();
        double bonusAmount = 0;
        if (yearsOfService > 5) {
            bonusAmount = salary * 0.05;
            System.out.println("5% bonus.");
        } else {
            System.out.println("No bonus yet.");
        }
        System.out.println("Total Bonus Amount: " + bonusAmount);
        scanner.close();
    }
}

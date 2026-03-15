import java.util.Scanner;

public class Div5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: "); // Good practice so you know it's waiting!
        int n = sc.nextInt();
        
        // Direct assignment
        boolean isDivisible = (n % 5 == 0);
        
        System.out.println("Is the number " + n + " divisible by 5? " + isDivisible);
        
        sc.close(); // Clean up the scanner
    }
}
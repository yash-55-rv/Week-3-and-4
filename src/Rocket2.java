import java.util.Scanner;

public class Rocket2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter starting number for countdown: ");
        int startValue = sc.nextInt();
        for (int counter = startValue; startValue >= 1; startValue--) {
            System.out.println(startValue);
        }
        System.out.println("Launch");
        sc.close();
    }
}
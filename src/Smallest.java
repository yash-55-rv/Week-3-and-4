import java.util.Scanner;
public class Smallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
        boolean issmallest;
        if( number1 < number2 && number1 < number3){
            issmallest = true;
            System.out.println(" Is the first number the smallest? "+ issmallest);
        }
        else{
            issmallest = false;
            System.out.println(" Is the first number the smallest? "+ issmallest);
        }
    }
}

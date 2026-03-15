import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
        boolean islargest, is2large, is3large;
        if( number1 > number2 && number1 > number3){
            islargest = true;
            is2large = false;
            is3large = false;
            System.out.println(" Is the first number the largest? "+ islargest);
            System.out.println(" Is the second number the largest? "+ is2large);
            System.out.println(" Is the third number the largst? "+ is3large);
        }
        else if( number2 > number1 && number2 > number3){
            islargest = false;
            is2large = true;
            is3large = false;
            System.out.println(" Is the first number the largest? "+ islargest);
            System.out.println(" Is the second number the largest? "+ is2large);
            System.out.println(" Is the third number the largest? "+ is3large);
        }
        else{
            islargest = false;
            is2large = false;
            is3large = true;
            System.out.println(" Is the first number the largest? "+ islargest);
            System.out.println(" Is the second number the largest? "+ is2large);
            System.out.println(" Is the third number the largest? "+ is3large);
        }
    }
}

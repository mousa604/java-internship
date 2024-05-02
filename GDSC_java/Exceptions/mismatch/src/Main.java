import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;
        boolean validInput;

        do {
            validInput = true;
            try {
                System.out.print("Enter the first integer: ");
                num1 = scanner.nextInt();
                System.out.print("Enter the second integer: ");
                num2 = scanner.nextInt();
                int sum = num1 + num2;
                System.out.println("The sum is: " + sum);
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter integers only.");
                validInput = false;
                scanner.next(); // clear the invalid input
            }
        } while (!validInput);

        scanner.close();
    }
}
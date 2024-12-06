import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1 for addition or 2 for subtraction:");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();
            double result = num1 + num2;
            System.out.println("The sum is: " + result);
        } else if (choice == 2) {
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();
            double result = num1 - num2;
            System.out.println("The difference is: " + result);
        } else {
            System.out.println("Invalid choice.");
        }
        scanner.close();
    }
}

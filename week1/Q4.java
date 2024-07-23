import java.util.Scanner;

public class TemperatureChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the current temperature in Celsius: ");
        double temperature = scanner.nextDouble();

        if (temperature > 30) {
            System.out.println("It's hot!");
        } else if (temperature >= 20 && temperature <= 30) {
            System.out.println("It's warm.");
        } else if (temperature >= 10 && temperature < 20) {
            System.out.println("It's cool.");
        } else {
            System.out.println("It's cold.");
        }
    }
}

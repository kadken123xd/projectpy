import java.util.Scanner;

public class number {

    public static double calculate(double num1, double num2, char op) {
        double result = 0;

        switch (op) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.err.println("Error: Division by zero.");
                    System.exit(1);
                }
                break;
            default:
                System.err.println("Error: Invalid operation.");
                System.exit(1);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        double result = calculate(num1, num2, operation);
        System.out.println("The result of " + num1 + " " + operation + " " + num2 + " is " + result);
    }
}
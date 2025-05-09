import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n=== Calculator Menu ===");
            System.out.println("1. Decimal Calculator");
            System.out.println("2. Hexadecimal Calculator");
            System.out.println("3. Binary Calculator");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            switch (choice) {
                case 1:
                    decimalCalculator(scanner);
                    break;
                case 2:
                    hexadecimalCalculator(scanner);
                    break;
                case 3:
                    binaryCalculator(scanner);
                    break;
                case 4:
                    System.out.println("Exiting... Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    // Decimal Calculator
    public static void decimalCalculator(Scanner scanner) {
        System.out.print("\nEnter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        System.out.print("Enter the operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        double result;
        switch (operation) {
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
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                    return;
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Error: Invalid operation.");
                return;
        }

        System.out.println("Result: " + result);
    }

    // Hexadecimal Calculator
    public static void hexadecimalCalculator(Scanner scanner) {
        System.out.print("\nEnter first hexadecimal number: ");
        String hex1 = scanner.nextLine().toUpperCase();
        System.out.print("Enter second hexadecimal number: ");
        String hex2 = scanner.nextLine().toUpperCase();
        System.out.print("Enter the operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);
        scanner.nextLine(); // Clear buffer

        try {
            int num1 = Integer.parseInt(hex1, 16);
            int num2 = Integer.parseInt(hex2, 16);
            int result = 0;

            switch (operation) {
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
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero is not allowed.");
                        return;
                    }
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Error: Invalid operation.");
                    return;
            }

            String hexResult = Integer.toHexString(result).toUpperCase();
            System.out.println("Result: " + hexResult);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid hexadecimal input.");
        }
    }

    // Binary Calculator
    public static void binaryCalculator(Scanner scanner) {
        System.out.print("\nEnter first binary number: ");
        String bin1 = scanner.nextLine();
        System.out.print("Enter second binary number: ");
        String bin2 = scanner.nextLine();
        System.out.print("Enter the operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);
        scanner.nextLine(); // Clear buffer

        try {
            int num1 = Integer.parseInt(bin1, 2);
            int num2 = Integer.parseInt(bin2, 2);
            int result = 0;

            switch (operation) {
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
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero is not allowed.");
                        return;
                    }
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Error: Invalid operation.");
                    return;
            }

            String binResult = Integer.toBinaryString(result);
            System.out.println("Result: " + binResult);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid binary input.");
        }
    }
}

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char operator;
        double num1, num2, result;

        System.out.println("Choose operation:");
        System.out.println(" +  Addition");
        System.out.println(" -  Subtraction");
        System.out.println(" *  Multiplication");
        System.out.println(" /  Division");
        System.out.println(" h  Convert number to Hexadecimal");

        System.out.print("Enter operator: ");
        operator = input.next().charAt(0);

        switch (operator) {
            case '+':
            case '-':
            case '*':
            case '/':
                System.out.print("Enter two numbers: ");
                num1 = input.nextDouble();
                num2 = input.nextDouble();

                switch (operator) {
                    case '+':
                        result = num1 + num2;
                        System.out.printf("Result: %.2f\n", result);
                        break;
                    case '-':
                        result = num1 - num2;
                        System.out.printf("Result: %.2f\n", result);
                        break;
                    case '*':
                        result = num1 * num2;
                        System.out.printf("Result: %.2f\n", result);
                        break;
                    case '/':
                        if (num2 != 0) {
                            result = num1 / num2;
                            System.out.printf("Result: %.2f\n", result);
                        } else {
                            System.out.println("Error: Division by zero.");
                        }
                        break;
                }
                break;
	case '+':
                        result = num1 + num2;
                        System.out.printf("Result: %.2f\n", result);
                        break;


            case 'h':
                System.out.print("Enter an integer to convert to hexadecimal: ");
                int number = input.nextInt();
                String hex = Integer.toHexString(number);
                System.out.println("Hexadecimal: " + hex.toUpperCase());
                break;

            default:
                System.out.println("Invalid operator.");
        }

        input.close();
    }
}


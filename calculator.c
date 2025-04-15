#include <stdio.h>

// Decimal calculator function
void decimalCalculator() {
    char operator;
    float num1, num2, result;

    printf("Enter an operator (+, -, *, /): ");
    scanf(" %c", &operator);

    printf("Enter two numbers: ");
    scanf("%f %f", &num1, &num2);

    switch (operator) {
        case '+':
            result = num1 + num2;
            printf("Result: %.2f\n", result);
            break;
        case '-':
            result = num1 - num2;
            printf("Result: %.2f\n", result);
            break;
        case '*':
            result = num1 * num2;
            printf("Result: %.2f\n", result);
            break;
        case '/':
            if (num2 != 0) {
                result = num1 / num2;
                printf("Result: %.2f\n", result);
            } else {
                printf("Error: Division by zero is not allowed.\n");
            }
            break;
        default:
            printf("Invalid operator.\n");
    }
}

// Hexadecimal calculator function
void hexCalculator() {
    char operator;
    int hex1, hex2, result;

    printf("Enter an operator (+, -, *, /): ");
    scanf(" %c", &operator);

    printf("Enter two hexadecimal numbers (with 0x prefix): ");
    scanf("%x %x", &hex1, &hex2);

    switch (operator) {
        case '+':
            result = hex1 + hex2;
            printf("Result: 0x%X\n", result);
            break;
        case '-':
            result = hex1 - hex2;
            printf("Result: 0x%X\n", result);
            break;
        case '*':
            result = hex1 * hex2;
            printf("Result: 0x%X\n", result);
            break;
        case '/':
            if (hex2 != 0) {
                result = hex1 / hex2;
                printf("Result: 0x%X\n", result);
            } else {
                printf("Error: Division by zero is not allowed.\n");
            }
            break;
        default:
            printf("Invalid operator.\n");
    }
}

// Main function
int main() {
    char type;

    printf("Choose calculation type:\n");
    printf("D for Decimal\nH for Hexadecimal\nEnter choice: ");
    scanf(" %c", &type);

    if (type == 'D' || type == 'd') {
        decimalCalculator();
    } else if (type == 'H' || type == 'h') {
        hexCalculator();
    } else {
        printf("Invalid selection. Please enter D or H.\n");
    }

    return 0;
}

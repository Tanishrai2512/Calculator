package calculator;
public class Calculator {

    // Addition
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    // Subtraction
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Multiplication
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // Division
    public static double divide(double num1, double num2) {
        return num1 / num2;
    }

    // Modulus
    public static double modulus(double num1, double num2) {
        return num1 % num2;
    }

    // Power
    public static double power(double num1, double num2) {
        return Math.pow(num1, num2);
    }
}
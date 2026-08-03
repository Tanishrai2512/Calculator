package  calculator;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        char again;

        do {

            System.out.println("\n=================================");
            System.out.println("     JAVA CALCULATOR PROJECT");
            System.out.println("=================================");

            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            System.out.println("\n===== Java Calculator =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("6. Power");

            System.out.print("Choose an option (1-6): ");
            int choice = sc.nextInt();

            double result;

            switch (choice) {

                case 1:
                    result = Calculator.add(num1, num2);
                    System.out.println("-----------------------------");
                    System.out.println("Result = " + result);
                    System.out.println("-----------------------------");
                    break;

                case 2:
                    result = Calculator.subtract(num1, num2);
                    System.out.println("-----------------------------");
                    System.out.println("Result = " + result);
                    System.out.println("-----------------------------");
                    break;

                case 3:
                    result = Calculator.multiply(num1, num2);
                    System.out.println("-----------------------------");
                    System.out.println("Result = " + result);
                    System.out.println("-----------------------------");
                    break;

                case 4:
                    if (num2 != 0) {
                        result = Calculator.divide(num1, num2);
                        System.out.println("-----------------------------");
                        System.out.println("Result = " + result);
                        System.out.println("-----------------------------");
                    } else {
                        System.out.println("Error: Cannot divide by zero!");
                    }
                    break;

                case 5:
                    if (num2 != 0) {
                        result = Calculator.modulus(num1, num2);
                        System.out.println("-----------------------------");
                        System.out.println("Result = " + result);
                        System.out.println("-----------------------------");
                    } else {
                        System.out.println("Error: Cannot perform modulus with zero!");
                    }
                    break;

                case 6:
                    result = Calculator.power(num1, num2);
                    System.out.println("-----------------------------");
                    System.out.println("Result = " + result);
                    System.out.println("-----------------------------");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

            System.out.print("\nDo you want another calculation? (y/n): ");
            again = sc.next().charAt(0);

        } while (again == 'y' || again == 'Y');

        System.out.println("\nThank you for using the Java Calculator!");
        sc.close();
    }
}
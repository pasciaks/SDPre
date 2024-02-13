import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {

        /*

            Welcome to Calculator.  What is the first number? 42
            What is the second number? 8
            Do you want to add, subtract, multiply, or divide? divide
            42 / 8 equals 5.25

         */

        /*

            User Story 0
            Create a program with a main method.

            User Story 1
            Prompt the user to enter the two numbers, and use Scanner.nextDouble() to read their input into two variables.

            Prompt the user to input which calculator function they want to perform, and read their response into a String variable.

            User Story 2
            Using if/else statements, perform the requested calculation, storing the result in a variable and print the results.

            User Story 3
            If the user enters an invalid calculator function, print an error message.

            User Story 4
            Modify your if conditions to accept different forms of input for the calculation. For example, if the user enters either add or plus or +, perform addition; use a single if or else if to achieve this.

         */

        // Prompt the user to enter the two numbers, and use Scanner.nextDouble() to read their input into two variables.

        Scanner kb = new Scanner(System.in);
        double num1, num2, result = 0.0;
        boolean failed = false;

        System.out.print("Welcome to Calculator.  What is the first number?");
        num1 = kb.nextDouble();

        System.out.print("What is the second number?");
        num2 = kb.nextDouble();

        // Prompt the user to input which calculator function they want to perform, and read their response into a String variable.

        String operation;

        do {

            System.out.print("Do you want to add, subtract, multiply, or divide?");
            operation = kb.nextLine();

            switch (operation) {
                case "add":
                    result = add(num1, num2);
                    operation = "+";
                    break;
                case "subtract":
                    result = subtract(num1, num2);
                    operation = "-";
                    break;
                case "multiply":
                    result = multiply(num1, num2);
                    operation = "*";
                    break;
                case "divide":
                    result = divide(num1, num2);
                    operation = "/";
                    break;
                default:
                    failed = true;
                    System.out.println("\n\nInvalid operation\n\n");
                    break;
            }

        } while (failed);

        if (!failed) {
            System.out.println(num1 + " " + operation + " " + num2 + " equals " + result);
        }


    }

    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        return num1 / num2;
    }

}
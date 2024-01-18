import java.util.Scanner;

public class Objective9Lab5 {

    /*

    This lab is a bit lengthy, but it will review several things you've learned so far. Take your time and concentrate on one part at a time. Also, refer to previous objectives, labs, and examples to help you out!

    Create a file called Objective9Lab5.java in the SDPre/Labs directory.
    Using the starter code below, add code to the commented areas that would:
    Prompt the user for two numbers, both of type double (Parts 1 & 2)
    Using a switch, compare the user's choice to the different functions provided by these methods (Part 3):
    findSum
    findAverage
    calcTax
    Not a method, but include an option to quit.
    Define the findAverage method (Part 4)
    Hint: Refer to your logic from Objective9Lab4
    Define the calcTax method (Part 5)
    Hint: Use a tax rate of 8.31%
    Hint: No need for a grand total, just the expected amount from taxes. Refer to the Expected Output section for clarification.
    Because there are so many parts to this, the directives are also written in the starter code below as comments.

     */

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double num1, num2;
        boolean keepGoing = true;
        int choice;
        double answer = 0.0;

        // Part 1:
        // prompt the user to provide one number and store their input in num1

        /*
         * Solution for Part 1 goes here
         */

        System.out.print("Please give me a number: ");
        num1 = kb.nextDouble();

        // Part 2:
        // Prompt the user for another number and store their input in num2

        /*
         * Solution for Part 2 goes here
         */

        System.out.print("Please give me another number: ");
        num2 = kb.nextDouble();

        while (keepGoing) {
            printMenu();
            System.out.print("Which would you like to do? ");
            choice = kb.nextInt();

            switch (choice) {
                // Part 3:
                // Complete this switch, with each case calling one of the methods below,
                // then printing out the result (refer to "Expected Output" below)
                // Don't forget to account for a user accidentally inputting an invalid number!

                /*
                 * Solution for Part 3 goes here
                 */

                case 1:
                    double sum = findSum(num1, num2);
                    System.out.println(num1 + " + " + num2 + " = " + sum);
                    break;
                case 2:
                    double average = findAverage(num1, num2);
                    System.out.println("The average of " + num1 + " and " + num2 + " is " + average);
                    break;
                case 3:
                    double tax = calcTax(num1, num2);
                    System.out.println("The amount in tax to be collected from a purchase of " + num1 + " and " + num2 + " is: " + tax);
                    break;
                case 4:
                    keepGoing = false;
                    System.out.println("You've chosen to quit.");
                    break;
                default:
                    System.out.println("Invalid entry.  Please try again");
                    break;

            }

        }
        kb.close();

    }

    public static void printMenu() {
        System.out.println();
        System.out.println("========= MENU =========");
        System.out.println("|                      |");
        System.out.println("|   1. Add Numbers     |");
        System.out.println("|   2. Find Average    |");
        System.out.println("|   3. Calculate Tax   |");
        System.out.println("|   4. Exit            |");
        System.out.println("|                      |");
        System.out.println("========================");
        System.out.println();
    }

    public static double findSum(double x, double y) {
        double sum = x + y;
        return sum;
    }
    // Part 4:
    // Write a method named "findAverage" that takes two doubles as parameters,
    // and returns a double that represents the average of the two parameters.

    // Use the "findSum" method as an example.

    /*
        Solution for Part 4 goes here
    */

    public static double findAverage(double x, double y) {
        double sum = findSum(x, y);
        return sum / 2;
    }

    // Part 5:
    // Write a method named "calcTax" that also takes two doubles as parameters,
    // and returns a double that represents the amount of tax the user would have
    // to pay based on the total of the two parameters. Use a tax rate of 8.31%
    // (Not a grand total, just the total taxes. Refer to "Expected Output".)

    /*
        Solution for Part 5 goes here
     */

    public static double calcTax(double x, double y) {
        double sum = findSum(x, y);
        double tax = sum * 0.0831;
        return tax;
    }

}
import java.util.Scanner;

public class Objective5Lab4 {

//    Create a class structure with the name Objective5Lab4.
//    Create a main method.
//    Create a Scanner.
//    Take in a number and assign it to a variable.
//    Determine if the number is even or odd.
//    Hint: The modulus operator % returns a value based on the remainder after division of one number by another. For example 8 % 4 would return 0, while 9 % 2 would return 1. What would you need to test for to determine if a number is even or odd?


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.println("Please enter a number: ");

        try {
            number = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("You failed to enter a valid integer number.");
            return;
        } finally {
            scanner.close();
        }

        // Please enter a number:
        // 43
        // The number is odd

        if (number % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }

    }
}
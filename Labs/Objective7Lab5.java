import java.util.Scanner;

public class Objective7Lab5 {

    /*
        Create a file called Objective7Lab5.java in the SDPre/Labs directory. The following code simulates a menu system.
        Using the starter code below, add code to the commented areas that would:
        Inside of the endless loop, write if statements to determine if 1, 2, or 3 was selected.
        If 1 was entered, print Hello World.
        If 2 was entered, print a String of your favorite foods: Apple, Banana, Coconut.
        If 3 was entered, break the loop.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int selection;

        while (true) {
            System.out.println("_____Menu_____");
            System.out.println("1: Say Hello");
            System.out.println("2: List My favorite foods");
            System.out.println("3: Exit");
            System.out.println();

            System.out.print("Enter your menu selection ? ");

            selection = scanner.nextInt();

            // If 1 was entered, print Hello World.
            // If 2 was entered, print a String of your favorite foods: Apple, Banana, Coconut.
            // If 3 was entered, break the loop.

            if (selection == 1) {
                System.out.println("Hello World");
            } else if (selection == 2) {
                System.out.println("Apple, Banana, Coconuts");
            } else if (selection == 3) {
                System.out.println("Goodbye");
                break;
            } else {
                System.out.println("\n\nYou did not enter a valid choice, please enter 1, 2, or 3.\n\n");
            }

        }

        scanner.close();
    }
}
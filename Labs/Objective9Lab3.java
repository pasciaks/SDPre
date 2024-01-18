import java.util.Scanner;

public class Objective9Lab3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int selection;

        while (true) {

            printMenu();

            System.out.print("Enter your selection, 1, 2, or 3: ");

            selection = scanner.nextInt();

            if (selection == 1) {
                System.out.println("Hello World");
            } else if (selection == 2) {
                System.out.println("Apple, Banana, Coconut");
            } else if (selection == 3) {
                System.out.println("Goodbye");
                break;
            } else {
                System.out.println("\n\nYou did not enter a valid choice, please enter 1, 2, or 3.\n\n");
            }

        }

        scanner.close();

    }

    public static void printMenu() {
        System.out.println("_____Menu_____");
        System.out.println("1: Say Hello");
        System.out.println("2: List My favorite foods");
        System.out.println("3: Exit");
        System.out.println();
    }
}
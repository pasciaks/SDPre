import java.util.Scanner;

public class ScannerInput {

    public static void main(String[] args) {

        int number;
        System.out.print("Please enter a number between 1 and 10: ");
        number = getInteger(1, 10);

    }

    public static int getInteger(int min, int max) {
        Scanner scanner;
        boolean shouldTryAgain = true;
        int validUserInput = 0;
        do {
            try {
                scanner = new Scanner(System.in);
                String userInputString = scanner.nextLine();
                int userInput = Integer.parseInt(userInputString);
                if (userInput >= min && userInput <= max) {
                    validUserInput = userInput;
                    shouldTryAgain = false;
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid input. Try again.");
            } catch (Exception exception) {
                System.out.println("----------------------------------------------------------------------------");
                System.out.println("MY Personal Exception caught: " + exception);
                System.out.println("----------------------------------------------------------------------------");
            }
        } while (shouldTryAgain);
        return validUserInput;
    }

}

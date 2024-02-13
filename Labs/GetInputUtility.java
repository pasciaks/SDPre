import java.util.Scanner;

public class GetInputUtility {

    public static String getLargestString() {
        StringBuilder largestString = new StringBuilder();
        largestString.append("\uffff".repeat(4095)); // Appending the highest possible character
        return largestString.toString();
    }

    public static <T extends Comparable<T>> T getInput(T min, T max, String unsupportedMessage, String outOfRangeMessage, String invalidFormatMessage, String showExtraneousErrorMessage) {
        Scanner scanner;
        boolean shouldTryAgain = true;
        T validUserInput = null;
        Class<?> clazz = min.getClass(); // Get the class of the input type
        do {
            try {
                scanner = new Scanner(System.in);
                String userInputString = scanner.nextLine();
                if (clazz.equals(Integer.class)) {
                    validUserInput = (T) (Integer) Integer.parseInt(userInputString);
                } else if (clazz.equals(Double.class)) {
                    validUserInput = (T) (Double) Double.parseDouble(userInputString);
                } else if (clazz.equals(String.class)) {
                    validUserInput = (T) userInputString;
                } else {
                    if (unsupportedMessage != null) {
                        System.out.print(unsupportedMessage);
                    }
                    return null;
                }

                if (validUserInput.compareTo(min) >= 0 && validUserInput.compareTo(max) <= 0) {
                    shouldTryAgain = false;
                } else {
                    if (outOfRangeMessage != null) {
                        System.out.print(outOfRangeMessage);
                    }
                }
            } catch (NumberFormatException nfe) {
                if (invalidFormatMessage != null) {
                    System.out.print(invalidFormatMessage);
                }
            } catch (Exception exception) {
                if (showExtraneousErrorMessage != null) {
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println("MY Personal Exception caught: " + exception);
                    System.out.println("----------------------------------------------------------------------------");
                }
            }
        } while (shouldTryAgain);
        return validUserInput;
    }

    public static void main(String[] args) {

        // Example usage for Integer input
        int minInt = 0;
        int maxInt = 100;
        System.out.println("Enter an integer between " + minInt + " and " + maxInt + ": ");
        int userInputInt = getInput(minInt, maxInt, "Unsupported input. Try again.", "Out of range. Try again.", "Invalid input. Try again.", "An error occurred. Try again.");
        System.out.println("You entered: " + userInputInt);

        // Example usage for Double input
        double minDouble = 0.0;
        double maxDouble = 100.0;
        System.out.println("Enter a double between " + minDouble + " and " + maxDouble + ": ");
        double userInputDouble = getInput(minDouble, maxDouble, "Unsupported input. Try again.", "Out of range. Try again.", "Invalid input. Try again.", "An error occurred. Try again.");
        System.out.println("You entered: " + userInputDouble);

        // Example usage for String input
        String minString = ""; // Empty string
        String maxString = getLargestString(); // Largest possible string
        System.out.println("Enter a string between " + minString + " and " + maxString + ": ");
        String userInputString = getInput(minString, maxString, "Unsupported input. Try again.", "Out of range. Try again.", "Invalid input. Try again.", "An error occurred. Try again.");
        System.out.println("You entered: " + userInputString);
    }
}

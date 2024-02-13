import java.util.Scanner;

public class GetInputUtility {

    @SuppressWarnings("unchecked")
    public static <T extends Comparable<T>> T getInput(T min, T max) {
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
                    System.out.println("Unsupported input type");
                    return null;
                }

                if (validUserInput.compareTo(min) >= 0 && validUserInput.compareTo(max) <= 0) {
                    shouldTryAgain = false;
                } else {
                    System.out.println("Invalid input. Try again.");
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

    public static void main(String[] args) {

        // Example usage for Integer input
        int minInt = 0;
        int maxInt = 100;
        System.out.print("Enter an integer between " + minInt + " and " + maxInt + ": ");
        int userInputInt = getInput(minInt, maxInt);
        System.out.println("You entered: " + userInputInt);

        // Example usage for Double input
        double minDouble = 0.0;
        double maxDouble = 100.0;
        System.out.print("Enter a double between " + minDouble + " and " + maxDouble + ": ");
        double userInputDouble = getInput(minDouble, maxDouble);

        // Example usage for String input
        String minString = ""; // Empty string
        String maxString = "\uffff".repeat(4095); // use case for Maximum (largest alphabetical string + string length)
        System.out.print("Enter a string: ");
        String userInputString = getInput(minString, maxString);
        System.out.println("You entered: " + userInputString);
    }
}

public class MethodsExample {

    // NOTE: My version of this example uses 5 rows of 20 asterisks for a rectangle, and 2 rectangles for a square.


    public static void main(String[] args) {

        System.out.println("Rectangle");
        printRectangle();

        System.out.println("Square");
        printSquare();

    }

    public static void printLine() {
        System.out.println("* * * * * * * * * * * * * * * * * * * *");
    }

    public static void printRectangle() {
        for (int i = 1; i <= 5; i++) {
            printLine();
        }
    }

    public static void printSquare() {
        printRectangle();
        printRectangle();
    }
}
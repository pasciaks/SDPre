public class MethodsWithParameters {

    // NOTE: My version of this example uses 5 rows of 20 asterisks for a rectangle, and 2 rectangles for a square.


    public static void main(String[] args) {

        System.out.println("Rectangle (3 cols, 6 rows)");
        printRectangle(3, 6);
        System.out.println();

        System.out.println("Square (size 2 ( 2 cols, 2 rows))");
        printSquare(2);
        System.out.println();

        System.out.println("Rectangle (8 cols, 4 rows)");
        printRectangle(8, 4);
        System.out.println();

        System.out.println("Rectangle (3 cols, 3 rows)");
        printRectangle(3, 3);
        System.out.println();

    }

    public static void printLine(int cols) {
        for (int i = 1; i <= cols; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }

    public static void printRectangle(int cols, int rows) {
        for (int i = 1; i <= rows; i++) {
            printLine(cols);
        }
        if (cols == rows) {
            System.out.println("This is a square.");
        }
    }

    public static void printSquare(int size) {
        printRectangle(size, size);
    }
}
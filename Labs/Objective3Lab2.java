class Objective3Lab2 {

    /*
        Create a file called Objective3Lab2.java in the SDPre/Labs directory.
        Write a program that calculates the length of the hypotenuse of a right triangle.
        Create a class structure with the name Objective3Lab2.
        Create a main method.
        Create three double variables called side1, side2, and hypotenuse.

        side1 will hold its respective side length.
        side2 will hold its respective side length.
        hypotenuse should be assigned the calculated hypotenuse length. Remember: a2 + b2 = c2.
        Print out the hypotenuse.

        Hints:

        side1 * side1 is the equivalent of side12
        Math.sqrt() is a function available via the Java Math library.

        // The hypotenuse of a triangle with sides 10.0 and 8.0 is 12.806248474865697

     */

    public static void main(String[] args) {

        double side1, side2, hypotenuse;

        side1 = 10.0;
        side2 = 8.0;
        hypotenuse = Math.sqrt((side1 * side1) + (side2 * side2));

        System.out.println("The hypotenuse of a triangle with sides " + side1 + " and " + side2 + " is " + hypotenuse + "\n");

        // Note: Perhaps a better way to do this would be to use the printf method:
        // https://www.theserverside.com/blog/Coffee-Talk-Java-News-Stories-and-Opinions/How-to-use-Java-printf-to-format-output
        // System.out.printf("The hypotenuse of a triangle with sides %.1f and %.1f is %.15f\n", side1, side2, hypotenuse);

    }
}
import java.util.Scanner;

public class Objective4Lab2 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int num1 = 0, num2 = 0, num3 = 0;
        double dub1 = 0.0, dub2 = 0.0, dub3 = 0.0;

        /*
            Create a file called Objective4Lab2.java in the SDPre/Labs directory.
            Using the starter code below, add code to the commented area following the TODO comment instructions.
            Prompt the user to get input for all of the int and double variables, using keyboard.nextInt() and keyboard.nextDouble().
            Print the user's input to match the expected output using the int and double variables.

         */

        //TODO prompt the user to get input for all of the above int variables.

        System.out.print("Please enter the first whole number you would like to add.\n>> ");
        num1 = keyboard.nextInt();

        System.out.print("Please enter the second whole number you would like to add.\n>> ");
        num2 = keyboard.nextInt();

        System.out.print("Please enter the third whole number you would like to add.\n>> ");
        num3 = keyboard.nextInt();

        //TODO prompt the user to get input for all of the above double variables.

        System.out.print("Please enter the first decimal number you would like to add.\n>> ");
        dub1 = keyboard.nextDouble();

        System.out.print("Please enter the second decimal number you would like to add.\n>> ");
        dub2 = keyboard.nextDouble();

        System.out.print("Please enter the third decimal number you would like to add.\n>> ");
        dub3 = keyboard.nextDouble();

        //TODO print the three ints and their sum.

        System.out.println("The sum of " + num1 + " + " + num2 + " + " + num3 + " = " + (num1 + num2 + num3));

        //TODO print the three doubles and their sum.

        System.out.println("The sum of " + dub1 + " + " + dub2 + " + " + dub3 + " = " + (dub1 + dub2 + dub3));

    }
}

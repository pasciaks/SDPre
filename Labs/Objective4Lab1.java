import java.util.Scanner;

public class Objective4Lab1 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String fname = "";
        String lname = "";
        String favoriteAnimal = "";
        String favoriteFood = "";
        String favoriteSong = "";

        //TODO prompt the user to get input for all of the String variables.

        /*
            What is your first name?
            >> John
            What is your last name?
            >> Doe
            What is your favorite animal?
            >> Lemur
            What is your favorite food?
            >> Tacos
            What is your favorite song?
            >> Twinkle Twinkle Little star
         */

        System.out.print("What is your first name?\n>> ");
        fname = keyboard.nextLine();

        System.out.print("What is your last name?\n>> ");
        lname = keyboard.nextLine();

        System.out.print("What is your favorite animal?\n>> ");
        favoriteAnimal = keyboard.nextLine();

        System.out.print("What is your favorite food?\n>> ");
        favoriteFood = keyboard.nextLine();

        System.out.print("What is your song?\n>> ");
        favoriteSong = keyboard.nextLine();

        //TODO print the output formatted to look like the expected output using String concatenation.

        /*
            My name is John Doe.
            My favorite animal is the Lemur.
            My favorite food is Tacos.
            My favorite song is Twinkle Twinkle Little Star.
         */

        System.out.println("My name is " + fname + " " + lname + ".");
        System.out.println("My favorite animal is the " + favoriteAnimal + ".");
        System.out.println("My favorite food is " + favoriteFood + ".");
        System.out.println("My favorite song is " + favoriteSong + ".");

    }
}

import java.util.Scanner;
import java.time.LocalDate;

/*

Create a file called Objective4Lab3.java in the SDPre/Labs directory.
Using the starter code below add code to the commented area that would:
Take in the users age using input.nextInt() and store it in the age variable.
Calculate what year the user was born in.
Print out the calculated birthYear.

Hint: You will need to use the currentYear variable to calculate the birthYear.
Hint: When calculating the birthYear you will need to take into account whether or not the user has had their birthday yet this year.

 */
public class Objective4Lab3 {

    /*
        This method takes in an age and a boolean to determine if the birthday has passed.
        This is necessary because if the person's birthday has not passed we need to subtract
        one from the age to get the correct birth year.
     */
    private static int calculateBirthYear(int age, boolean hasBirthdayPassed) {
        // Get today's date
        LocalDate today = LocalDate.now();

        // Calculate birth year
        LocalDate birthDate;
        if (hasBirthdayPassed) {
            birthDate = today.minusYears(age);
        } else {
            birthDate = today.minusYears(age + 1);
        }
        return birthDate.getYear();
    }

    public static void main(String[] args) {
        int birthYear, age, currentYear;

        birthYear = 0;

        /*
            Your solution goes here
            Expected Output
                How old are you?
                >> 27
                You were born in 1990
        */

        LocalDate today = LocalDate.now();
        currentYear = today.getYear();

        // Extra for debugging and evaluation purposes

        System.out.println("The current year is " + currentYear + ".");
        System.out.println("The current month is " + today.getMonthValue() + ".");
        System.out.println("The current day is " + today.getDayOfMonth() + ".");
        System.out.println("The current day of the week is " + today.getDayOfWeek() + ".");
        System.out.println("The current day of the year (Calendar Julian Day) is " + today.getDayOfYear() + ".");
        System.out.println("The current era is " + today.getEra() + ".");
        System.out.println("The current leap year status is " + today.isLeapYear() + ".");

        Scanner input = new Scanner(System.in);
        System.out.print("How old are you?\n>> ");
        age = input.nextInt();

        birthYear = calculateBirthYear(age, true);
        System.out.println("If your birthday has already passed this year.");
        System.out.println("You were born in " + birthYear);

        birthYear = calculateBirthYear(age, false);
        System.out.println("If your birthday has not passed yet this year.");
        System.out.println("You were born in " + birthYear);

        input.close();


    }
}
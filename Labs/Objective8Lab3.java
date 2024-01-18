public class Objective8Lab3 {

    /*

        Using the starter code below, add code to the commented areas that would:
        Print out the numbers from 1 to 20 while also stating whether the number is odd or even.
        Write a for loop.
        Declare and initialize your control variable to 1.
        Add a conditional statement to make the loop execute 20 times.
        Increment your control variable with each iteration.
        Write your for loop body
        Write an if statement that determines whether the number is even or odd. Think % operator.
        Print out counter is even or  is odd accordingly.


     */
    public static void main(String[] args) {

        int counter = 1;

        for (counter = 1; counter <= 20; counter++) {

            boolean isEven;

            isEven = counter % 2 == 0;

            System.out.print(counter + " is " + (isEven ? "even" : "odd") + "\n");

        }

    }
}
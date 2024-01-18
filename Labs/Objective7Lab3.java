public class Objective7Lab3 {

    /*
        Create a file called Objective7Lab3.java in the SDPre/Labs directory.
        Using the starter code below, add code to the commented areas that would:
        Print out the numbers 1 to 20, while also printing whether the number is odd or even.
        Write a while loop.
        Use the provided counter variable to have the loop execute 20 times.
        Write an if statement that determines if the number is even or odd. (Think % operator.)
        Print out counter is even or  is odd accordingly.
        Increment the value of counter with each iteration.
     */

    public static void main(String[] args) {
        int counter = 1;

        while (counter <= 20) {

            boolean isEven;

            isEven = counter % 2 == 0;

            System.out.print(counter + " is " + (isEven ? "even" : "odd") + "\n");

            counter++;

        }

    }
}
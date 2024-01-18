public class Objective8Lab2 {

    /*
        Create a file called Objective8Lab2.java in the SDPre/Labs directory. Using a for loop, write a program that sums up the numbers 1 to 20: 1 + 2 + 3 ... + 20.

        Create a class structure with the name Objective8Lab2.
        Create a main method.
        Create a variable to refer to the current sum total.
        Write a for loop.
        Increment the value of your control variable with each iteration.
        Update the current sum by adding your control variable to the sum with each iteration.
        This time there is no starter code provided for you. You are going to create the entire file structure from scratch. DO NOT COPY AND PASTE. While the code is similar and it is enticing to use a solution you already have, the additional repetitions will aid in impressing this process in your mind.
     */

    public static void main(String[] args) {

        int sum = 0;

        for (int count = 1; count <= 20; count++) {

            sum += count;

        }

        System.out.println(sum);

    }
}
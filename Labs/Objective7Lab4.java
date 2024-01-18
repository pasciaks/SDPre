public class Objective7Lab4 {

    /*
        Create a file called Objective7Lab4.java in the SDPre/Labs directory. Write a program that sums up the numbers from 1 to 20: 1 + 2 + 3 ... + 20.

        Create a class structure with the name Objective7Lab4.
        Create a main method.
        Create two variables to store the current sum total and a counter.
        Write a while loop.
        Use the count variable to have the loop execute 20 times.
        Increment the value of count with each iteration.
        Update the current sum by adding count to sum with each iteration.
     */

    public static void main(String[] args) {

        int count = 1;
        int total = 0;

        while (count <= 20) {

            total += count;

            count++;

        }

        System.out.println(total);

    }
}
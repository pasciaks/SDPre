class Objective3Lab3 {

    /*
        Objective: Simulate a rolled die to get three random values between 1 and 6.

        Create a file called Objective3Lab3.java in the SDPre/Labs directory.
        Create a class structure with the name Objective3Lab3.
        Create a main method.
        Create three int variables called first, second, and third.
        These three variables will each refer to a randomly selected number between 1 and 6.

        Hint: To generate a random number between 1 and 6:
        1 + (int)(Math.random() * 6)

        // Note this is good for arbitrary 1-6, but not for min/max translation if adapted to a method
        // Use the following for such cases...
        // return (int) (Math.floor(Math.random() * (max - min + 1)) + min);

        You will learn exactly what this line of code is doing when we see you in class!
        Again there will be no starter code provided, for the same reasons as before.
     */

    /*
    Using prior knowledge of the Math class, create a method called generateRandom() that takes two int arguments, min and max, and returns a random number between min and max inclusive.
     */
    public static int generateRandom(int min, int max) {
        // return min + (int) (Math.random() * max); // // Note: this random for min/max is flawed, good for 1-6, but not when min is not 1
        return (int) (Math.floor(Math.random() * (max - min + 1)) + min);
    }

    public static void main(String[] args) {

        int first, second, third;
        first = generateRandom(1, 6);
        second = generateRandom(1, 6);
        third = generateRandom(1, 6);

        System.out.println(first + " + " + second + " + " + third + " = " + (first + second + third));

    }
}
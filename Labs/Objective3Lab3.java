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
        You will learn exactly what this line of code is doing when we see you in class!
        Again there will be no starter code provided, for the same reasons as before.
     */

    /*
    Using prior knowledge of the Math class, create a method called generateRandom() that takes two int arguments, min and max, and returns a random number between min and max inclusive.
     */
    public static int generateRandom(int min, int max) {

        // Example use of generateRandom():
        //        for (int i = 0; i < 99; i++) {
        //            System.out.println(generateRandom(1, 6));
        //        }

        return min + (int) (Math.random() * max);
    }

    public static void main(String[] args) {

        int first, second, third;
        first = generateRandom(1, 6);
        second = generateRandom(1, 6);
        third = generateRandom(1, 6);

        System.out.println(first + " + " + second + " + " + third + " = " + (first + second + third));




    }
}
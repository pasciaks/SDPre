public class Objective6Lab1 {

    public static int generateRandom(int min, int max) {
        // return min + (int) (Math.random() * max); // // Note: this random for min/max is flawed, good for 1-6, but not when min is not 1
        return (int) (Math.floor(Math.random() * (max - min + 1)) + min);
    }

    public static void main(String[] args) {
        int month = 6;

        // Note: For testing purposes, uncomment the following line to generate a random number between -5 and 13
        // month = generateRandom(-5, 13);
        // System.out.println("The random number is: " + month);

        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("That is not a valid month");
                break;
        }
    }
}
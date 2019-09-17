package speeding;

import support.cse131.ArgsProcessor;

public class SpeedClass {
    public static void main(String[] args) {
        ArgsProcessor ap = new ArgsProcessor(args);

        int speed = ap.nextInt("What speed were you going?");
        int speedLimit = ap.nextInt("What's the speed limit?");
        int speedOver = speed-speedLimit;
        int initialFine = (speedOver >= 10) ? 50 : 0;
        int otherFine = (speedOver > 10) ? (10 * (speedOver-10)) : 0;
        int actualFine = (initialFine + otherFine);

        System.out.println("Your reported speed is " + speed + " for a speed limit of " + speedLimit + ".");
        System.out.println("You went " + speedOver + " MPH over the speed limit. ");
        System.out.println("Your fine is " + actualFine + " dollars.");






    }




}

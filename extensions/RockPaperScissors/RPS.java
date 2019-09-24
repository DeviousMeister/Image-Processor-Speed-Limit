package RockPaperScissors;

import support.cse131.ArgsProcessor;

public class RPS {
    public static void main(String[] args){
        ArgsProcessor ap = new ArgsProcessor(args);
        int rounds = ap.nextInt("How many rounds?");
        double RPS = Math.random();
        for(int x = 0; x < rounds; ++x) {
            if (RPS < (1.0/3.0)) {
                System.out.println("Rock");
            }
            else if (RPS < (2.0/3.0)) {
                System.out.println("Paper");
            }
            else if (RPS < (3.0/3.0)) {
                System.out.println("Scissors");
            }


        }
    }
}

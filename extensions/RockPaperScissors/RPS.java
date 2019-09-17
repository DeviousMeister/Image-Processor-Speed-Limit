package RockPaperScissors;

import support.cse131.ArgsProcessor;

public class RPS {
    public static void main(String[] args){
        ArgsProcessor ap = new ArgsProcessor(args);

        String rockPapSci = ap.nextString("Rock, Paper, Scissors");
        System.out.println(rockPapSci);
        //rock < paper < scissors?
    }
}

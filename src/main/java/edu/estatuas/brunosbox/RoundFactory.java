package edu.estatuas.brunosbox;

import java.util.Arrays;
import java.util.List;

public class RoundFactory {

    private static List <String> regularScores = Arrays.asList("10 - 9","9 - 10");
    private static List <String> knockdownScores = Arrays.asList("10 - 8","8 - 10");

    public static Round getRound(String roundScore){
        if (roundScore == null) { 
            return null;
        } 
        if (regularScores.contains(roundScore)){
            return new RegularRound(roundScore);
        }
        else if (knockdownScores.contains(roundScore)){
            return new KnockdownRound(roundScore);
        }
        else if (roundScore.contains(",")){
            return new PointsDeducted(roundScore);
        }
        return null;
    }
}

package edu.estatuas.brunosbox;

import java.util.ArrayList;
import java.util.List;

public class ScoreCard {

    private String color;
    private String redCorner = "";
    private String blueCorner = "";
    private String[] judgeScoreCard;
    private List<Round> rounds = new ArrayList<>();

    public ScoreCard(String color) {

        this.color = color;

    }

    public void setRCorner(String redCorner) {
        this.redCorner = redCorner;
    }

    public void setBCorner(String blueCorner) {
        this.blueCorner = blueCorner;
    }

    @Override
    public String toString() {
        return "\n\t\t\s\s\s" + this.color
                + "\n\t" + this.blueCorner + "\t"
                + this.redCorner
                + "\n\t\t\s\s" + this.getNumRounds()
                + " rounds\n"
                + "Round\tScore\tRound\tScore\tRound\n"
                + "Score\tTotal\t\tTotal\tScore\n"
                + viewRounds()
                + "FINAL SCORE: " + getRedBoxerFinalScore()
                + " - " + getBlueBoxerFinalScore()
                + " FINAL SCORE\n";
    }

    public void loadJudgeScoreCard(String[] judgeScoreCard) {
        this.judgeScoreCard = judgeScoreCard;
        this.addRounds();
    }

    private void addRounds() {
        
        for (String round : this.judgeScoreCard){
            rounds.add(new RegularRound(round));
        }
    }

    private int getNumRounds() {
        int value = 0;
        if (this.judgeScoreCard != null){
            value = this.judgeScoreCard.length;
        } 
        return value;
    }

    private int getRedBoxerFinalScore(){

        int redBoxerFinalScore = 0;
        for (Round round : this.rounds){
            redBoxerFinalScore += round.getRedBoxerScore();
        }
        return redBoxerFinalScore;
    }

    private int getBlueBoxerFinalScore(){

        int blueBoxerFinalScore = 0;
        for (Round round : this.rounds){
            blueBoxerFinalScore += round.getBlueBoxerScore();
        }
        return blueBoxerFinalScore;
    }

    private String viewRounds(){
        
        String roundsString = "";
        int rondaActual = 1;
        int redBoxerActualScore = 0;
        int blueBoxerActualScore = 0;
        for (Round round : this.rounds){
            roundsString = roundsString 
                            + round.getRedBoxerScore() 
                            + "\t" + (redBoxerActualScore += round.getRedBoxerScore())
                            + "\t" + rondaActual
                            + "\t" + (blueBoxerActualScore += round.getBlueBoxerScore())
                            + "\t" + round.getBlueBoxerScore() 
                            + "\n";
            rondaActual++;
        }

        return roundsString;
    }
}

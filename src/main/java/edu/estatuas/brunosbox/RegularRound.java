package edu.estatuas.brunosbox;

public class RegularRound implements Round {

    private String roundScore;
    private byte redBoxerScore;
    private byte blueBoxerScore;

    public RegularRound(String roundScore){

        this.roundScore = roundScore;
    }

    public byte redBoxerScore(){
        roundScore.replace(" ", "");
        return (roundScore.substring(0, roundScore.indexOf("-"))).;

    }
}
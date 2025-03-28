package edu.estatuas.brunosbox;

public class RegularRound implements Round {

    private String roundScore;
    private byte redBoxerScore;
    private byte blueBoxerScore;

    public RegularRound(String roundScore){

        this.roundScore = roundScore.replaceAll("\\s","");
        this.splitScores();
    }

    private void splitScores(){
        this.redBoxerScore = Byte.parseByte(this.roundScore.substring(0, this.roundScore.indexOf("-")));
        this.blueBoxerScore = Byte.parseByte(this.roundScore.substring(this.roundScore.indexOf("-")+1, this.roundScore.length()));
    }


    public byte getRedBoxerScore(){
        return this.redBoxerScore;
    }

    public byte getBlueBoxerScore(){
        return this.blueBoxerScore;
    }

    @Override
    public String toString(){
        return this.getRedBoxerScore() + " - " + this.getBlueBoxerScore();
    }
}
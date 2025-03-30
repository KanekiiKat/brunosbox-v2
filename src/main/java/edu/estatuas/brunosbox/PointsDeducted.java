package edu.estatuas.brunosbox;

public class PointsDeducted implements Round {

    private String roundScore;
    private byte redBoxerScore;
    private byte blueBoxerScore;

    PointsDeducted(String roundScore){
        this.roundScore = roundScore.replaceAll("\\s", "");
        boxerRoundScore();
    }

    @Override
    public void boxerRoundScore(){

        if (this.roundScore.indexOf(",") == 1){
            this.redBoxerScore = parseComaRed(this.roundScore);
            this.blueBoxerScore = Byte.parseByte(this.roundScore.substring(this.roundScore.indexOf("-")+1, this.roundScore.length()));
        }
        else {
            this.redBoxerScore = Byte.parseByte(this.roundScore.substring(0, this.roundScore.indexOf("-")));
            this.blueBoxerScore = parseComaBlue(this.roundScore);
        }
    }

    private Byte parseComaRed(String score){
        return Byte.parseByte(score.substring(score.indexOf(",")+1, score.indexOf("-")));
    }

    private Byte parseComaBlue(String score){
        return Byte.parseByte(score.substring(score.indexOf("-")+1, score.indexOf(",")));
    }

    @Override
    public byte getRedBoxerScore(){
        return this.redBoxerScore;
    }
    
    @Override
    public byte getBlueBoxerScore(){
        return this.blueBoxerScore;
    }

    @Override
    public String toString(){
        return this.getRedBoxerScore() + " - " + this.getBlueBoxerScore();
    }
}


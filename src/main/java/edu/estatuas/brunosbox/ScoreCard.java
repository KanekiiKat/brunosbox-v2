package edu.estatuas.brunosbox;

public class ScoreCard {

    private String color;
    private String redCorner = "";
    private String blueCorner = "";

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
        return "\n\t\t" + this.color
                + "\n\t" + this.blueCorner + "\t"
                + this.redCorner
                + "\n\t" + "0"
                + " rounds\n"
                + "\s\sRound\tScore\tRound\tScore\tRound\n"
                + "\s\sScore\tTotal\t\tTotal\tScore"
                + "Regular round 10 - 9";
    }

}

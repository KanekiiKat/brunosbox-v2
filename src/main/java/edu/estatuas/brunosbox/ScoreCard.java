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
        return "\n\t\t\s\s\s" + this.color
                + "\n\t" + this.blueCorner + "\t"
                + this.redCorner
                + "\n\t\t\s\s" + "0"
                + " rounds\n"
                + "Round\tScore\tRound\tScore\tRound\n"
                + "Score\tTotal\t\tTotal\tScore";
    }

}

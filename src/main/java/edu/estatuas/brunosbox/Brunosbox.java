package edu.estatuas.brunosbox;

public class Brunosbox 
{
    public static void main( String[] args ) {

        System.out.println("\n - I see three of them out there." + 
                           "\n - Hit the one in the middle.- Rocky Balboa\n");

        String[] headers = {"Round 1", "Round 2", "Round 3", "Round 4", "Round 5", 
                            "Round 6", "Round 7", "Round 8", "Round 9", "Round 10"};

        String[][] data = {

            //  White ScoreCard
            {"9 - 10", 
             "9 - 10", 
             "9 - 10", 
             "9 - 10",
             "10 - 9",
             "10 - 9",
             "10 - 9", 
             "9 - 10", 
             "10 - 9", 
             "9 - 10"},
            
             // Blue ScoreCard
            {"9 - 10", 
             "9 - 10", 
             "9 - 10", 
             "8 - 10", // knockdown
             "10 - 8", // knockdown
             "10 - 8",
             "10 - 9", 
             "9 - 10", 
             "10 - 9", 
             "10 - 9"},

            // Pink ScoreCard
            {"9 - 10", 
             "9 - 10", 
             "9 - 10", 
             "1, 8 - 10", // referee point deduction
             "10 - 8",    // knockdown
             "10 - 8 ,1", // referee point deduction
             "10 - 9", 
             "9 - 10", 
             "10 - 9", 
             "10 - 8" // knockdown
            }
        };
    }
}

package org.BrittanyWeaver.Chap5.SimpleStartupGame;

public class SimpleStartup {

    private int numOfHits;
    private int[] locationCells;

    public void setLocationCells(int[] locs) {
        locationCells = locs;
    }

    public String checkYourself(int guess) {
        String result = "miss";

        for(int cell : locationCells) {
            if(guess == cell) {
                result = "hit";
                numOfHits++;
                break;
            }
        }

        if(numOfHits == locationCells.length) {
            result = "kill";
        }
        System.out.println(result);
        return result;
    }
}

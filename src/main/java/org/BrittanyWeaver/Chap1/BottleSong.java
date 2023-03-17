package org.BrittanyWeaver.Chap1;

public class BottleSong {
    public static void main (String[] args) {

        int numberOfBottles = 99;
        String bottle = "bottles";

        while (numberOfBottles > 0) {

            if (numberOfBottles == 1) {
                bottle = "bottle";
            }

            System.out.println(numberOfBottles + " " + bottle + " of beer on the wall");
            System.out.println(numberOfBottles + " " + bottle + " of beer");
            System.out.println("You take one down, pass it around");
            numberOfBottles--;

            if (numberOfBottles > 1) {
                System.out.println(numberOfBottles + " " + bottle + " of beer on the wall");
            } else if (numberOfBottles == 1) {
                System.out.println(numberOfBottles + " bottle of beer on the wall");
            } else{
                System.out.println("There are no more bottles of beer on the wall");
            }

        }
    }
}

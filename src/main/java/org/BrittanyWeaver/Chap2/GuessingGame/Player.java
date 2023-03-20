package org.BrittanyWeaver.Chap2.GuessingGame;

import java.io.InputStream;
import java.util.Scanner;

public class Player {
    int number;

    public void guess(){
        System.out.println("I'm guessing ");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

}

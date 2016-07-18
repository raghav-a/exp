package com.directi.tictactoe;

import java.io.PrintStream;

public class MessagePrompter {

    private PrintStream out = System.out;

    public void displayRules() {

        StringBuffer rules = new StringBuffer("\nTicTacToeRules");
        rules.append("\n")
                .append("\n* Player one takes first turn and gets X as the symbol")
                .append("\n* Player two takes second turn and gets O as the symbol")
                .append("\n* One who strikes three consecutive spots with his/her symbol either in a column or row or diagonal wins.")
                .append("\n* In case all the spots are occupied and none occupies three consecutive spots Game is drawn.");


        out.println(rules);

    }

    public void askNameForPlayer(Integer playerNumber) {
        out.println("Enter name for player " + playerNumber);
    }
}

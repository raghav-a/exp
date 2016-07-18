package com.directi.tictactoe;

public class GameLauncher {

    public static void main(String[] args) {


        InputReader inputReader = new InputReader();
        MessagePrompter messagePrompter = new MessagePrompter();
        messagePrompter.displayRules();

        messagePrompter.askNameForPlayer(1);
        Player playerOne = new Player(inputReader.readName());
        messagePrompter.askNameForPlayer(2);
        Player playerTwo = new Player(inputReader.readName());

        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.start(playerOne, playerTwo);
        while(!ticTacToe.isOver()){
           Player playerForThisTurn = ticTacToe.getPlayerForMove();
        }

    }
}

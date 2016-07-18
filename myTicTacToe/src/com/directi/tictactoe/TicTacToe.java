package com.directi.tictactoe;

public class TicTacToe {
    private boolean isOver;
    private Player playerForMove;

    public void start(Player playerOne, Player playerTwo) {
        this.isOver = false;
        this.playerForMove = playerOne;
    }

    public boolean isOver() {
        return isOver;
    }

    public Player getPlayerForMove() {
        return playerForMove;
    }
}

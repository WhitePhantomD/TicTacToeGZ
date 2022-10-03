package com.example.tictactoegz;

public class TicTacToeLogistic {
    //1 == X | 2 == O
    int[] tttArray = {0,0,0,0,0,0,0,0,0};
    boolean[] taken = {false,false,false,false,false,false,false,false,false};

    int moveCounter = 0;
    int placeMent = 0;

    public TicTacToeLogistic(int placeMent,int moveCounter) {
        this.placeMent = placeMent;
        this.moveCounter = moveCounter;

    }

    //checks if the place is taken
    private boolean ifPlaceTaken(){
        return false;
    }

    //tells what player makes the move
    private int playerMove(){
        return 0;
    }

    //checks if one player won
    public boolean ifWon(){
        return false;
    }
}

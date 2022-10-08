package com.example.tictactoegz;

import android.widget.ImageView;

public class TicTacToeLogistic {
    //1 == X | 2 == O
    int[] tttArray = {0, 0, 0, 0, 0, 0, 0, 0, 0};
    boolean[] taken = {false, false, false, false, false, false, false, false, false};

    int moveCounter = 0;

    public TicTacToeLogistic() {

    }

    public void move(ImageView imageView, int placeMent) {
        if (taken[placeMent] == false) {
            moveCounter++;
            if (playerMove() == 1) {
                imageView.setImageResource(R.drawable.image_x);
            } else {
                imageView.setImageResource(R.drawable.image_o);
            }
            tttArray[placeMent] = playerMove();
            taken[placeMent] = true;
        }
    }

    //tells what player makes the move
    private int playerMove() {
        if(moveCounter % 2 == 0){
            return 2;
        } else {
            return 1;
        }
    }

    //checks if one player won
    public boolean ifWon() {
        return false;
    }
}

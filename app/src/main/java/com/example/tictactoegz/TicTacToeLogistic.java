package com.example.tictactoegz;

import android.widget.ImageView;

import java.util.Arrays;
import java.util.function.IntConsumer;

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
    public boolean ifWon(ImageView imageView) {
        imageView.setImageResource(R.drawable.x_won_image);
        return false;
    }

    public void reset(ImageView one,ImageView two,ImageView three,ImageView four,ImageView five,ImageView six,ImageView seven,ImageView eight,ImageView nine){
        moveCounter = 0;
        Arrays.fill(tttArray,0);
        Arrays.fill(taken,false);
        one.setImageResource(R.drawable.invisible_image);
        two.setImageResource(R.drawable.invisible_image);
        three.setImageResource(R.drawable.invisible_image);
        four.setImageResource(R.drawable.invisible_image);
        five.setImageResource(R.drawable.invisible_image);
        six.setImageResource(R.drawable.invisible_image);
        seven.setImageResource(R.drawable.invisible_image);
        eight.setImageResource(R.drawable.invisible_image);
        nine.setImageResource(R.drawable.invisible_image);
    }
}

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
        if (tttArray[0] == 1 && tttArray[1] == 1 && tttArray[2] == 1 || tttArray[3] == 1 && tttArray[4] == 1 && tttArray[5] == 1 || tttArray[6] == 1 && tttArray[7] == 1 && tttArray[8] == 1 || tttArray[0] == 1 && tttArray[3] == 1 && tttArray[6] == 1 || tttArray[1] == 1 && tttArray[4] == 1 && tttArray[7] == 1 || tttArray[2] == 1 && tttArray[5] == 1 && tttArray[8] == 1 || tttArray[0] == 1 && tttArray[4] == 1 && tttArray[8] == 1 || tttArray[2] == 1 && tttArray[4] == 1 && tttArray[6] == 1 ) {
            imageView.setImageResource(R.drawable.x_won_image);
            return true;
        } else if(tttArray[0] == 2 && tttArray[1] == 2 && tttArray[2] == 2 || tttArray[3] == 2 && tttArray[4] == 2 && tttArray[5] == 2 || tttArray[6] == 2 && tttArray[7] == 2 && tttArray[8] == 2 || tttArray[0] == 2 && tttArray[3] == 2 && tttArray[6] == 2 || tttArray[1] == 2 && tttArray[4] == 2 && tttArray[7] == 2 || tttArray[2] == 2 && tttArray[5] == 2 && tttArray[8] == 2 || tttArray[0] == 2 && tttArray[4] == 2 && tttArray[8] == 2 || tttArray[2] == 2 && tttArray[4] == 2 && tttArray[6] == 2 ){
            imageView.setImageResource(R.drawable.o_won_image);
            return true;
        }
        return false;
    }

    public void reset(ImageView one,ImageView two,ImageView three,ImageView four,ImageView five,ImageView six,ImageView seven,ImageView eight,ImageView nine,ImageView ten){
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
        ten.setImageResource(R.drawable.invisible_image);
        one.setClickable(true);
        two.setClickable(true);
        three.setClickable(true);
        four.setClickable(true);
        five.setClickable(true);
        six.setClickable(true);
        seven.setClickable(true);
        eight.setClickable(true);
        nine.setClickable(true);
    }
}

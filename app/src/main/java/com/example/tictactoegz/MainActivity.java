package com.example.tictactoegz;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.tictactoegz.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView imageViewLeftTop,imageViewLeftMid,imageViewLeftBot,imageViewMidTop,imageViewMidMid,imageViewMidBot,imageViewRightTop,imageViewRightMid,imageViewRightBot;

    TicTacToeLogistic tttl = new TicTacToeLogistic();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewLeftTop = findViewById(R.id.imageViewLeftTop);
        imageViewLeftMid = findViewById(R.id.imageViewLeftMid);
        imageViewLeftBot = findViewById(R.id.imageViewLeftBot);
        imageViewMidTop = findViewById(R.id.imageViewMidTop);
        imageViewMidMid = findViewById(R.id.imageViewMidMid);
        imageViewMidBot = findViewById(R.id.imageViewMidBot);
        imageViewRightTop = findViewById(R.id.imageViewRightTop);
        imageViewRightMid = findViewById(R.id.imageViewRightMid);
        imageViewRightBot = findViewById(R.id.imageViewRightBot);

        imageViewLeftTop.setOnClickListener(this);
        imageViewLeftMid.setOnClickListener(this);
        imageViewLeftBot.setOnClickListener(this);
        imageViewMidTop.setOnClickListener(this);
        imageViewMidMid.setOnClickListener(this);
        imageViewMidBot.setOnClickListener(this);
        imageViewRightTop.setOnClickListener(this);
        imageViewRightMid.setOnClickListener(this);
        imageViewRightBot.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imageViewLeftTop:
                tttl.move(imageViewLeftTop,0);
                break;
            case R.id.imageViewLeftMid:
                tttl.move(imageViewLeftMid,3);
                break;
            case R.id.imageViewLeftBot:
                tttl.move(imageViewLeftBot,6);
                break;
            case R.id.imageViewMidTop:
                tttl.move(imageViewMidTop,1);
                break;
            case R.id.imageViewMidMid:
                tttl.move(imageViewMidMid,4);
                break;
            case R.id.imageViewMidBot:
                tttl.move(imageViewMidBot,7);
                break;
            case R.id.imageViewRightTop:
                tttl.move(imageViewRightTop,2);
                break;
            case R.id.imageViewRightMid:
                tttl.move(imageViewRightMid,5);
                break;
            case R.id.imageViewRightBot:
                tttl.move(imageViewRightBot,8);
                break;
        }
    }
}
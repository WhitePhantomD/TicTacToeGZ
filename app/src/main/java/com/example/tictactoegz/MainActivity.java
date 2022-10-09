package com.example.tictactoegz;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import com.example.tictactoegz.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView imageViewLeftTop,imageViewLeftMid,imageViewLeftBot,imageViewMidTop,imageViewMidMid,imageViewMidBot,imageViewRightTop,imageViewRightMid,imageViewRightBot,imageViewResetButton,imageViewWon;

    TicTacToeLogistic tttl = new TicTacToeLogistic();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
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
        imageViewResetButton = findViewById(R.id.imageViewResetButton);
        imageViewWon = findViewById(R.id.imageViewWon);

        imageViewLeftTop.setOnClickListener(this);
        imageViewLeftMid.setOnClickListener(this);
        imageViewLeftBot.setOnClickListener(this);
        imageViewMidTop.setOnClickListener(this);
        imageViewMidMid.setOnClickListener(this);
        imageViewMidBot.setOnClickListener(this);
        imageViewRightTop.setOnClickListener(this);
        imageViewRightMid.setOnClickListener(this);
        imageViewRightBot.setOnClickListener(this);
        imageViewResetButton.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imageViewLeftTop:
                tttl.move(imageViewLeftTop,0);
                boolean lt = tttl.ifWon(imageViewWon);
                if (lt == true){
                    disable();
                }
                break;
            case R.id.imageViewLeftMid:
                tttl.move(imageViewLeftMid,3);
                boolean lm = tttl.ifWon(imageViewWon);
                if (lm == true){
                    disable();
                }
                break;
            case R.id.imageViewLeftBot:
                tttl.move(imageViewLeftBot,6);
                boolean lb = tttl.ifWon(imageViewWon);
                if (lb == true){
                    disable();
                }
                break;
            case R.id.imageViewMidTop:
                tttl.move(imageViewMidTop,1);
                boolean mt = tttl.ifWon(imageViewWon);
                if (mt == true){
                    disable();
                }
                break;
            case R.id.imageViewMidMid:
                tttl.move(imageViewMidMid,4);
                boolean mm = tttl.ifWon(imageViewWon);
                if (mm == true){
                    disable();
                }
                break;
            case R.id.imageViewMidBot:
                tttl.move(imageViewMidBot,7);
                boolean mb = tttl.ifWon(imageViewWon);
                if (mb == true){
                    disable();
                }
                break;
            case R.id.imageViewRightTop:
                tttl.move(imageViewRightTop,2);
                boolean rt = tttl.ifWon(imageViewWon);
                if (rt == true){
                    disable();
                }
                break;
            case R.id.imageViewRightMid:
                tttl.move(imageViewRightMid,5);
                boolean rm = tttl.ifWon(imageViewWon);
                if (rm == true){
                    disable();
                }
                break;
            case R.id.imageViewRightBot:
                tttl.move(imageViewRightBot,8);
                boolean rb = tttl.ifWon(imageViewWon);
                if (rb == true){
                    disable();
                }
                break;
            case R.id.imageViewResetButton:
                tttl.reset(imageViewLeftTop,imageViewLeftMid,imageViewLeftBot,imageViewMidTop,imageViewMidMid,imageViewMidBot,imageViewRightTop,imageViewRightMid,imageViewRightBot,imageViewWon);
                break;
        }
    }

    private void disable(){
        imageViewLeftTop.setClickable(false);
        imageViewLeftMid.setClickable(false);
        imageViewLeftBot.setClickable(false);
        imageViewMidTop.setClickable(false);
        imageViewMidMid.setClickable(false);
        imageViewMidBot.setClickable(false);
        imageViewRightTop.setClickable(false);
        imageViewRightMid.setClickable(false);
        imageViewRightBot.setClickable(false);
    }

//    public ImageView getImageViewWon() {
//        return imageViewWon=findViewById(R.id.imageViewWon);
//    }
}
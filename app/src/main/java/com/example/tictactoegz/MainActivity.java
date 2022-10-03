package com.example.tictactoegz;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.tictactoegz.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.imageViewLeftTop.setOnClickListener(this);
        binding.imageViewLeftMid.setOnClickListener(this);
        binding.imageViewLeftBot.setOnClickListener(this);
        binding.imageViewMidTop.setOnClickListener(this);
        binding.imageViewMidMid.setOnClickListener(this);
        binding.imageViewMidBot.setOnClickListener(this);
        binding.imageViewRightTop.setOnClickListener(this);
        binding.imageViewRightMid.setOnClickListener(this);
        binding.imageViewRightBot.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {


    }
}
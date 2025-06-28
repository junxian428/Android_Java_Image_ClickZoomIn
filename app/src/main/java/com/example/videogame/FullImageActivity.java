package com.example.videogame;

import android.os.Bundle;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class FullImageActivity extends AppCompatActivity {

    ImageView fullImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_image);

        fullImageView = findViewById(R.id.fullImageView);
        int imageId = getIntent().getIntExtra("imageId", 0);
        fullImageView.setImageResource(imageId);
    }
}

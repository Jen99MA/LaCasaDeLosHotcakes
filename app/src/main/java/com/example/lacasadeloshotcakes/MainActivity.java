package com.example.lacasadeloshotcakes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView desayunosImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        desayunosImage = findViewById(R.id.DesayunoMenuImageView);


        desayunosImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent miIntent =  new Intent(MainActivity.this, DesayunosActivity.class);

                startActivity(miIntent);
            }
        });
    }

}
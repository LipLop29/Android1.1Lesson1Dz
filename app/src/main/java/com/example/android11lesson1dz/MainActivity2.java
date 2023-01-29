package com.example.android11lesson1dz;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    ImageView ivImg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ivImg = findViewById(R.id.iv_img);

        Bundle argument = getIntent().getExtras();

        String text = argument.getString("text");

        if (argument != null) {
            Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
        }

        switch (text) {

            case "WhatsApp":
                ivImg.setImageResource(R.drawable.whatsapp);
                break;

            case "Google":
                ivImg.setImageResource(R.drawable.google);
                break;

            case "YouTube":
                ivImg.setImageResource(R.drawable.youtube);
                break;
        }
    }
}

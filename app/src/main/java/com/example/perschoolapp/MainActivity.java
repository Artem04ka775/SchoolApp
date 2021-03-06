package com.example.perschoolapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends Activity {
    private ImageView home;
    private ImageView profile;
    private ImageView chat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        home = findViewById(R.id.home);
        home.setOnClickListener( view -> {
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
        });
        profile = findViewById(R.id.profile);
        profile.setOnClickListener( view -> {
            Intent i = new Intent(this, ProfileActivity.class);
            startActivity(i);
        });
        chat = findViewById(R.id.chat);
        chat.setOnClickListener( view -> {
            Intent i = new Intent(this, chat_activity.class);
            startActivity(i);
        });
    }

}
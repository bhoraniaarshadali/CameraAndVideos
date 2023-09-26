package com.example.cameravideo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button button1, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.cameraButton);
        button2 = findViewById(R.id.videoButton);

        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent cameraIntent = new Intent(MainActivity.this, Camera.class);
                startActivity(cameraIntent); // Start the Camera activity
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent videoIntent = new Intent(MainActivity.this, Videos.class);
                startActivity(videoIntent); // Start the Videos activity
            }
        });
    }
}

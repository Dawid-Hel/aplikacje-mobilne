package com.example.buttondisableapp;

import android.widget.Toast;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private Button buttonDisable;
    private Button buttonEnable;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonDisable = findViewById(R.id.buttonDisable);
        buttonEnable = findViewById(R.id.buttonEnable);

        buttonDisable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                buttonDisable.setEnabled(false);
                counter++;
                Toast.makeText(MainActivity.this, "Przycisk został wyłączony " + counter + " raz/y", Toast.LENGTH_SHORT).show();
            }
        });
        buttonEnable.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                buttonEnable.setEnabled(true);
                buttonDisable.setEnabled(true);
                Toast.makeText(MainActivity.this, "Przycisk został włączony", Toast.LENGTH_SHORT).show();

            }
        });
    }
}

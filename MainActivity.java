package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    Button b;
    RadioButton r1,r2,r3,r4;
    static int score=0;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=(Button) findViewById(R.id.button);
        r1=(RadioButton) findViewById(R.id.radioButton13);
        r2=(RadioButton) findViewById(R.id.radioButton14);
        r3=(RadioButton) findViewById(R.id.radioButton15);
        r4=(RadioButton) findViewById(R.id.radioButton16);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score=0;
                if(r1.isChecked())
                {
                    score++;
                }
                else
                {
                    score--;
                }
                Intent i=new Intent(MainActivity.this,Second.class);

                startActivity(i);
                finish();
            }
        });
    }
}
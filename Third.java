package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Third extends AppCompatActivity {
    Button b;
    RadioButton r1,r2,r3,r4;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        b=(Button)findViewById(R.id.Button3);
        r1=(RadioButton) findViewById(R.id.radioButton5);
        r2=(RadioButton)findViewById(R.id.radioButton6);
        r3=(RadioButton)findViewById(R.id.radioButton7);
        r4=(RadioButton)findViewById(R.id.radioButton8);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((r3.isChecked()))
                {
                    MainActivity.score++;
                    Intent i=new Intent(Third.this,Fourth.class);
                    startActivity(i);
                    finish();
                }
                else
                {
                    MainActivity.score--;
                    Intent i=new Intent(Third.this,Fourth.class);
                    startActivity(i);
                    finish();
                }
            }
        });
    }
}
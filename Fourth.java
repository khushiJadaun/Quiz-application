package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Fourth extends AppCompatActivity {
    TextView t;
    Button b;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        b=(Button) findViewById(R.id.button5);
        t=(TextView) findViewById(R.id.textView5);
        t.setText("your score"+MainActivity.score);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Fourth.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}
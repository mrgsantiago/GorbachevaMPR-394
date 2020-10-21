package com.example.gorbachevam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Form3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form3);
        ImageView home_1 = (ImageView) findViewById(R.id.imageView10);
        home_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Form3.this,MainActivity.class );
                startActivity(intent);
            }
        });
        ImageView persona = (ImageView) findViewById(R.id.imageView11);
        persona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Form3.this,SecondForm.class);
                startActivity(intent);
            }
        });
    }
}
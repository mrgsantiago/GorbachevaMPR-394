package com.example.gorbachevam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class SecondForm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_form);
        ImageView home = (ImageView) findViewById(R.id.imageView6);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent intent = new Intent(SecondForm.this,MainActivity.class );
            startActivity(intent);
            }
        });
         ImageView palette = (ImageView) findViewById(R.id.imageView4);
         palette.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent_1 = new Intent(SecondForm.this,Form3.class);
                    startActivity(intent_1);
                }
        });
    }
}
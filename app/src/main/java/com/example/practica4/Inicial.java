package com.example.practica4;

import android.content.Intent;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;

public class Inicial extends AppCompatActivity {

    private int ProgressBarStatus=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicial);

        ImageView imageView=findViewById(R.id.imageViewInicial);
        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AbrirActivity();
            }
        };
        imageView.setOnClickListener(onClickListener);

}

    private void AbrirActivity() {

        Intent intent = new Intent (this, MainActivity.class);
        startActivity(intent);
    }
    }
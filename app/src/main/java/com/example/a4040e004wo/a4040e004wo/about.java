package com.example.a4040e004wo.a4040e004wo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class about extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }

    public void retu(View view) {
        Intent intent =new Intent();
        intent.setClass(about.this, MainActivity.class);
        startActivity(intent);
    }
}

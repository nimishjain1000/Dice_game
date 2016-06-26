package com.example.nimish.dice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void single(View view) {
        Intent i=new Intent(this,MainActivity.class);
        startActivity(i);
    }
    public void multi(View view) {
        Intent i=new Intent(this,MultiPlayer.class);
        startActivity(i);
    }
    public void home(View view) {
        Intent i=new Intent(this,Help.class);
        startActivity(i);
    }



}

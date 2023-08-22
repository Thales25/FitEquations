package com.empresa.FitEquantions;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.empresa.FitEquations.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void telaMifflin(View v) {
        Intent int_Mifflin = new Intent(MainActivity.this, Mifflin.class);
        startActivity(int_Mifflin);
    }

    public void telaBenedict(View v) {
        Intent int_Benedict = new Intent(MainActivity.this, HarrisBenedict.class);
        startActivity(int_Benedict);
    }

    public void telaPollock(View v) {
        Intent int_Pollock = new Intent(MainActivity.this, JacksonPollock.class);
        startActivity(int_Pollock);
    }


}
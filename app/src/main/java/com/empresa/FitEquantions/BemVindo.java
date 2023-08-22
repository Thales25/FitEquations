package com.empresa.FitEquantions;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.empresa.FitEquations.R;

public class BemVindo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bem_vindo);

    }

    public void telaEscolha(View v) {
        Intent int_BemVindo = new Intent(BemVindo.this, MainActivity.class);
        startActivity(int_BemVindo);
    }


}
package com.empresa.FitEquantions;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.empresa.FitEquations.R;

public class Mifflin extends AppCompatActivity {
    private EditText editIdade, editPeso, editAltura;
    private RadioButton radioHomem, radioMulher;
    private TextView textResultado;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mifflin);

        editAltura = findViewById(R.id.editAltura);
        editIdade = findViewById(R.id.editIdade);
        editPeso = findViewById(R.id.editPeso);
        radioHomem = findViewById(R.id.radioHomem);
        radioMulher = findViewById(R.id.radioMulher);
        textResultado = findViewById(R.id.textResultado);

    }

    public void calcular(View view) {
        String alturaStr = editAltura.getText().toString();
        String idadeStr = editIdade.getText().toString();
        String quilogramaStr = editPeso.getText().toString();

        if (alturaStr.isEmpty() || idadeStr.isEmpty() || quilogramaStr.isEmpty()) {
            Toast.makeText(this, "Por favor, preencha todos os campos", Toast.LENGTH_SHORT).show();
            return;
        }

        if (radioHomem.isChecked()) {
            int altura = Integer.parseInt(editAltura.getText().toString());
            int idade = Integer.parseInt(editIdade.getText().toString());
            int quilograma = Integer.parseInt(editPeso.getText().toString());

            double tmb = (10 * +quilograma) + (6.25 * altura) - (5 * idade) + 5;
            textResultado.setText("O resultado é : \n" + tmb);

        } else if (radioMulher.isChecked()) {
            alturaStr = editAltura.getText().toString();
            idadeStr = editIdade.getText().toString();
            quilogramaStr = editPeso.getText().toString();

            int altura = Integer.parseInt(editAltura.getText().toString());
            int idade = Integer.parseInt(editIdade.getText().toString());
            int peso = Integer.parseInt(editPeso.getText().toString());

            double tmb = (10 * peso) + (6.25 * altura) - (5 * idade) - 161;
            textResultado.setText(" O resultado é :\n " + tmb);
        } else {
            textResultado.setText("selecione o seu genero!");
        }

    }


}
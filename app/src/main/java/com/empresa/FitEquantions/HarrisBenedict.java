package com.empresa.FitEquantions;



import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.empresa.FitEquations.R;

public class HarrisBenedict extends AppCompatActivity {
    private EditText editIdade, editPeso, editAltura;
    private RadioButton radioHomem, radioMulher;
    private TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_harris_benedict);

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
        double quilograma = 0;
        if (radioHomem.isChecked()) {
            int altura = Integer.parseInt(editAltura.getText().toString());
            int idade = Integer.parseInt(editIdade.getText().toString());

            quilograma = Double.parseDouble(editPeso.getText().toString());

            double tmb = 66.5 + (13.7 * +quilograma) + (5 * altura) - (6.8 * idade);
            textResultado.setText("Resultado: " + tmb);

        } else if (radioMulher.isChecked()) {
            alturaStr = editAltura.getText().toString();
            idadeStr = editIdade.getText().toString();
            quilogramaStr = editPeso.getText().toString();

            int altura = Integer.parseInt(editAltura.getText().toString());
            int idade = Integer.parseInt(editIdade.getText().toString());

            double peso = Double.parseDouble(editPeso.getText().toString());

            double tmb = 655.1 + (9.6 * peso) + (1.8 * altura) - (4.676 * idade);
            textResultado.setText("Resultado: " + tmb);

        } else {
            textResultado.setText("selecione o seu genero!");
        }

    }


}
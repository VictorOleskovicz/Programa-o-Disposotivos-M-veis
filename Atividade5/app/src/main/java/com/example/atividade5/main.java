package com.example.atividade5;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class main extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        EditText nome = findViewById(R.id.Nome);
        EditText matricula = findViewById(R.id.Matricula);
        EditText prova1 = findViewById(R.id.Prova1);
        EditText prova2 = findViewById(R.id.Prova2);
        Button button = findViewById(R.id.button);

        button.setOnClickListener(v -> {
            nome.getText().toString();
            String nomeString = nome.getText().toString();
            String nota1 = prova1.getText().toString();
            String nota2 = prova2.getText().toString();
            double nota1valor = Double.parseDouble(nota1);
            double nota2valor = Double.parseDouble(nota2);
            double notaFinal;

            notaFinal = (nota1valor * 0.4) + (nota2valor * 0.6);

            Toast.makeText(main.this, "A nota de " + nomeString +  "foi" + notaFinal
            , Toast.LENGTH_SHORT).show();



        });
    }
}

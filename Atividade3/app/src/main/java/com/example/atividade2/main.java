package com.example.atividade2;

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

        setContentView(R.layout.main_activity);


        //configurando edittext
        EditText name = findViewById(R.id.editTextText);
        EditText password = findViewById(R.id.editTextText2);
        Button button = findViewById(R.id.button);

        name.setText("Nome");
        password.setText("Senha");
        button.setText("Ok");


        //gettext precisa estar dentro do metodo onclicklistner
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nameString = name.getText().toString();
                String passwordString = password.getText().toString();
                if (nameString.equals("admin") && passwordString.equals("Senha")) {
                    Toast.makeText(main.this, "Parabêns", Toast.LENGTH_SHORT).show();
            }
        }

        })
    ;}
}
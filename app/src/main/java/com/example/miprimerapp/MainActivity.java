package com.example.miprimerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textoTotal;
    Button botonSumar;
    Button botonRestar;
    Integer contador = 0;
    EditText numeroInicial;

    Button botonIngresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoTotal = findViewById(R.id.textViewNumero);
        botonSumar = findViewById(R.id.buttonSumar);
        botonRestar = findViewById(R.id.buttonRestar);
        numeroInicial = findViewById(R.id.textNumeroInicial);
        botonIngresar = findViewById(R.id.buttonIngresar);

        textoTotal.setText(String.valueOf(contador));

        botonIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador = numeroInicial.getText();
            }
        });

        botonSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador = contador + 1;
                textoTotal.setText(String.valueOf(contador));
            }
        });

        botonRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(contador > 0) {
                    contador = contador -1;
                    textoTotal.setText(String.valueOf(contador));
                }
            }
        });
    }
}

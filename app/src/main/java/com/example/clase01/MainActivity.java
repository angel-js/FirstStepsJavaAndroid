package com.example.clase01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.MessageFormat;

public class MainActivity extends AppCompatActivity {

    private TextView tvResultado;
    private TextView tvVal1, tvVal2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvResultado = findViewById(R.id.tvMostrar);
        tvVal1 = findViewById(R.id.etValor1);
        tvVal2 = findViewById(R.id.etValor2);
        tvResultado.setText("Hola Mundo v2.0");

    }

    // Metodos
    public void calcular(View HelloWorld){
        int x = Integer.parseInt(tvVal1.getText().toString());
        int y = Integer.parseInt(tvVal2.getText().toString());

        tvResultado.setText(String.valueOf(x+y));
    }

    public void calcularDistancia(View Conexion){
        double x = Integer.parseInt(tvVal1.getText().toString());
        double y = Integer.parseInt(tvVal2.getText().toString());
        double rapidezKmH = Math.round((x/y));
        double mtsMin = Math.round((rapidezKmH * 1000) / 60);
        String rapidezKmHStr = String.valueOf(rapidezKmH);
        String rapidezMMStr = String.valueOf(mtsMin);
        tvResultado.setText(MessageFormat.format("{0}", rapidezKmHStr + " Km/H " + rapidezMMStr + " Mts/M"));

    }
}

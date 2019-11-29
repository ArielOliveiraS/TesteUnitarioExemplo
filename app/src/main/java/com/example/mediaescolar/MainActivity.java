package com.example.mediaescolar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText txtnota1;
    private EditText txtnota2;
    private EditText txtnota3;
    private EditText txtnota4;
    private Button calcularButton;
    private TextView resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtnota1 = findViewById(R.id.nota1);
        txtnota2 = findViewById(R.id.nota2);
        txtnota3 = findViewById(R.id.nota3);
        txtnota4 = findViewById(R.id.nota4);
        calcularButton = findViewById(R.id.btnCalcular);
        resultado = findViewById(R.id.resultado);

        calcularButton.setOnClickListener(view -> {
            Float nota1 = Float.parseFloat(txtnota1.getEditableText().toString());
            Float nota2 = Float.parseFloat(txtnota2.getEditableText().toString());
            Float nota3 = Float.parseFloat(txtnota3.getEditableText().toString());
            Float nota4 = Float.parseFloat(txtnota4.getEditableText().toString());

            Float media = calcularMedia(nota1, nota2, nota3, nota4);
            resultado.setText(String.format("Nota Final: " + media));

        });
    }


    public Float calcularMedia(Float nota1, Float nota2, Float nota3, Float nota4) {
        Float media = (nota1 + nota2 + nota3 + nota4) / 4;
        return media;
    }
}

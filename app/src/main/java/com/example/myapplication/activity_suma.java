package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class activity_suma extends AppCompatActivity {
    private EditText numero_uno, numero_dos;
    private TextView salida = (TextView)findViewById(R.id.text_salida);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suma);

        this.numero_uno = (EditText)findViewById(R.id.num_uno);//casteando
        this.numero_dos = (EditText)findViewById(R.id.num_dos);
    }

    public void operacionSuma(View view) {
        float num_unoF = Float.parseFloat(numero_uno.getText().toString());
        float num_dosF = Float.parseFloat(numero_dos.getText().toString());

        float operacion = num_unoF + num_dosF;

        this.salida.setText((int) operacion);
    }

    public void anterior(View view){
        Intent anterior = new Intent(this, MainActivity.class);
        startActivity(anterior);
    }
}
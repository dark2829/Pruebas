package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText fis, mat, qui, esp, pro;
    private TextView sal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Actividad creada", Toast.LENGTH_SHORT);//Actividad creada.

        this.fis = (EditText)findViewById(R.id.itxt_fis);
        this.mat = (EditText)findViewById(R.id.itxt_mat);
        this.qui = (EditText)findViewById(R.id.itxt_qui);
        this.esp = (EditText)findViewById(R.id.itxt_esp);
        this.pro = (EditText)findViewById(R.id.itxt_pro);
        this.sal = (TextView)findViewById(R.id.otxt_titulo);
    }

    public void estatus(View view) {
        float mat_flo = Integer.parseInt(mat.getText().toString());
        float qui_flo = Integer.parseInt(qui.getText().toString());
        float esp_flo = Integer.parseInt(esp.getText().toString());
        float pro_flo = Integer.parseInt(pro.getText().toString());
        float fis_flo = Integer.parseInt(fis.getText().toString());

        float sal_flo = (mat_flo + qui_flo + esp_flo + pro_flo + fis_flo) / 5;

        if (sal_flo >= 6){
            this.sal.setText("Estatus aprovado con "+sal_flo);
        }else{
            this.sal.setText("Estatus reprobado con "+sal_flo);
        }
    }
}
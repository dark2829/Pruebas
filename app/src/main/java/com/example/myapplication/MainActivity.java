package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText itxt_uno, itxt_dos;
    private TextView res;
    private RadioButton rb_suma, rb_resta, rb_multi, rb_divi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Actividad creada", Toast.LENGTH_SHORT);//Actividad creada.

        this.itxt_uno = (EditText)findViewById(R.id.itxt_numu);
        this.itxt_dos = (EditText)findViewById(R.id.itxt_numd);
        this.res = (TextView)findViewById(R.id.otxt_res);
        this.rb_suma = (RadioButton)findViewById(R.id.rb_su);
        this.rb_resta = (RadioButton)findViewById(R.id.rb_re);
        this.rb_multi = (RadioButton)findViewById(R.id.rb_mul);
        this.rb_divi = (RadioButton)findViewById(R.id.rb_di);
    }

    //Metodo para el boton caclular
    public void operaciones(View view){
        float itxt_uno_float = Float.parseFloat(itxt_uno.getText().toString());
        float itxt_dos_float = Float.parseFloat(itxt_dos.getText().toString());
        float operacion = 0;
        String resultado = "";
        if (rb_resta.isChecked() == true) {
            operacion = itxt_uno_float - itxt_dos_float;
        } else if (rb_suma.isChecked() == true) {
            operacion = itxt_uno_float + itxt_dos_float;
        } else if (rb_multi.isChecked() == true) {
            operacion = itxt_uno_float * itxt_dos_float;
        } else if (rb_divi.isChecked() == true) {
            if (itxt_dos_float != 0) {
                operacion = itxt_uno_float / itxt_dos_float;
            } else {
                Toast.makeText(this, "Ingresar un numero diferente de 0 en el segundo numero", Toast.LENGTH_LONG).show();
            }
        }
        resultado = String.valueOf(operacion);
        this.res.setText(resultado);
    }
}
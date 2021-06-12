package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText itxt_uno, itxt_dos;
    private TextView res;
    private CheckBox cb_suma, cb_resta, cb_multi, cb_divi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Actividad creada", Toast.LENGTH_SHORT);//Actividad creada.

        this.itxt_uno = (EditText)findViewById(R.id.itxt_numu);
        this.itxt_dos = (EditText)findViewById(R.id.itxt_numd);
        this.res = (TextView)findViewById(R.id.otxt_res);
        this.cb_suma = (CheckBox)findViewById(R.id.cb_su);
        this.cb_resta = (CheckBox)findViewById(R.id.cb_re);
        this.cb_multi = (CheckBox)findViewById(R.id.cb_mu);
        this.cb_divi = (CheckBox)findViewById(R.id.cb_di);
    }

    //Metodo para el boton caclular
    public void operaciones(View view){
        float itxt_uno_float = Float.parseFloat(itxt_uno.getText().toString());
        float itxt_dos_float = Float.parseFloat(itxt_dos.getText().toString());
        float operacion = 0;
        String resultado = "";
        if (cb_resta.isChecked() == true) {
            operacion = itxt_uno_float - itxt_dos_float;
            resultado = "La resta es:"+operacion+" / ";
        }
        if (cb_suma.isChecked() == true) {
            operacion = itxt_uno_float + itxt_dos_float;
            resultado += "La suma es:"+operacion+" /";
        }
        if (cb_multi.isChecked() == true) {
            operacion = itxt_uno_float * itxt_dos_float;
            resultado += "La multiplicacion es:"+operacion+" / ";
        }
        if (cb_divi.isChecked() == true) {
            if (itxt_dos_float != 0) {
                operacion = itxt_uno_float / itxt_dos_float;
                resultado += "La division es:"+operacion+" / ";
            } else {
                Toast.makeText(this, "Ingresar un numero diferente de 0 en el segundo numero", Toast.LENGTH_LONG).show();
            }
        }
        this.res.setText(resultado);
    }
}
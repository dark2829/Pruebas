package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText itxt_uno, itxt_dos;
    private TextView res;
    private Spinner spi_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Actividad creada", Toast.LENGTH_SHORT);//Actividad creada.

        this.itxt_uno = (EditText)findViewById(R.id.itxt_numu);
        this.itxt_dos = (EditText)findViewById(R.id.itxt_numd);
        this.res = (TextView)findViewById(R.id.otxt_res);
        spi_1 = (Spinner)findViewById(R.id.sp_op);

        String [] operaciones = {"Sumar", "Restar", "Multiplicar", "Dividir"};
        //crear un objeto y agregarle parametros de dondese quiere el spinner.
        //donde, tipo, nombre de vector
        ArrayAdapter <String> arr_ope = new ArrayAdapter<>(this, R.layout.spinner_item, operaciones);
        spi_1.setAdapter((arr_ope));//mostrar el spinner
    }

    //Metodo para el boton caclular
    public void calcular(View view){
        float itxt_float_uno = Float.parseFloat(this.itxt_uno.getText().toString());
        float itxt_float_dos = Float.parseFloat(this.itxt_dos.getText().toString());
        String selection = spi_1.getSelectedItem().toString();//castear la operacion seleccionada
        float result = 0;
        String res_tex = "";
        if(selection.equals("Sumar")){
            result = itxt_float_uno + itxt_float_dos;
        }else if(selection.equals("Restar")){
            result = itxt_float_uno - itxt_float_dos;
        }else if(selection.equals("Multiplicar")){
            result = itxt_float_uno * itxt_float_dos;
        }else if(selection.equals("Dividir")){
            if(itxt_float_dos != 0){
                result = itxt_float_uno / itxt_float_dos;
                Toast.makeText(this,"Introduce un numero difernete de 0", Toast.LENGTH_LONG).show();
            }else{
                Toast.makeText(this,"Introduce un numero difernete de 0", Toast.LENGTH_LONG).show();
            }
        }
        res_tex = String.valueOf(result);
        this.res.setText(res_tex);
    }
}
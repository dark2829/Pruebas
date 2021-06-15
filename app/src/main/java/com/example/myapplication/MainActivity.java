package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView otxt_uno;
    private ListView lv_uno;

    private String nombres[] = {"Samuel", "Valentina", "Luis", "Esli"};
    private String edades[] = {"18", "20", "30", "20"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Actividad creada", Toast.LENGTH_SHORT);//Actividad creada.

        otxt_uno = (TextView)findViewById(R.id.otxt_title);
        lv_uno = (ListView)findViewById(R.id.lv);

        ArrayAdapter <String> adapter = new ArrayAdapter<>(this, R.layout.list_view, nombres);
        lv_uno.setAdapter(adapter);

        lv_uno.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                otxt_uno.setText("La edad de "+lv_uno.getItemAtPosition(i) + " es "+edades[i] + " años");
            }
        });
    }
}
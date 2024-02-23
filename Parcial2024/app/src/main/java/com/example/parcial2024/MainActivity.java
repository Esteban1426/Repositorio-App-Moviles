package com.example.parcial2024;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {

    String datoName;
    String datoLastname;
    String datoAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText Nombre = findViewById(R.id.Name);
        EditText Apellido = findViewById(R.id.Lastname);
        EditText Edad = findViewById(R.id.Age);
        Button btnRegistrar = findViewById(R.id.Registrar);

        btnRegistrar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                datoName = Nombre.getText().toString().trim();
                datoLastname = Apellido.getText().toString().trim();
                datoAge = Edad.getText().toString().trim();

                Intent registrar = new Intent(MainActivity.this, MainActivity2.class);
                registrar.putExtra("Nombre:", datoName);
                registrar.putExtra("Apellido:", datoLastname);
                registrar.putExtra("Edad:", datoAge);

                startActivity(registrar);
            }
        });
    }
     public void irTienda (View view){
         Intent ir = new Intent(this, MainActivity2.class);
         startActivity(ir);
     }

}
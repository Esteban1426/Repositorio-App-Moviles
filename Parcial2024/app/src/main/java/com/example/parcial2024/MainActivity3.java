package com.example.parcial2024;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    String datoName;
    String datoLastname;
    String datoAge;
    String datoProduct;
    String cantidad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Intent traer = getIntent();

        TextView datoNombre = findViewById(R.id.datoName);
        TextView datoApellido = findViewById(R.id.datoLastname);
        TextView datoEdad = findViewById(R.id.datoEdad);
        TextView datoProducto = findViewById(R.id.cosa);
        TextView datoCantidad = findViewById(R.id.Numero);

        String Name = traer.getStringExtra("Nombre:");
        String Apellido = traer.getStringExtra("Apellido:");
        String Edad = traer.getStringExtra("Edad:");
        String Producto = traer.getStringExtra("Producto:");
        String Cantidad = traer.getStringExtra("Cantidad:");

        datoNombre.setText(Name);
        datoApellido.setText(Apellido);
        datoEdad.setText(Edad);
        datoProducto.setText(Producto);
        datoCantidad.setText(Cantidad);

    }
}